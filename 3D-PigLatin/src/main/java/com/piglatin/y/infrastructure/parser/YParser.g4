parser grammar YLexer;

options { tokenVocab=YLexer; }

// Entry point
program
    :   (estructuras_section? funciones_section) EOF
    ;

// Sections
estructuras_section
    :   ESTRUCTS_INIT (structure_declaration)+
    ;

funciones_section
    :   FUNCTIONS_INIT (function_declaration)+
    ;

// Structure declaration
structure_declaration
    :   ESTRUCTURA ID COLON (field_declaration)+
    ;

field_declaration
    :   type ID (LEFT_CLASP INTEGER RIGHT_CLASP)? (ASSIGN literal_value)?
    ;

// Function declaration
function_declaration
    :   DEFINIR ID LEFT_PAREN parameter_list? RIGHT_PAREN (ARROW type)? COLON block
    ;

parameter_list
    :   parameter (COMMA parameter)*
    ;

parameter
    :   type ID (LEFT_CLASP RIGHT_CLASP)?
    ;

// Block: sequence of statements (python XD)
block: statement*;

// Types

type
    :   ENTERO                                                  #TypeEntero
    |   CADENA                                                  #TypeCadena
    |   FLOTANTE                                                #TypeFlotante
    |   CARACTER                                                #TypeCaracter
    |   BOOL                                                    #TypeBool
    |   ID                                                      #TypeId
    ;

// Statements
statement
    :   variable_declaration                                    #StatementVariableDeclaration
    |   assignment                                              #StatementAssigment
    |   if_statement                                            #StatementIf
    |   switch_statement                                        #StatementSwitch
    |   for_statement                                           #StatementFor
    |   while_statement                                         #StatementWhile
    |   do_while_statement                                      #StatementDoWhile
    |   return_statement                                        #StatementReturn
    |   break_statement                                         #StatementBreak
    |   continue_statement SEMICOLON                            #StatementContinue
    |   print_statement                                         #StatementPrint
    |   read_statement                                          #StatementRead
    |   structure_declaration                                   #StatementStructureDeclaration
    |   expression                                              #StatementExpression
    ;

// Variable declaration
variable_declaration
    :   type ID (ASSIGN expression)?                                                                                    #VariableDeclarationSimple
    |   type ID (LEFT_CLASP INTEGER RIGHT_CLASP (LEFT_CLASP INTEGER RIGHT_CLASP)?) (ASSIGN array_initializer)?          #VariableDeclarationArray
    |   type ID ASSIGN structure_initializer                                                                            #VariableDeclarationStructureInitialization
    |   ID ID (ASSIGN expression)?                                                                                      #VariableDeclarationNestedEstructureDeclaration
    ;

array_initializer
    :   LEFT_BRACE expression (COMMA expression)* RIGHT_BRACE
    ;

structure_initializer
    :   LEFT_BRACE expression (COMMA expression)* RIGHT_BRACE
    ;

// Assignment
assignment
    :   (ID | array_access | struct_access) ASSIGN expression
    ;

// Array access
array_access
    :   ID (LEFT_CLASP expression RIGHT_CLASP)+
    ;

struct_access
    :   ID (DOT ID)+
    ;

// If statement
if_statement
    :   SI LEFT_PAREN expression RIGHT_PAREN ENTONCES COLON block
        (SINO LEFT_PAREN expression RIGHT_PAREN ENTONCES COLON block)*
        (CONTRARIO COLON block)?
    ;

// Switch statement
switch_statement
    :   ELEGIR LEFT_PAREN expression RIGHT_PAREN COLON
        (case_statement)*
        SIEMPRE COLON block ROMPER
    ;

case_statement
    :   CASO (INTEGER | STRING | CHAR | ID) COLON block ROMPER
    ;

// For statement
for_statement
    :   PARA LEFT_PAREN for_initialization SEMICOLON expression SEMICOLON for_update RIGHT_PAREN COLON block
    ;

for_initialization
    :   variable_declaration                                    #ForInitializationVariableDeclaration
    |   assignment                                              #ForInitializationAssigment
    |                                                           #ForInitializationLambda
    ;
for_update
    :   assignment                                              #ForUpdateAssigment
    |   expression                                              #ForUpdateExpression
    ;

// While statement
while_statement
    :   MIENTRAS LEFT_PAREN expression RIGHT_PAREN HACER COLON block
    ;

// Do-while statement
do_while_statement
    :   HACER COLON block MIENTRAS LEFT_PAREN expression RIGHT_PAREN
    ;

// Return statement
return_statement
    :   RETORNAR expression
    ;

// Break statement
break_statement
    :   ROMPER
    ;

// Continue statement
continue_statement
    :   CONTINUAR
    ;

// Print statement
print_statement
    :   IMPRIMIR LEFT_PAREN expression RIGHT_PAREN
    ;

// Read statement
read_statement
    :   LEER LEFT_PAREN RIGHT_PAREN (ASSIGN ID)?
    ;

// Expressions: Ordered low to high precedence
expression
    :   logical_or
    ;

logical_or
    :   logical_and (OR logical_and)*
    ;

logical_and
    :   equality (AND equality)*
    ;

equality
    :   relational (IDENTIC relational | DIFF relational)*
    ;

relational
    :   additive (MAJOR additive | MINOR additive | MAJORTO additive | MINORTO additive)*
    ;

additive
    :   multiplicative ((PLUS | MINUS) multiplicative)*
    ;

multiplicative
    :   unary ((MULT | SPLIT) unary)*
    ;

unary
    :   (NOT | PLUS | MINUS | ADD | SUB) unary
    |   postfix
    ;

postfix
    :   primary (ADD | SUB)?
    ;

primary
    :   INTEGER                                                 #PrimaryInteger
    |   DECIMAL                                                 #PrimaryDecimal
    |   STRING                                                  #PrimaryString
    |   CHAR                                                    #PrimaryChar
    |   VERDADERO                                               #PrimaryVerdadero
    |   FALSO                                                   #PrimaryFalso
    |   ID                                                      #PrimaryId
    |   array_access                                            #PrimaryArrayAccess
    |   struct_access                                           #PrimaryStructAccess
    |   LEFT_PAREN expression RIGHT_PAREN                       #PrimaryExpression
    |   function_call                                           #PrimaryFunctionCall
    ;

function_call
    :   ID LEFT_PAREN argument_list? RIGHT_PAREN
    ;

argument_list
    : expression (COMMA expression)*
    ;

literal_value
    :   INTEGER                                                 #LiteralValueInteger
    |   DECIMAL                                                 #LiteralValueDecimal
    |   STRING                                                  #LiteralValueString
    |   CHAR                                                    #LiteralValueChar
    |   VERDADERO                                               #LiteralValueVerdadero
    |   FALSO                                                   #LiteralValueFalso
    |   array_initializer                                       #LiteralValueArrayInitializer
    |   structure_initializer                                   #LiteralValueStructureInitializer
    ;