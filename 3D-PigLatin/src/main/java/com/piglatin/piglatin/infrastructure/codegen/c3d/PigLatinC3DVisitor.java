package com.piglatin.piglatin.infrastructure.codegen.c3d;

import com.piglatin.common.infrastructure.codegen.C3DContext;
import com.piglatin.piglatin.domain.ast.nodes.NodeImport;
import com.piglatin.piglatin.domain.ast.nodes.declaration.NodeArrayDeclaration;
import com.piglatin.piglatin.domain.ast.nodes.declaration.NodeVariableDeclaration;
import com.piglatin.piglatin.domain.ast.nodes.lvalue.NodeFieldAccess;
import com.piglatin.piglatin.domain.ast.nodes.lvalue.NodeIndexAccess;
import com.piglatin.piglatin.domain.ast.nodes.lvalue.NodeLvalue;
import com.piglatin.piglatin.domain.ast.visitor.Visitor;
import com.piglatin.piglatin.domain.ast.nodes.instruction.*;
import com.piglatin.piglatin.domain.ast.nodes.expression.*;
import com.piglatin.piglatin.domain.ast.nodes.literal.*;
import com.piglatin.piglatin.domain.ast.principal.NodeProgram;
import com.piglatin.piglatin.domain.ast.principal.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class PigLatinC3DVisitor implements Visitor<String> {

    private final C3DContext ctx;
    private int varOffset = 0;

    public PigLatinC3DVisitor(C3DContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public String visitProgram(NodeProgram n) {
        if (n.getGlobalDeclarations() != null) {
            for (ASTNode decl : n.getGlobalDeclarations()) {
                decl.accept(this);
            }
        }
        if (n.getMainInstructions() != null) {
            for (ASTNode stmt : n.getMainInstructions()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public String visitVariableDeclaration(NodeVariableDeclaration n) {
        if (n.getInitializer() != null) {
            String initVal = n.getInitializer().accept(this);
            ctx.emit("=", initVal, null, "Stack[(int)(P + " + varOffset + ")]");
        }
        varOffset++;
        return null;
    }

    @Override
    public String visitArrayDeclaration(NodeArrayDeclaration n) {
        if (n.getSizeExpression() != null) {
            String sizeVal = n.getSizeExpression().accept(this);
            String t = ctx.newTemp();
            ctx.emit("=", "H", null, t);
            ctx.emit("+", "H", sizeVal, "H");
            ctx.emit("=", t, null, "Stack[(int)(P + " + varOffset + ")]");
        }
        varOffset++;
        return null;
    }

    @Override
    public String visitAssignment(NodeAssignment n) {
        String exprVal = n.getExpression().accept(this);
        String lvalStr = n.getLvalue().accept(this);
        ctx.emit("=", exprVal, null, lvalStr);
        return null;
    }

    @Override
    public String visitRead(NodeRead n) {
        String target = n.getTarget() != null ? n.getTarget().accept(this) : "t0";
        ctx.emit("READ", null, null, target);
        return null;
    }

    @Override
    public String visitPrint(NodePrint n) {
        if (n.getPrintItems() != null) {
            for (ASTNode item : n.getPrintItems()) {
                String val = item.accept(this);
                ctx.emit("PRINT", val, null, null);
            }
        }
        return null;
    }

    @Override
    public String visitIf(NodeIf n) {
        String cond = n.getCondition().accept(this);
        String lThen = ctx.newLabel();
        String lElse = ctx.newLabel();
        String lEnd = ctx.newLabel();

        ctx.emit("IF_TRUE", cond, null, lThen);
        ctx.emit("GOTO", null, null, lElse);

        ctx.emitLabel(lThen);
        if (n.getThenBlock() != null) {
            n.getThenBlock().accept(this);
        }
        ctx.emit("GOTO", null, null, lEnd);

        ctx.emitLabel(lElse);
        if (n.getElseBlock() != null) {
            n.getElseBlock().accept(this);
        }
        if (n.getElseIfClauses() != null) {
            for (ElseIfClause elseIf : n.getElseIfClauses()) {
                String elseIfCond = elseIf.getCondition().accept(this);
                String lElseIfThen = ctx.newLabel();
                String lElseIfNext = ctx.newLabel();
                ctx.emit("IF_TRUE", elseIfCond, null, lElseIfThen);
                ctx.emit("GOTO", null, null, lElseIfNext);
                ctx.emitLabel(lElseIfThen);
                if (elseIf.getBlock() != null) {
                    elseIf.getBlock().accept(this);
                }
                ctx.emit("GOTO", null, null, lEnd);
                ctx.emitLabel(lElseIfNext);
            }
        }
        ctx.emitLabel(lEnd);
        return null;
    }

    @Override
    public String visitWhile(NodeWhile n) {
        String lStart = ctx.newLabel();
        String lBody = ctx.newLabel();
        String lEnd = ctx.newLabel();

        ctx.emitLabel(lStart);
        String cond = n.getCondition().accept(this);
        ctx.emit("IF_TRUE", cond, null, lBody);
        ctx.emit("GOTO", null, null, lEnd);

        ctx.emitLabel(lBody);
        if (n.getBlock() != null) {
            n.getBlock().accept(this);
        }
        ctx.emit("GOTO", null, null, lStart);

        ctx.emitLabel(lEnd);
        return null;
    }

    @Override
    public String visitDoWhile(NodeDoWhile n) {
        String lBody = ctx.newLabel();
        String lCond = ctx.newLabel();
        String lEnd = ctx.newLabel();

        ctx.emitLabel(lBody);
        if (n.getBlock() != null) {
            n.getBlock().accept(this);
        }
        ctx.emitLabel(lCond);
        String cond = n.getCondition().accept(this);
        ctx.emit("IF_TRUE", cond, null, lBody);

        ctx.emitLabel(lEnd);
        return null;
    }

    @Override
    public String visitFor(NodeFor n) {
        if (n.getInitialization() != null) {
            n.getInitialization().accept(this);
        }
        String lStart = ctx.newLabel();
        String lBody = ctx.newLabel();
        String lEnd = ctx.newLabel();

        ctx.emitLabel(lStart);
        if (n.getCondition() != null) {
            String cond = n.getCondition().accept(this);
            ctx.emit("IF_TRUE", cond, null, lBody);
            ctx.emit("GOTO", null, null, lEnd);
        } else {
            ctx.emit("GOTO", null, null, lBody);
        }

        ctx.emitLabel(lBody);
        if (n.getBlock() != null) {
            n.getBlock().accept(this);
        }
        if (n.getUpdate() != null) {
            n.getUpdate().accept(this);
        }
        ctx.emit("GOTO", null, null, lStart);

        ctx.emitLabel(lEnd);
        return null;
    }

    @Override
    public String visitContinue(NodeContinue n) {
        return null;
    }

    @Override
    public String visitBreak(NodeBreak n) {
        return null;
    }

    @Override
    public String visitReturn(NodeReturn n) {
        if (n.getExpression() != null) {
            String val = n.getExpression().accept(this);
            ctx.emit("=", val, null, "Stack[(int)(P)]");
        }
        return null;
    }

    @Override
    public String visitBlock(NodeBlock n) {
        if (n.getInstructions() != null) {
            for (ASTNode inst : n.getInstructions()) {
                inst.accept(this);
            }
        }
        return null;
    }

    @Override
    public String visitNewInstance(NodeNewInstance n) {
        String tAlloc = ctx.newTemp();
        ctx.emit("=", "H", null, tAlloc);
        int size = n.getArguments() != null ? n.getArguments().size() + 1 : 1;
        String tSize = ctx.newTemp();
        ctx.emit("=", String.valueOf(size), null, tSize);
        ctx.emit("+", "H", tSize, "H");
        return tAlloc;
    }

    @Override
    public String visitStructLiteral(NodeStructLiteral n) {
        return "0";
    }

    @Override
    public String visitIntegerLiteral(NodeIntegerLiteral n) {
        String t = ctx.newTemp();
        ctx.emit("=", String.valueOf(n.getValue()), null, t);
        return t;
    }

    @Override
    public String visitDecimalLiteral(NodeDecimalLiteral n) {
        String t = ctx.newTemp();
        ctx.emit("=", String.valueOf(n.getValue()), null, t);
        return t;
    }

    @Override
    public String visitStringLiteral(NodeStringLiteral n) {
        String t = ctx.newTemp();
        ctx.emit("=", "\"" + n.getValue() + "\"", null, t);
        return t;
    }

    @Override
    public String visitCharLiteral(NodeCharLiteral n) {
        String t = ctx.newTemp();
        ctx.emit("=", "'" + n.getValue() + "'", null, t);
        return t;
    }

    @Override
    public String visitBooleanLiteral(NodeBooleanLiteral n) {
        String t = ctx.newTemp();
        ctx.emit("=", n.isValue() ? "1" : "0", null, t);
        return t;
    }

    @Override
    public String visitIdentifier(NodeIdentifier n) {
        String t = ctx.newTemp();
        ctx.emit("=", "Stack[(int)(P + 0)]", null, t);
        return t;
    }

    @Override
    public String visitIndexAccess(NodeIndexAccess n) {
        String idx = n.getIndexExpression() != null ? n.getIndexExpression().accept(this) : "0";
        String t = ctx.newTemp();
        ctx.emit("+", "Heap", idx, t);
        String tVal = ctx.newTemp();
        ctx.emit("=", "Heap[(int)(" + t + ")]", null, tVal);
        return tVal;
    }

    @Override
    public String visitFieldAccess(NodeFieldAccess n) {
        String t = ctx.newTemp();
        ctx.emit("=", "0", null, t);
        return t;
    }

    @Override
    public String visitBinaryOperation(NodeBinaryOperation n) {
        String left = n.getLeft().accept(this);
        String right = n.getRight().accept(this);
        String t = ctx.newTemp();
        ctx.emit(n.getOperator(), left, right, t);
        return t;
    }

    @Override
    public String visitUnaryOperation(NodeUnaryOperation n) {
        String op = n.getOperand().accept(this);
        String t = ctx.newTemp();
        ctx.emit(n.getOperator(), op, null, t);
        return t;
    }

    @Override
    public String visitIncrementDecrement(NodeIncrementDecrement n) {
        String op = n.getOperand().accept(this);
        String t = ctx.newTemp();
        ctx.emit(n.getOperation().equals("++") ? "+" : "-", op, "1", t);
        ctx.emit("=", t, null, op);
        return t;
    }

    @Override
    public String visitArrayLiteral(NodeArrayLiteral n) {
        return "0";
    }

    @Override
    public String visitLvalue(NodeLvalue n) {
        return "Stack[(int)(P + 0)]";
    }

    @Override
    public String visitImport(NodeImport n) {
        return null;
    }

    @Override
    public String visitFunctionCall(NodeFunctionCall n) {
        List<String> argTemps = new ArrayList<>();

        if (n.getArguments() != null) {
            for (ASTNode arg : n.getArguments()) {
                argTemps.add(arg.accept(this));
            }
        }

        int currentFrameSize = this.varOffset;

        for (int i = 0; i < argTemps.size(); i++) {
            ctx.emit("=", argTemps.get(i), null, "Stack[(int)(P + " + (currentFrameSize + i + 1) + ")]");
        }

        ctx.emit("+", "P", String.valueOf(currentFrameSize), "P");

        ctx.emit("GOTO", null, null, n.getFunctionName());

        String tRet = ctx.newTemp();
        ctx.emit("=", "Stack[(int)(P)]", null, tRet);

        ctx.emit("-", "P", String.valueOf(currentFrameSize), "P");

        return tRet;
    }
}
