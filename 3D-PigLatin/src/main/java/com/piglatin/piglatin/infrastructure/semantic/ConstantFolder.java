package com.piglatin.piglatin.infrastructure.semantic;

import com.piglatin.piglatin.domain.ast.nodes.NodeImport;
import com.piglatin.piglatin.domain.ast.nodes.declaration.*;
import com.piglatin.piglatin.domain.ast.nodes.expression.*;
import com.piglatin.piglatin.domain.ast.nodes.instruction.*;
import com.piglatin.piglatin.domain.ast.nodes.literal.*;
import com.piglatin.piglatin.domain.ast.nodes.lvalue.*;
import com.piglatin.piglatin.domain.ast.principal.*;
import com.piglatin.piglatin.domain.ast.visitor.Visitor;
import com.piglatin.piglatin.domain.symboltable.Symbol;
import com.piglatin.piglatin.domain.symboltable.SymbolTable;
import com.piglatin.piglatin.domain.symboltable.VariableSymbol;

/**
 * This class evaluate expressions just in time using the visitor (again -_-)
 */

public class ConstantFolder implements Visitor<Object> {

    private final SemanticErrorReporter errorReporter;
    private final SymbolTable symbolTable;

    public ConstantFolder(SemanticErrorReporter errorReporter, SymbolTable symbolTable) {
        this.errorReporter = errorReporter;
        this.symbolTable = symbolTable;
    }

    //* Method for evaluate a node
    public Object evaluate(ASTNode node) {
        if (node == null) return null;
        return node.accept(this);
    }

    @Override
    public Object visitProgram(NodeProgram n) {
        return null;
    }

    @Override
    public Object visitVariableDeclaration(NodeVariableDeclaration n) {
        return null;
    }

    @Override
    public Object visitArrayDeclaration(NodeArrayDeclaration n) {
        return null;
    }

    @Override
    public Object visitAssignment(NodeAssignment n) {
        return null;
    }

    @Override
    public Object visitRead(NodeRead n) {
        return null;
    }

    @Override
    public Object visitPrint(NodePrint n) {
        return null;
    }

    @Override
    public Object visitIf(NodeIf n) {
        return null;
    }

    @Override
    public Object visitWhile(NodeWhile n) {
        return null;
    }

    @Override
    public Object visitDoWhile(NodeDoWhile n) {
        return null;
    }

    @Override
    public Object visitFor(NodeFor n) {
        return null;
    }

    @Override
    public Object visitContinue(NodeContinue n) {
        return null;
    }

    @Override
    public Object visitBreak(NodeBreak n) {
        return null;
    }

    @Override
    public Object visitReturn(NodeReturn n) {
        return null;
    }

    @Override
    public Object visitBlock(NodeBlock n) {
        return null;
    }

    @Override
    public Object visitNewInstance(NodeNewInstance n) {
        return null;
    }

    @Override
    public Object visitStructLiteral(NodeStructLiteral n) {
        return null;
    }

    @Override
    public Object visitIntegerLiteral(NodeIntegerLiteral n) {
        return null;
    }

    @Override
    public Object visitDecimalLiteral(NodeDecimalLiteral n) {
        return null;
    }

    @Override
    public Object visitStringLiteral(NodeStringLiteral n) {
        return null;
    }

    @Override
    public Object visitCharLiteral(NodeCharLiteral n) {
        return null;
    }

    @Override
    public Object visitBooleanLiteral(NodeBooleanLiteral n) {
        return null;
    }

    @Override
    public Object visitIdentifier(NodeIdentifier n) {
        return null;
    }

    @Override
    public Object visitIndexAccess(NodeIndexAccess n) {
        return null;
    }

    @Override
    public Object visitFieldAccess(NodeFieldAccess n) {
        return null;
    }

    @Override
    public Object visitBinaryOperation(NodeBinaryOperation n) {
        return null;
    }

    @Override
    public Object visitUnaryOperation(NodeUnaryOperation n) {
        return null;
    }

    @Override
    public Object visitIncrementDecrement(NodeIncrementDecrement n) {
        return null;
    }

    @Override
    public Object visitArrayLiteral(NodeArrayLiteral n) {
        return null;
    }

    @Override
    public Object visitLvalue(NodeLvalue n) {
        return null;
    }

    @Override
    public Object visitImport(NodeImport n) {
        return null;
    }

    @Override
    public Object visitFunctionCall(NodeFunctionCall n) {
        return null;
    }
}