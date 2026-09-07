// Generated from ZetarianoParser.g4 by ANTLR 4.13.2
package com.piglatin.zetariano.infrastructure.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZetarianoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZetarianoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ZetarianoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(ZetarianoParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(ZetarianoParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldDeclaration}
	 * labeled alternative in {@link ZetarianoParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ZetarianoParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDeclaration}
	 * labeled alternative in {@link ZetarianoParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ZetarianoParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link ZetarianoParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ZetarianoParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(ZetarianoParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ZetarianoParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(ZetarianoParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDouble}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDouble(ZetarianoParser.TypeDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(ZetarianoParser.TypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(ZetarianoParser.TypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(ZetarianoParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(ZetarianoParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ZetarianoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementVariableDeclaration}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclaration(ZetarianoParser.StatementVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(ZetarianoParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(ZetarianoParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSwitch}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(ZetarianoParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementFor}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(ZetarianoParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementWhile}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(ZetarianoParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDoWhile}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDoWhile(ZetarianoParser.StatementDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementReturn}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(ZetarianoParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(ZetarianoParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementContinue}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(ZetarianoParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrint(ZetarianoParser.StatementPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementRead}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRead(ZetarianoParser.StatementReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementObjectCreation(ZetarianoParser.StatementObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(ZetarianoParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementEmpty}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementEmpty(ZetarianoParser.StatementEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationSimple}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationSimple(ZetarianoParser.VariableDeclarationSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationArray}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationArray(ZetarianoParser.VariableDeclarationArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationMatrix}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationMatrix(ZetarianoParser.VariableDeclarationMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationObject}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationObject(ZetarianoParser.VariableDeclarationObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitializer}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ZetarianoParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitializerNew}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializerNew(ZetarianoParser.ArrayInitializerNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitializerMatrix}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializerMatrix(ZetarianoParser.ArrayInitializerMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#object_creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreation(ZetarianoParser.ObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentSimple}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentSimple(ZetarianoParser.AssignmentSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentPlus}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentPlus(ZetarianoParser.AssignmentPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentMinus}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentMinus(ZetarianoParser.AssignmentMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentMult}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentMult(ZetarianoParser.AssignmentMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentSplit}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentSplit(ZetarianoParser.AssignmentSplitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentIncrement}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentIncrement(ZetarianoParser.AssignmentIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentDecrement}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentDecrement(ZetarianoParser.AssignmentDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link ZetarianoParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(ZetarianoParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructAccess}
	 * labeled alternative in {@link ZetarianoParser#struct_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructAccess(ZetarianoParser.StructAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ZetarianoParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ZetarianoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link ZetarianoParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ZetarianoParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseStatement}
	 * labeled alternative in {@link ZetarianoParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(ZetarianoParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultStatement}
	 * labeled alternative in {@link ZetarianoParser#default_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(ZetarianoParser.DefaultStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ZetarianoParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ZetarianoParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitVariable}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitVariable(ZetarianoParser.ForInitVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitAssignment}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitAssignment(ZetarianoParser.ForInitAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitEmpty}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitEmpty(ZetarianoParser.ForInitEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCondition}
	 * labeled alternative in {@link ZetarianoParser#for_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(ZetarianoParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateAssignment}
	 * labeled alternative in {@link ZetarianoParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateAssignment(ZetarianoParser.ForUpdateAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateExpression}
	 * labeled alternative in {@link ZetarianoParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateExpression(ZetarianoParser.ForUpdateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ZetarianoParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ZetarianoParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link ZetarianoParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ZetarianoParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link ZetarianoParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ZetarianoParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link ZetarianoParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ZetarianoParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link ZetarianoParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ZetarianoParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintlnStatement}
	 * labeled alternative in {@link ZetarianoParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(ZetarianoParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link ZetarianoParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ZetarianoParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadlnStatement}
	 * labeled alternative in {@link ZetarianoParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadlnStatement(ZetarianoParser.ReadlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrimary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrimary(ZetarianoParser.ExprPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTernary(ZetarianoParser.ExprTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(ZetarianoParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultiplicative}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiplicative(ZetarianoParser.ExprMultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(ZetarianoParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogicalOr}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicalOr(ZetarianoParser.ExprLogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(ZetarianoParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquality(ZetarianoParser.ExprEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdditive}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdditive(ZetarianoParser.ExprAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogicalAnd}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicalAnd(ZetarianoParser.ExprLogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPostfix(ZetarianoParser.ExprPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryInteger}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryInteger(ZetarianoParser.PrimaryIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryDecimal}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryDecimal(ZetarianoParser.PrimaryDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryString}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryString(ZetarianoParser.PrimaryStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryChar}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryChar(ZetarianoParser.PrimaryCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryTrue}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryTrue(ZetarianoParser.PrimaryTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryFalse}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryFalse(ZetarianoParser.PrimaryFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryNull}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNull(ZetarianoParser.PrimaryNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryArrayAccess}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryArrayAccess(ZetarianoParser.PrimaryArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryStructAccess}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStructAccess(ZetarianoParser.PrimaryStructAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryMethodCall}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryMethodCall(ZetarianoParser.PrimaryMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryId}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryId(ZetarianoParser.PrimaryIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryObjectCreation(ZetarianoParser.PrimaryObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link ZetarianoParser#logical_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(ZetarianoParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link ZetarianoParser#logical_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(ZetarianoParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ZetarianoParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityRelational(ZetarianoParser.EqualityRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalAdditive}
	 * labeled alternative in {@link ZetarianoParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalAdditive(ZetarianoParser.RelationalAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveMultiplicative}
	 * labeled alternative in {@link ZetarianoParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveMultiplicative(ZetarianoParser.AdditiveMultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeUnary}
	 * labeled alternative in {@link ZetarianoParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeUnary(ZetarianoParser.MultiplicativeUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefix}
	 * labeled alternative in {@link ZetarianoParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefix(ZetarianoParser.UnaryPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfix}
	 * labeled alternative in {@link ZetarianoParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfix(ZetarianoParser.UnaryPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixPrimary}
	 * labeled alternative in {@link ZetarianoParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixPrimary(ZetarianoParser.PostfixPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link ZetarianoParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ZetarianoParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link ZetarianoParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ZetarianoParser.ArgumentListContext ctx);
}