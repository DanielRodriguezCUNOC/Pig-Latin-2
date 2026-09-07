parser grammar ZetarianoParser;

options { tokenVocab = ZetarianoLexer; }

// Entry point
program
    :   class_declaration EOF
    ;

// Class declaration
class_declaration
    :   PUBLIC CLASS ID LEFT_BRACE class_body RIGHT_BRACE
    ;

class_body
    :   (field_declaration | constructor_declaration | method_declaration)*
    ;

// Field declaration
field_declaration
    :   type ID SEMICOLON                                   #FieldDeclaration
    ;

// Constructor declaration
constructor_declaration
    :   PUBLIC ID LEFT_PAREN parameter_list? RIGHT_PAREN LEFT_BRACE block RIGHT_BRACE      #ConstructorDeclaration
    ;

// Method declaration
method_declaration
    :   PUBLIC (VOID | type) ID LEFT_PAREN parameter_list? RIGHT_PAREN LEFT_BRACE block RIGHT_BRACE     #MethodDeclaration
    ;

// Parameter list
parameter_list
    :   parameter (COMMA parameter)*
    ;

parameter
    :   type ID
    ;

// Types
type
    :   INT                                                     #TypeInt
    |   DOUBLE                                                  #TypeDouble
    |   CHAR                                                    #TypeChar
    |   BOOLEAN                                                 #TypeBoolean
    |   STRING                                                  #TypeString
    |   ID                                                      #TypeId
    ;

// Block: sequence of statements
block
    :   statement*
    ;

// Statements
statement
    :   variable_declaration SEMICOLON                         #StatementVariableDeclaration
    |   assignment SEMICOLON                                   #StatementAssignment
    |   if_statement                                           #StatementIf
    |   switch_statement                                       #StatementSwitch
    |   for_statement                                          #StatementFor
    |   while_statement                                        #StatementWhile
    |   do_while_statement                                     #StatementDoWhile
    |   return_statement SEMICOLON                             #StatementReturn
    |   break_statement SEMICOLON                              #StatementBreak
    |   continue_statement SEMICOLON                           #StatementContinue
    |   print_statement SEMICOLON                              #StatementPrint
    |   read_statement SEMICOLON                               #StatementRead
    |   object_creation SEMICOLON                              #StatementObjectCreation
    |   expression SEMICOLON                                   #StatementExpression
    |   SEMICOLON                                              #StatementEmpty
    ;

// Variable declaration
variable_declaration
    :   type ID (ASSIGN expression)?                           #VariableDeclarationSimple
    |   type ID LEFT_CLASP (INTEGER)? RIGHT_CLASP (ASSIGN array_initializer)?      #VariableDeclarationArray
    |   type ID LEFT_CLASP LEFT_CLASP RIGHT_CLASP RIGHT_CLASP (ASSIGN array_initializer)?  #VariableDeclarationMatrix
    |   type ID ASSIGN object_creation                         #VariableDeclarationObject
    ;

// Array initializer
array_initializer
    :   LEFT_BRACE expression (COMMA expression)* RIGHT_BRACE      #ArrayInitializer
    |   NEW type LEFT_CLASP INTEGER RIGHT_CLASP                    #ArrayInitializerNew
    |   NEW type LEFT_CLASP LEFT_CLASP RIGHT_CLASP RIGHT_CLASP     #ArrayInitializerMatrix
    ;

// Object creation
object_creation
    :   NEW ID LEFT_PAREN argument_list? RIGHT_PAREN           #ObjectCreation
    ;

// Assignment
assignment
    :   (ID | array_access | struct_access) ASSIGN expression          #AssignmentSimple
    |   (ID | array_access | struct_access) PLUS_ASSIGN expression     #AssignmentPlus
    |   (ID | array_access | struct_access) MINUS_ASSIGN expression    #AssignmentMinus
    |   (ID | array_access | struct_access) MULT_ASSIGN expression     #AssignmentMult
    |   (ID | array_access | struct_access) SPLIT_ASSIGN expression    #AssignmentSplit
    |   (ID | array_access | struct_access) INCREMENT                   #AssignmentIncrement
    |   (ID | array_access | struct_access) DECREMENT                   #AssignmentDecrement
    ;

// Array access
array_access
    :   ID (LEFT_CLASP expression RIGHT_CLASP)+                #ArrayAccess
    ;

// Struct/object access
struct_access
    :   ID (DOT ID)+                                          #StructAccess
    ;

// If statement
if_statement
    :   IF LEFT_PAREN expression RIGHT_PAREN statement (ELSE statement)?     #IfStatement
    ;

// Switch statement
switch_statement
    :   SWITCH LEFT_PAREN expression RIGHT_PAREN LEFT_BRACE (case_statement)* (default_statement)? RIGHT_BRACE      #SwitchStatement
    ;

case_statement
    :   CASE (INTEGER | STRING_LITERAL | CHAR_LITERAL | ID) COLON block (BREAK SEMICOLON)?       #CaseStatement
    ;

default_statement
    :   DEFAULT COLON block (BREAK SEMICOLON)?                #DefaultStatement
    ;

// For statement
for_statement
    :   FOR LEFT_PAREN for_initialization SEMICOLON for_condition? SEMICOLON for_update? RIGHT_PAREN statement     #ForStatement
    ;

for_initialization
    :   variable_declaration                                   #ForInitVariable
    |   assignment                                             #ForInitAssignment
    |                                                          #ForInitEmpty
    ;

for_condition
    :   expression                                             #ForCondition
    ;

for_update
    :   assignment                                             #ForUpdateAssignment
    |   expression                                             #ForUpdateExpression
    ;

// While statement
while_statement
    :   WHILE LEFT_PAREN expression RIGHT_PAREN statement      #WhileStatement
    ;

// Do-while statement
do_while_statement
    :   DO statement WHILE LEFT_PAREN expression RIGHT_PAREN SEMICOLON     #DoWhileStatement
    ;

// Return statement
return_statement
    :   RETURN expression?                                    #ReturnStatement
    ;

// Break statement
break_statement
    :   BREAK                                                #BreakStatement
    ;

// Continue statement
continue_statement
    :   CONTINUE                                             #ContinueStatement
    ;

// Print statements
print_statement
    :   PRINTLN LEFT_PAREN expression? RIGHT_PAREN           #PrintlnStatement
    |   PRINT LEFT_PAREN expression? RIGHT_PAREN             #PrintStatement
    ;

// Read statement
read_statement
    :   READLN LEFT_PAREN RIGHT_PAREN                        #ReadlnStatement
    ;

// Expressions: Ordered low to high precedence
// Expressions: Ordenadas explícitamente de mayor a menor precedencia
expression
    :   LEFT_PAREN expression RIGHT_PAREN                       #ExprParen
    |   primary                                                 #ExprPrimary
    |   expression (INCREMENT | DECREMENT)                      #ExprPostfix
    |   (NOT | PLUS | MINUS | INCREMENT | DECREMENT) expression #ExprUnary
    |   expression (MULT | SPLIT | MODULO) expression           #ExprMultiplicative
    |   expression (PLUS | MINUS) expression                    #ExprAdditive
    |   expression (MAJOR | MINOR | MAJORTO | MINORTO) expression #ExprRelational
    |   expression (IDENTIC | DIFF) expression                  #ExprEquality
    |   expression AND expression                               #ExprLogicalAnd
    |   expression OR expression                                #ExprLogicalOr
    |   expression QUESTION expression COLON expression         #ExprTernary
    ;

primary
    :   INTEGER                                              #PrimaryInteger
    |   DECIMAL                                              #PrimaryDecimal
    |   STRING_LITERAL                                       #PrimaryString
    |   CHAR_LITERAL                                         #PrimaryChar
    |   TRUE                                                 #PrimaryTrue
    |   FALSE                                                #PrimaryFalse
    |   NULL                                                 #PrimaryNull
    |   array_access                                         #PrimaryArrayAccess
    |   struct_access                                        #PrimaryStructAccess
    |   method_call                                          #PrimaryMethodCall
    |   ID                                                   #PrimaryId
    |   object_creation                                      #PrimaryObjectCreation
    ;

logical_or
    :   logical_and (OR logical_and)*                        #LogicalOr
    ;

logical_and
    :   equality (AND equality)*                             #LogicalAnd
    ;

equality
    :   relational (IDENTIC relational | DIFF relational)*  #EqualityRelational
    ;

relational
    :   additive (MAJOR additive | MINOR additive | MAJORTO additive | MINORTO additive)*   #RelationalAdditive
    ;

additive
    :   multiplicative ((PLUS | MINUS) multiplicative)*     #AdditiveMultiplicative
    ;

multiplicative
    :   unary ((MULT | SPLIT | MODULO) unary)*              #MultiplicativeUnary
    ;

unary
    :   (NOT | PLUS | MINUS | INCREMENT | DECREMENT) unary   #UnaryPrefix
    |   postfix                                              #UnaryPostfix
    ;

postfix
    :   primary (INCREMENT | DECREMENT)?                    #PostfixPrimary
    ;

method_call
    :   ID LEFT_PAREN argument_list? RIGHT_PAREN            #MethodCall
    ;

argument_list
    :   expression (COMMA expression)*                      #ArgumentList
    ;