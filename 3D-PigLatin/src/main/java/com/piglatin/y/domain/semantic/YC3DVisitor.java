package com.piglatin.y.domain.semantic;

import com.piglatin.common.infrastructure.codegen.C3DContext;
import com.piglatin.y.domain.ast.expressions.*;
import com.piglatin.y.domain.ast.principal.ASTNode;
import com.piglatin.y.domain.ast.principal.NodeProgram;
import com.piglatin.y.domain.ast.statements.*;
import com.piglatin.y.domain.ast.visitor.Visitor;
import com.piglatin.y.domain.symboltable.*;
import com.piglatin.y.domain.types.TypeTable;

import java.util.*;

public class YC3DVisitor implements Visitor<String> {

    private final SymbolTable symbolTable;
    private final TypeTable typeTable;
    private final C3DContext context;
    private final ConstantFolder constantFolder;

    private int frameOffset = 0;

    private String currentFunctionReturnType;
    private String currentReturnLabel;

    private final Map<String, Integer> structSizes = new HashMap<>();
    private final Map<String, NodeStructureDefinition> structDefsByName = new HashMap<>();

    private final Map<String, int[]> arrayDims = new HashMap<>();
    private final Set<String> byRefArrays = new HashSet<>();

    private final Deque<String> breakLabels = new ArrayDeque<>();
    private final Deque<String> continueLabels = new ArrayDeque<>();

    public YC3DVisitor(SymbolTable symbolTable, TypeTable typeTable, C3DContext context,
                       SemanticErrorReporter errorReporter) {
        this.symbolTable = symbolTable;
        this.typeTable = typeTable;
        this.context = context;
        this.constantFolder = new ConstantFolder(errorReporter);
    }

    public String generate(NodeProgram program) {
        return program.accept(this);
    }

    private static final class Addr {
        final String base;
        final int constOffset;
        final String dynOffset;
        final String type;

        Addr(String base, int constOffset, String dynOffset, String type) {
            this.base = base;
            this.constOffset = constOffset;
            this.dynOffset = dynOffset;
            this.type = type;
        }
    }

    private String rawAddress(Addr a) {
        StringBuilder sb = new StringBuilder(a.base);
        if (a.constOffset != 0) sb.append("+").append(a.constOffset);
        if (a.dynOffset != null) sb.append("+").append(a.dynOffset);
        return sb.toString();
    }

    private String addrText(Addr a) {
        return "Stack[(int)(" + rawAddress(a) + ")]";
    }

    private void emitBlockCopy(Addr src, Addr dst, int size) {
        for (int k = 0; k < size; k++) {
            String s = addrText(new Addr(src.base, src.constOffset + k, src.dynOffset, null));
            String d = addrText(new Addr(dst.base, dst.constOffset + k, dst.dynOffset, null));
            context.emit("=", s, null, d);
        }
    }

    private String typeOfSymbol(Symbol sym) {
        if (sym == null) return null;
        if (sym instanceof VariableSymbol vs) return vs.getType();
        if (sym instanceof ArraySymbol as) return as.getElementType();
        if (sym instanceof StructureSymbol ss) return ss.getName();
        return null;
    }

    private boolean isUserStruct(String type) {
        return type != null && typeTable.isUserDefined(type);
    }

    private int sizeOfType(String type) {
        if (type == null) return 1;
        Integer cached = structSizes.get(type);
        if (cached != null) return cached;
        if (!typeTable.isUserDefined(type)) return 1;
        NodeStructureDefinition def = structDefsByName.get(type);
        if (def == null) return 1;
        return computeStructLayout(def);
    }

    private int computeStructLayout(NodeStructureDefinition def) {
        Integer cached = structSizes.get(def.getName());
        if (cached != null) return cached;

        int offset = 0;
        if (def.getFields() != null) {
            for (NodeFieldDeclaration field : def.getFields()) {
                if (field == null) continue;
                int elemSize = sizeOfType(field.getType());
                int fieldSize = field.isArray() ? elemSize * field.getArraySize() : elemSize;

                Symbol fieldSymbol;
                if (field.isArray()) {
                    fieldSymbol = new ArraySymbol(field.getFieldName(), field.getType(), 1,
                            field.getLine(), field.getColumn());
                } else {
                    boolean isStructType = typeTable.isUserDefined(field.getType());
                    fieldSymbol = new VariableSymbol(field.getFieldName(), field.getType(),
                            false, isStructType, field.getLine(), field.getColumn());
                }
                fieldSymbol.setOffset(offset);
                fieldSymbol.setSize(fieldSize);
                symbolTable.declareField(def.getName(), field.getFieldName(), fieldSymbol);
                offset += fieldSize;
            }
        }
        structSizes.put(def.getName(), offset);
        return offset;
    }

    private String mangledFunctionName(String name, int arity) {
        return name + "_" + arity;
    }

    private Addr resolveAddr(ASTNode node) {
        if (node instanceof NodeIdentifier id) {
            Symbol sym = symbolTable.lookup(id.getId());
            String type = typeOfSymbol(sym);
            int offset = sym != null ? sym.getOffset() : 0;
            if (byRefArrays.contains(id.getId())) {
                String ptrTemp = context.newTemp();
                context.emit("=", "Stack[(int)(P+" + offset + ")]", null, ptrTemp);
                return new Addr(ptrTemp, 0, null, type);
            }
            return new Addr("P", offset, null, type);
        }
        if (node instanceof NodeFieldAccess fa) {
            Addr base = resolveAddr(fa.getCurrentNode());
            Symbol fieldSym = symbolTable.lookupField(base.type, fa.getFieldName());
            String fieldType = typeOfSymbol(fieldSym);
            int fieldOffset = fieldSym != null ? fieldSym.getOffset() : 0;
            return new Addr(base.base, base.constOffset + fieldOffset, base.dynOffset, fieldType);
        }
        if (node instanceof NodeIndexAccess ia) {
            return resolveIndexChain(ia);
        }
        if (node instanceof NodeFunctionCall fc) {
            Addr result = doCall(fc);
            return result != null ? result : new Addr("P", 0, null, null);
        }
        return new Addr("P", 0, null, null);
    }

    private Addr resolveIndexChain(NodeIndexAccess outer) {
        List<ASTNode> indices = new ArrayList<>();
        ASTNode cur = outer;
        while (cur instanceof NodeIndexAccess ia) {
            indices.add(0, ia.getIndexExpression());
            cur = ia.getCurrentNode();
        }

        Addr base = resolveAddr(cur);
        String elemType = base.type;
        int elemSize = sizeOfType(elemType);

        int[] dims = (cur instanceof NodeIdentifier baseId) ? arrayDims.get(baseId.getId()) : null;

        String dyn = base.dynOffset;
        for (int i = 0; i < indices.size(); i++) {
            String idxPlace = indices.get(i).accept(this);
            int stride = elemSize;
            if (dims != null) {
                for (int k = i + 1; k < dims.length; k++) stride *= dims[k];
            }
            String term = idxPlace;
            if (stride != 1) {
                String t = context.newTemp();
                context.emit("*", idxPlace, String.valueOf(stride), t);
                term = t;
            }
            if (dyn == null) {
                dyn = term;
            } else {
                String t2 = context.newTemp();
                context.emit("+", dyn, term, t2);
                dyn = t2;
            }
        }
        return new Addr(base.base, base.constOffset, dyn, elemType);
    }

    @Override
    public String visitProgram(NodeProgram n) {
        if (n == null) return null;

        symbolTable.pushScope("global");

        if (n.getStructures() != null) {
            for (NodeStructureDefinition s : n.getStructures()) {
                if (s != null) structDefsByName.put(s.getName(), s);
            }
            for (NodeStructureDefinition s : n.getStructures()) {
                if (s != null) computeStructLayout(s);
            }
        }

        if (n.getFunctions() != null) {
            for (NodeFunctionDefinition f : n.getFunctions()) {
                if (f != null) f.accept(this);
            }
        }

        symbolTable.popScope();
        return null;
    }

    @Override
    public String visitStructureDefinition(NodeStructureDefinition n) {
        if (n == null) return null;
        structDefsByName.put(n.getName(), n);
        computeStructLayout(n);
        return null;
    }

    @Override
    public String visitFieldDeclaration(NodeFieldDeclaration n) {
        return null;
    }

    @Override
    public String visitFunctionDefinition(NodeFunctionDefinition n) {
        if (n == null) return null;

        int arity = n.getParameters() != null ? n.getParameters().size() : 0;
        String mangled = mangledFunctionName(n.getName(), arity);

        symbolTable.pushScope("func_" + mangled);
        arrayDims.clear();
        byRefArrays.clear();

        String savedReturnLabel = currentReturnLabel;
        String savedReturnType = currentFunctionReturnType;
        int savedFrameOffset = frameOffset;

        currentFunctionReturnType = n.getReturnType();
        currentReturnLabel = "L_RET_" + mangled;

        boolean isVoid = currentFunctionReturnType == null || "void".equals(currentFunctionReturnType);
        int returnSlotSize = isVoid ? 0 : sizeOfType(currentFunctionReturnType);
        frameOffset = Math.max(returnSlotSize, 1);

        context.emitLabel(mangled);
        declareParameters(n.getParameters());
        if (n.getBlock() != null) n.getBlock().accept(this);
        context.emitLabel(currentReturnLabel);

        currentReturnLabel = savedReturnLabel;
        currentFunctionReturnType = savedReturnType;
        frameOffset = savedFrameOffset;
        symbolTable.popScope();
        return null;
    }

    private void declareParameters(List<NodeParameter> params) {
        if (params == null) return;
        for (NodeParameter p : params) {
            if (p == null) continue;

            int offset = frameOffset;
            int size;
            Symbol sym;

            if (p.isArray()) {
                //* By reference: a single cell holding the caller's absolute Stack index.
                size = 1;
                sym = new ArraySymbol(p.getName(), p.getType(), 1, p.getLine(), p.getColumn());
                byRefArrays.add(p.getName());
            } else if (p.isStruct() || typeTable.isUserDefined(p.getType())) {
                size = sizeOfType(p.getType());
                sym = new VariableSymbol(p.getName(), p.getType(), false, true, p.getLine(), p.getColumn());
            } else {
                size = 1;
                sym = new VariableSymbol(p.getName(), p.getType(), false, false, p.getLine(), p.getColumn());
            }

            sym.setOffset(offset);
            sym.setSize(size);
            symbolTable.declare(p.getName(), sym);
            frameOffset += size;
        }
    }

    @Override
    public String visitParameter(NodeParameter n) {
        //* Parameter is already declared in declareParameters().
        return null;
    }

    private Addr doCall(NodeFunctionCall n) {
        int arity = n.getArguments() != null ? n.getArguments().size() : 0;
        FunctionSymbol fn = symbolTable.lookupFunction(n.getFunctionName(), arity);
        String mangled = mangledFunctionName(n.getFunctionName(), arity);
        String returnType = fn != null ? fn.getReturnType() : null;
        boolean isVoidCall = returnType == null || "void".equals(returnType);
        int returnSlotSize = isVoidCall ? 0 : sizeOfType(returnType);
        int paramOffset = Math.max(returnSlotSize, 1);

        String savedP = context.newTemp();
        context.emit("=", "P", null, savedP);
        String newP = context.newTemp();
        context.emit("+", "P", String.valueOf(frameOffset), newP);

        List<ASTNode> args = n.getArguments() != null ? n.getArguments() : Collections.emptyList();
        List<ParameterType> paramTypes = fn != null ? fn.getParameterTypes() : Collections.emptyList();

        for (int i = 0; i < args.size(); i++) {
            ASTNode arg = args.get(i);
            ParameterType pt = i < paramTypes.size() ? paramTypes.get(i) : null;
            String destCell = "Stack[(int)(" + newP + "+" + paramOffset + ")]";

            if (pt != null && pt.isArray()) {
                context.emit("=", rawAddress(resolveAddr(arg)), null, destCell);
                paramOffset += 1;
            } else if (pt != null && pt.isStruct()) {
                int sz = sizeOfType(pt.getType());
                emitBlockCopy(resolveAddr(arg), new Addr(newP, paramOffset, null, pt.getType()), sz);
                paramOffset += sz;
            } else {
                String value = arg != null ? arg.accept(this) : "0";
                context.emit("=", value, null, destCell);
                paramOffset += 1;
            }
        }

        context.emit("=", newP, null, "P");
        context.emit("=", mangled + "()", null, "_disc");

        String scalarResult = null;
        int structScratchOffset = -1;
        int structSize = 0;
        if (!isVoidCall) {
            if (isUserStruct(returnType)) {
                structSize = sizeOfType(returnType);
                structScratchOffset = frameOffset;
                frameOffset += structSize;
            } else {
                scalarResult = context.newTemp();
                context.emit("=", "Stack[(int)(" + newP + "+0)]", null, scalarResult);
            }
        }

        context.emit("=", savedP, null, "P");

        if (isVoidCall) return null;
        if (isUserStruct(returnType)) {
            Addr dst = new Addr("P", structScratchOffset, null, returnType);
            emitBlockCopy(new Addr(newP, 0, null, returnType), dst, structSize);
            return dst;
        }
        return new Addr(scalarResult, 0, null, returnType);
    }

    @Override
    public String visitFunctionCall(NodeFunctionCall n) {
        if (n == null) return null;
        Addr result = doCall(n);
        return result != null ? addrText(result) : null;
    }

    @Override
    public String visitBlock(NodeBlock n) {
        if (n == null) return null;
        symbolTable.pushScope("block");
        if (n.getInstructions() != null) {
            for (ASTNode instruction : n.getInstructions()) {
                if (instruction != null) instruction.accept(this);
            }
        }
        symbolTable.popScope();
        return null;
    }

    @Override
    public String visitVariableDeclaration(NodeVariableDeclaration n) {
        if (n == null) return null;

        boolean isStructType = typeTable.isUserDefined(n.getType());
        int size = sizeOfType(n.getType());
        int offset = frameOffset;
        frameOffset += size;

        VariableSymbol sym = new VariableSymbol(n.getName(), n.getType(), false, isStructType,
                n.getLine(), n.getColumn());
        sym.setOffset(offset);
        sym.setSize(size);
        symbolTable.declare(n.getName(), sym);

        if (n.getInitializer() != null) {
            Addr dst = new Addr("P", offset, null, n.getType());
            if (isStructType) {
                emitBlockCopy(resolveAddr(n.getInitializer()), dst, size);
            } else {
                String value = n.getInitializer().accept(this);
                context.emit("=", value, null, addrText(dst));
            }
        }
        return null;
    }

    @Override
    public String visitArrayDeclaration(NodeArrayDeclaration n) {
        if (n == null) return null;

        List<Integer> dims = new ArrayList<>();
        if (n.getDimensions() != null) {
            for (ASTNode d : n.getDimensions()) {
                Object v = d != null ? constantFolder.evaluate(d) : null;
                dims.add(v instanceof Integer i ? i : 1);
            }
        }
        if (dims.isEmpty()) dims.add(1);

        int elemSize = sizeOfType(n.getType());
        int[] dimArr = new int[dims.size()];
        int totalElems = 1;
        for (int i = 0; i < dims.size(); i++) {
            dimArr[i] = dims.get(i);
            totalElems *= dims.get(i);
        }
        int size = totalElems * elemSize;

        int offset = frameOffset;
        frameOffset += size;

        ArraySymbol sym = new ArraySymbol(n.getName(), n.getType(), dims.size(), n.getLine(), n.getColumn());
        sym.setOffset(offset);
        sym.setSize(size);
        symbolTable.declare(n.getName(), sym);
        arrayDims.put(n.getName(), dimArr);

        if (n.getInitializer() != null) {
            List<ASTNode> flat = new ArrayList<>();
            flattenArrayLiteral(n.getInitializer(), flat);
            for (int i = 0; i < flat.size() && i < totalElems; i++) {
                String value = flat.get(i).accept(this);
                Addr cell = new Addr("P", offset + i * elemSize, null, n.getType());
                context.emit("=", value, null, addrText(cell));
            }
        }
        return null;
    }

    private void flattenArrayLiteral(ASTNode node, List<ASTNode> out) {
        if (node instanceof NodeArrayLiteral lit) {
            if (lit.getElements() != null) {
                for (ASTNode e : lit.getElements()) flattenArrayLiteral(e, out);
            }
        } else if (node != null) {
            out.add(node);
        }
    }

    @Override
    public String visitAssignment(NodeAssignment n) {
        if (n == null) return null;

        Addr target = resolveAddr(n.getLvalue());
        String targetText = addrText(target);
        String op = n.getOperator();

        if ("++".equals(op) || "--".equals(op)) {
            context.emit("++".equals(op) ? "+" : "-", targetText, "1", targetText);
            return null;
        }

        if (isUserStruct(target.type)) {
            Addr src = resolveAddr(n.getExpression());
            emitBlockCopy(src, target, sizeOfType(target.type));
        } else {
            String value = n.getExpression() != null ? n.getExpression().accept(this) : "0";
            context.emit("=", value, null, targetText);
        }
        return null;
    }

    @Override
    public String visitRead(NodeRead n) {
        String t = context.newTemp();
        context.emit("READ", null, null, t);
        return t;
    }

    @Override
    public String visitPrint(NodePrint n) {
        if (n == null) return null;
        if (n.getExpressions() != null) {
            for (ASTNode expr : n.getExpressions()) {
                if (expr == null) continue;
                String place = expr.accept(this);
                context.emit("PRINT", place, null, null);
            }
        }
        return null;
    }

    @Override
    public String visitIf(NodeIf n) {
        if (n == null) return null;

        String Lend = context.newLabel();
        String cond = n.getCondition() != null ? n.getCondition().accept(this) : "1";
        String Lnext = context.newLabel();
        context.emitIfFalse(cond, Lnext);
        if (n.getThenBlock() != null) n.getThenBlock().accept(this);
        context.emitGoto(Lend);
        context.emitLabel(Lnext);

        if (n.getElseIfClauses() != null) {
            for (ElseIfClause clause : n.getElseIfClauses()) {
                if (clause == null) continue;
                String cc = clause.getCondition() != null ? clause.getCondition().accept(this) : "1";
                String Lnext2 = context.newLabel();
                context.emitIfFalse(cc, Lnext2);
                if (clause.getBlock() != null) clause.getBlock().accept(this);
                context.emitGoto(Lend);
                context.emitLabel(Lnext2);
            }
        }

        if (n.getElseBlock() != null) n.getElseBlock().accept(this);

        context.emitLabel(Lend);
        return null;
    }

    @Override
    public String visitChoose(NodeChoose n) {
        if (n == null) return null;

        String switchPlace = n.getExpression() != null ? n.getExpression().accept(this) : null;
        String Lend = context.newLabel();
        List<NodeChooseCase> cases = n.getCases() != null ? n.getCases() : Collections.emptyList();
        List<String> caseLabels = new ArrayList<>();

        for (NodeChooseCase c : cases) {
            String label = context.newLabel();
            caseLabels.add(label);
            String caseValue = (c != null && c.getValue() != null) ? c.getValue().accept(this) : "0";
            String cmp = context.newTemp();
            context.emit("==", switchPlace, caseValue, cmp);
            context.emitIfTrue(cmp, label);
        }

        String Ldefault = context.newLabel();
        context.emitGoto(Ldefault);

        for (int i = 0; i < cases.size(); i++) {
            context.emitLabel(caseLabels.get(i));
            NodeChooseCase c = cases.get(i);
            breakLabels.push(Lend);
            if (c != null && c.getBlock() != null) c.getBlock().accept(this);
            breakLabels.pop();
            context.emitGoto(Lend);
        }

        context.emitLabel(Ldefault);
        if (n.getDefaultCase() != null && n.getDefaultCase().getBlock() != null) {
            breakLabels.push(Lend);
            n.getDefaultCase().getBlock().accept(this);
            breakLabels.pop();
        }

        context.emitLabel(Lend);
        return null;
    }

    @Override
    public String visitChooseCase(NodeChooseCase n) {
        return null;
    }

    @Override
    public String visitWhile(NodeWhile n) {
        if (n == null) return null;

        String Lstart = context.newLabel();
        String Lend = context.newLabel();
        context.emitLabel(Lstart);
        String cond = n.getCondition() != null ? n.getCondition().accept(this) : "1";
        context.emitIfFalse(cond, Lend);

        breakLabels.push(Lend);
        continueLabels.push(Lstart);
        if (n.getBlock() != null) n.getBlock().accept(this);
        breakLabels.pop();
        continueLabels.pop();

        context.emitGoto(Lstart);
        context.emitLabel(Lend);
        return null;
    }

    @Override
    public String visitDoWhile(NodeDoWhile n) {
        if (n == null) return null;

        String Lstart = context.newLabel();
        String Lcond = context.newLabel();
        String Lend = context.newLabel();
        context.emitLabel(Lstart);

        breakLabels.push(Lend);
        continueLabels.push(Lcond);
        if (n.getBlock() != null) n.getBlock().accept(this);
        breakLabels.pop();
        continueLabels.pop();

        context.emitLabel(Lcond);
        String cond = n.getCondition() != null ? n.getCondition().accept(this) : "0";
        context.emitIfTrue(cond, Lstart);
        context.emitLabel(Lend);
        return null;
    }

    @Override
    public String visitFor(NodeFor n) {
        if (n == null) return null;

        symbolTable.pushScope("for");
        if (n.getInit() != null) n.getInit().accept(this);

        String Lstart = context.newLabel();
        String Lupdate = context.newLabel();
        String Lend = context.newLabel();
        context.emitLabel(Lstart);

        if (n.getCondition() != null) {
            String cond = n.getCondition().accept(this);
            context.emitIfFalse(cond, Lend);
        }

        breakLabels.push(Lend);
        continueLabels.push(Lupdate);
        if (n.getBlock() != null) n.getBlock().accept(this);
        breakLabels.pop();
        continueLabels.pop();

        context.emitLabel(Lupdate);
        if (n.getUpdate() != null) n.getUpdate().accept(this);
        context.emitGoto(Lstart);
        context.emitLabel(Lend);

        symbolTable.popScope();
        return null;
    }

    @Override
    public String visitBreak(NodeBreak n) {
        if (!breakLabels.isEmpty()) context.emitGoto(breakLabels.peek());
        return null;
    }

    @Override
    public String visitContinue(NodeContinue n) {
        if (!continueLabels.isEmpty()) context.emitGoto(continueLabels.peek());
        return null;
    }

    @Override
    public String visitReturn(NodeReturn n) {
        if (n == null) return null;

        if (n.getExpression() != null) {
            if (isUserStruct(currentFunctionReturnType)) {
                Addr src = resolveAddr(n.getExpression());
                Addr dst = new Addr("P", 0, null, currentFunctionReturnType);
                emitBlockCopy(src, dst, sizeOfType(currentFunctionReturnType));
            } else {
                String value = n.getExpression().accept(this);
                context.emit("=", value, null, "Stack[(int)P]");
            }
        }
        context.emitGoto(currentReturnLabel);
        return null;
    }

    @Override
    public String visitBinaryOperation(NodeBinaryOperation n) {
        if (n == null) return null;
        String left = n.getLeft() != null ? n.getLeft().accept(this) : "0";
        String right = n.getRight() != null ? n.getRight().accept(this) : "0";
        String t = context.newTemp();
        context.emit(n.getOperator(), left, right, t);
        return t;
    }

    @Override
    public String visitUnaryOperation(NodeUnaryOperation n) {
        if (n == null) return null;
        String operand = n.getOperand() != null ? n.getOperand().accept(this) : "0";
        String t = context.newTemp();
        context.emit(n.getOperator(), operand, null, t);
        return t;
    }

    @Override
    public String visitIdentifier(NodeIdentifier n) {
        if (n == null) return null;
        return addrText(resolveAddr(n));
    }

    @Override
    public String visitLvalue(NodeLvalue n) {
        return null;
    }

    @Override
    public String visitFieldAccess(NodeFieldAccess n) {
        if (n == null) return null;
        return addrText(resolveAddr(n));
    }

    @Override
    public String visitIndexAccess(NodeIndexAccess n) {
        if (n == null) return null;
        return addrText(resolveAddr(n));
    }

    @Override
    public String visitArrayLiteral(NodeArrayLiteral n) {
        return null;
    }


    @Override
    public String visitIntegerLiteral(NodeIntegerLiteral n) {
        return String.valueOf(n.getValue());
    }

    @Override
    public String visitFloatLiteral(NodeFloatLiteral n) {
        return String.valueOf(n.getValue());
    }

    @Override
    public String visitCharLiteral(NodeCharLiteral n) {
        return "'" + n.getValue() + "'";
    }

    @Override
    public String visitBooleanLiteral(NodeBooleanLiteral n) {
        return n.isValue() ? "1" : "0";
    }

    @Override
    public String visitStringLiteral(NodeStringLiteral n) {
        String value = n.getValue() != null ? n.getValue() : "";
        String startTemp = context.newTemp();
        context.emit("=", "H", null, startTemp);
        for (int i = 0; i < value.length(); i++) {
            context.emit("=", "'" + value.charAt(i) + "'", null, "Heap[(int)H]");
            context.emit("+", "H", "1", "H");
        }
        context.emit("=", "'\\0'", null, "Heap[(int)H]");
        context.emit("+", "H", "1", "H");
        return startTemp;
    }
}