// Generated from ZetarianoParser.g4 by ANTLR 4.13.2
package com.piglatin.zetariano.infrastructure.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZetarianoParser}.
 */
public interface ZetarianoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ZetarianoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ZetarianoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(ZetarianoParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(ZetarianoParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(ZetarianoParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(ZetarianoParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldDeclaration}
	 * labeled alternative in {@link ZetarianoParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ZetarianoParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldDeclaration}
	 * labeled alternative in {@link ZetarianoParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ZetarianoParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclaration}
	 * labeled alternative in {@link ZetarianoParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ZetarianoParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclaration}
	 * labeled alternative in {@link ZetarianoParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ZetarianoParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link ZetarianoParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ZetarianoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link ZetarianoParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ZetarianoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(ZetarianoParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(ZetarianoParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ZetarianoParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ZetarianoParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(ZetarianoParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(ZetarianoParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDouble}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDouble(ZetarianoParser.TypeDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDouble}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDouble(ZetarianoParser.TypeDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeChar(ZetarianoParser.TypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeChar(ZetarianoParser.TypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(ZetarianoParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(ZetarianoParser.TypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(ZetarianoParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(ZetarianoParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(ZetarianoParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link ZetarianoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(ZetarianoParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ZetarianoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ZetarianoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementVariableDeclaration}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclaration(ZetarianoParser.StatementVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementVariableDeclaration}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclaration(ZetarianoParser.StatementVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(ZetarianoParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(ZetarianoParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(ZetarianoParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(ZetarianoParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementSwitch}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(ZetarianoParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementSwitch}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(ZetarianoParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementFor}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(ZetarianoParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementFor}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(ZetarianoParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementWhile}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(ZetarianoParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementWhile}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(ZetarianoParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDoWhile}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDoWhile(ZetarianoParser.StatementDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDoWhile}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDoWhile(ZetarianoParser.StatementDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementReturn}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(ZetarianoParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementReturn}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(ZetarianoParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(ZetarianoParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(ZetarianoParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementContinue}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(ZetarianoParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementContinue}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(ZetarianoParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrint(ZetarianoParser.StatementPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrint(ZetarianoParser.StatementPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementRead}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementRead(ZetarianoParser.StatementReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementRead}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementRead(ZetarianoParser.StatementReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementObjectCreation(ZetarianoParser.StatementObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementObjectCreation(ZetarianoParser.StatementObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ZetarianoParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ZetarianoParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementEmpty}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementEmpty(ZetarianoParser.StatementEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementEmpty}
	 * labeled alternative in {@link ZetarianoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementEmpty(ZetarianoParser.StatementEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationSimple}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationSimple(ZetarianoParser.VariableDeclarationSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationSimple}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationSimple(ZetarianoParser.VariableDeclarationSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationArray}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationArray(ZetarianoParser.VariableDeclarationArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationArray}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationArray(ZetarianoParser.VariableDeclarationArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationMatrix}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationMatrix(ZetarianoParser.VariableDeclarationMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationMatrix}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationMatrix(ZetarianoParser.VariableDeclarationMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationObject}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationObject(ZetarianoParser.VariableDeclarationObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationObject}
	 * labeled alternative in {@link ZetarianoParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationObject(ZetarianoParser.VariableDeclarationObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitializer}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ZetarianoParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitializer}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ZetarianoParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitializerNew}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerNew(ZetarianoParser.ArrayInitializerNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitializerNew}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerNew(ZetarianoParser.ArrayInitializerNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitializerMatrix}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerMatrix(ZetarianoParser.ArrayInitializerMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitializerMatrix}
	 * labeled alternative in {@link ZetarianoParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerMatrix(ZetarianoParser.ArrayInitializerMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#object_creation}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(ZetarianoParser.ObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#object_creation}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(ZetarianoParser.ObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentSimple}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentSimple(ZetarianoParser.AssignmentSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentSimple}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentSimple(ZetarianoParser.AssignmentSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentPlus}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentPlus(ZetarianoParser.AssignmentPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentPlus}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentPlus(ZetarianoParser.AssignmentPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentMinus}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentMinus(ZetarianoParser.AssignmentMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentMinus}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentMinus(ZetarianoParser.AssignmentMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentMult}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentMult(ZetarianoParser.AssignmentMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentMult}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentMult(ZetarianoParser.AssignmentMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentSplit}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentSplit(ZetarianoParser.AssignmentSplitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentSplit}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentSplit(ZetarianoParser.AssignmentSplitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentIncrement}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentIncrement(ZetarianoParser.AssignmentIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentIncrement}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentIncrement(ZetarianoParser.AssignmentIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentDecrement}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDecrement(ZetarianoParser.AssignmentDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentDecrement}
	 * labeled alternative in {@link ZetarianoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDecrement(ZetarianoParser.AssignmentDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link ZetarianoParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ZetarianoParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link ZetarianoParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ZetarianoParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructAccess}
	 * labeled alternative in {@link ZetarianoParser#struct_access}.
	 * @param ctx the parse tree
	 */
	void enterStructAccess(ZetarianoParser.StructAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructAccess}
	 * labeled alternative in {@link ZetarianoParser#struct_access}.
	 * @param ctx the parse tree
	 */
	void exitStructAccess(ZetarianoParser.StructAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ZetarianoParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ZetarianoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ZetarianoParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ZetarianoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link ZetarianoParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ZetarianoParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link ZetarianoParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ZetarianoParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseStatement}
	 * labeled alternative in {@link ZetarianoParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(ZetarianoParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseStatement}
	 * labeled alternative in {@link ZetarianoParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(ZetarianoParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultStatement}
	 * labeled alternative in {@link ZetarianoParser#default_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(ZetarianoParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultStatement}
	 * labeled alternative in {@link ZetarianoParser#default_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(ZetarianoParser.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ZetarianoParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ZetarianoParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ZetarianoParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ZetarianoParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitVariable}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitVariable(ZetarianoParser.ForInitVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitVariable}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitVariable(ZetarianoParser.ForInitVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitAssignment}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitAssignment(ZetarianoParser.ForInitAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitAssignment}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitAssignment(ZetarianoParser.ForInitAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitEmpty}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitEmpty(ZetarianoParser.ForInitEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitEmpty}
	 * labeled alternative in {@link ZetarianoParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitEmpty(ZetarianoParser.ForInitEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCondition}
	 * labeled alternative in {@link ZetarianoParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(ZetarianoParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCondition}
	 * labeled alternative in {@link ZetarianoParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(ZetarianoParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateAssignment}
	 * labeled alternative in {@link ZetarianoParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateAssignment(ZetarianoParser.ForUpdateAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateAssignment}
	 * labeled alternative in {@link ZetarianoParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateAssignment(ZetarianoParser.ForUpdateAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateExpression}
	 * labeled alternative in {@link ZetarianoParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateExpression(ZetarianoParser.ForUpdateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateExpression}
	 * labeled alternative in {@link ZetarianoParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateExpression(ZetarianoParser.ForUpdateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ZetarianoParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ZetarianoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ZetarianoParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ZetarianoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link ZetarianoParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ZetarianoParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link ZetarianoParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ZetarianoParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link ZetarianoParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ZetarianoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link ZetarianoParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ZetarianoParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link ZetarianoParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ZetarianoParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link ZetarianoParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ZetarianoParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link ZetarianoParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ZetarianoParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link ZetarianoParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ZetarianoParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintlnStatement}
	 * labeled alternative in {@link ZetarianoParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(ZetarianoParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintlnStatement}
	 * labeled alternative in {@link ZetarianoParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(ZetarianoParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link ZetarianoParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ZetarianoParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link ZetarianoParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ZetarianoParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadlnStatement}
	 * labeled alternative in {@link ZetarianoParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterReadlnStatement(ZetarianoParser.ReadlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadlnStatement}
	 * labeled alternative in {@link ZetarianoParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitReadlnStatement(ZetarianoParser.ReadlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrimary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPrimary(ZetarianoParser.ExprPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrimary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPrimary(ZetarianoParser.ExprPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprTernary(ZetarianoParser.ExprTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprTernary(ZetarianoParser.ExprTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(ZetarianoParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(ZetarianoParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultiplicative}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiplicative(ZetarianoParser.ExprMultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultiplicative}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiplicative(ZetarianoParser.ExprMultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(ZetarianoParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(ZetarianoParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogicalOr}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogicalOr(ZetarianoParser.ExprLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogicalOr}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogicalOr(ZetarianoParser.ExprLogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(ZetarianoParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(ZetarianoParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprEquality(ZetarianoParser.ExprEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprEquality(ZetarianoParser.ExprEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdditive}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAdditive(ZetarianoParser.ExprAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdditive}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAdditive(ZetarianoParser.ExprAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogicalAnd}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogicalAnd(ZetarianoParser.ExprLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogicalAnd}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogicalAnd(ZetarianoParser.ExprLogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPostfix(ZetarianoParser.ExprPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link ZetarianoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPostfix(ZetarianoParser.ExprPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryInteger}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryInteger(ZetarianoParser.PrimaryIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryInteger}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryInteger(ZetarianoParser.PrimaryIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryDecimal}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryDecimal(ZetarianoParser.PrimaryDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryDecimal}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryDecimal(ZetarianoParser.PrimaryDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryString}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryString(ZetarianoParser.PrimaryStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryString}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryString(ZetarianoParser.PrimaryStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryChar}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryChar(ZetarianoParser.PrimaryCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryChar}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryChar(ZetarianoParser.PrimaryCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryTrue}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryTrue(ZetarianoParser.PrimaryTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryTrue}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryTrue(ZetarianoParser.PrimaryTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryFalse}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryFalse(ZetarianoParser.PrimaryFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryFalse}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryFalse(ZetarianoParser.PrimaryFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryNull}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNull(ZetarianoParser.PrimaryNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryNull}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNull(ZetarianoParser.PrimaryNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryArrayAccess}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryArrayAccess(ZetarianoParser.PrimaryArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryArrayAccess}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryArrayAccess(ZetarianoParser.PrimaryArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryStructAccess}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStructAccess(ZetarianoParser.PrimaryStructAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryStructAccess}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStructAccess(ZetarianoParser.PrimaryStructAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryMethodCall}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryMethodCall(ZetarianoParser.PrimaryMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryMethodCall}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryMethodCall(ZetarianoParser.PrimaryMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryId}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryId(ZetarianoParser.PrimaryIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryId}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryId(ZetarianoParser.PrimaryIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryObjectCreation(ZetarianoParser.PrimaryObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryObjectCreation}
	 * labeled alternative in {@link ZetarianoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryObjectCreation(ZetarianoParser.PrimaryObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link ZetarianoParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(ZetarianoParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link ZetarianoParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(ZetarianoParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link ZetarianoParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(ZetarianoParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link ZetarianoParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(ZetarianoParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ZetarianoParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEqualityRelational(ZetarianoParser.EqualityRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ZetarianoParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEqualityRelational(ZetarianoParser.EqualityRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalAdditive}
	 * labeled alternative in {@link ZetarianoParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelationalAdditive(ZetarianoParser.RelationalAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalAdditive}
	 * labeled alternative in {@link ZetarianoParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelationalAdditive(ZetarianoParser.RelationalAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveMultiplicative}
	 * labeled alternative in {@link ZetarianoParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveMultiplicative(ZetarianoParser.AdditiveMultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveMultiplicative}
	 * labeled alternative in {@link ZetarianoParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveMultiplicative(ZetarianoParser.AdditiveMultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeUnary}
	 * labeled alternative in {@link ZetarianoParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeUnary(ZetarianoParser.MultiplicativeUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeUnary}
	 * labeled alternative in {@link ZetarianoParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeUnary(ZetarianoParser.MultiplicativeUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefix}
	 * labeled alternative in {@link ZetarianoParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefix(ZetarianoParser.UnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefix}
	 * labeled alternative in {@link ZetarianoParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefix(ZetarianoParser.UnaryPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfix}
	 * labeled alternative in {@link ZetarianoParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfix(ZetarianoParser.UnaryPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfix}
	 * labeled alternative in {@link ZetarianoParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfix(ZetarianoParser.UnaryPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixPrimary}
	 * labeled alternative in {@link ZetarianoParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfixPrimary(ZetarianoParser.PostfixPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixPrimary}
	 * labeled alternative in {@link ZetarianoParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfixPrimary(ZetarianoParser.PostfixPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link ZetarianoParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ZetarianoParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link ZetarianoParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ZetarianoParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link ZetarianoParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ZetarianoParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link ZetarianoParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ZetarianoParser.ArgumentListContext ctx);
}