parser grammar LatinParser;

options { tokenVocab = LatinLexer; }

// Start Program
program
       : importList?
         (VARIABILES_INIT globalDeclarations)?
         MAIOR_INIT mainInstructions FINIS_EOF SEMICOLON? EOF
       ;

importList
    :importStatement+
    ;

importStatement
    : IMPORT ID (DOT ID)* SEMICOLON
    ;

globalDeclarations
    : ( globalDeclaration )*
    ;

// Allows the declaration of global variables and arrays
globalDeclaration
    : declaration                                                           #GlobalDeclarationDeclaration
    | arrayDeclaration                                                      #GlobalDeclarationArrayDeclaration
    ;

mainInstructions
    : instruction*
    ;

instruction
    : assignment                                                            #InstructionAssignment
    | readStatement                                                         #InstructionRead
    | printStatement                                                        #InstructionPrint
    | ifStatement                                                           #InstructionIf
    | whileStatement                                                        #InstructionWhile
    | doWhileStatement                                                      #InstructionDoWhile
    | forStatement                                                          #InstructionFor
    | jumpStatement                                                         #InstructionReturn
    | expression SEMICOLON                                                  #InstructionExpression
    ;

// Variable Declaration

/*
If declaration don support initialization inside arrays use this:
declaration
    : ESTO ID COLON type (ASSIGN expression)? SEMICOLON?
    ;
*/
declaration
    : ESTO ID (COLON)? (type)? (ASSIGN expression)? SEMICOLON?
    ;

arrayDeclaration
    : SERIES ID LEFT_CLASP expression RIGHT_CLASP COLON (type)? (LEFT_BRACE arrayValues RIGHT_BRACE)? SEMICOLON?
    ;

arrayValues
    : expression (COMMA expression)*
    ;

ifStatement
    : SI LEFT_PAREN booleanExpression RIGHT_PAREN block (elseIfClause)* (elseClause)? FINIS SEMICOLON
    ;

elseIfClause
    : ALITER LEFT_PAREN booleanExpression RIGHT_PAREN block
    ;

elseClause
    : ALITER block
    ;

whileStatement
    : DUM LEFT_PAREN booleanExpression RIGHT_PAREN block FINIS SEMICOLON
    ;

doWhileStatement
    : FACERE block DUM LEFT_PAREN booleanExpression RIGHT_PAREN SEMICOLON
    ;

forStatement
    : PER LEFT_PAREN forInit SEMICOLON forCondition SEMICOLON forUpdate? RIGHT_PAREN block  #ForStandard
    ;

jumpStatement
    : PERGE SEMICOLON                                                                       #JumpStatementContinue
    | INTERRUMPE SEMICOLON                                                                  #JumpStatementReturn
    ;

argumentList
    : expression (COMMA expression)*
    ;

//* Allow the object instantiation
newInstance
    : NOVUS ID LEFT_PAREN argumentList? RIGHT_PAREN
    ;

forInit
    : ESTO ID (COLON)? (type)? (ASSIGN expression)?                             #ForInitWithDeclaration
    | lvalue ASSIGN expression                                                  #ForInitWithAssign
    | ID                                                                        #ForInitWithID
    ;

forCondition
    : booleanExpression
    ;

forUpdate
    : expression                                                                #ForUpdateExpression
    | lvalue ASSIGN expression                                                  #ForUpdateLvalue
    ;

block
    : LEFT_BRACE instruction* RIGHT_BRACE
    ;

arrayCreation
    : type LEFT_CLASP expression RIGHT_CLASP
    ;

arrayLiteral
    : LEFT_BRACE expression (COMMA expression)* RIGHT_BRACE
    ;

// Data types
type
    : NUMERUS                                                               #TypeNumerus
    | TEXTUM                                                                #TypeTextum
    | DECIMALIS                                                             #TypeDecimalis
    | LITTERA                                                               #TypeLittera
    | BOOL                                                                  #TypeBool
    | ID                                                                    #TypeID
    ;

readStatement
    : lvalue LEERE SEMICOLON?
    ;


/**Allows:
  >> "Holaaaaa";
  >> mi_string;
  >> mi_string >> mi_textum;

*/
printStatement
    : IMPREMERE printItem (IMPREMERE printItem)* SEMICOLON?
    ;

printItem
    : STRING                                                                #PrintItemString
    | ID                                                                    #PrintItemID
    | expression                                                            #PrintItemExpression
    ;

lvalue
    : ID lvalueSufix*
    ;

// DOT ID -> mi_selva.animales[1]
// LEFT_CLASP expression RIGHT_CLASP -> nombres[0] = "Capitán Espárragos";
lvalueSufix
    : DOT ID                                                                #FieldAccess
    | LEFT_CLASP expression RIGHT_CLASP                                     #IndexAccess
    ;

/* Allows: mi_selva.animales[1] = {
               nombre:"Perro",
               apodo:"Canis"
           }
*/
assignment
    : lvalue ASSIGN expression SEMICOLON?
    ;

// Aritmetic expression
expression
    : booleanExpression                                                     #ExpressionBooleanExpression
    | numericExpression                                                     #ExpressionNumericExpression
    | stringExpression                                                      #ExpressionStringExpression
    | arrayCreation                                                         #ExpressionArrayCreation
    | arrayLiteral                                                          #ExpressionArrayLiteral
    | newInstance                                                           #ExpressionNewInstance
    ;

booleanExpression
    : booleanOrExpression
    ;

booleanOrExpression
    : booleanAndExpression (OR booleanAndExpression)*
    ;

booleanAndExpression
    : comparisonExpression (AND comparisonExpression)*
    ;

comparisonExpression
    : NOT comparisonExpression                                                  #ComparisonExpressionNot
    | comparisonOperand ( relationalLiteral comparisonOperand )?                #ComparisonExpressionComparisonOperand
    | LEFT_PAREN booleanExpression RIGHT_PAREN                                  #ComparisonExpressionBooleanExpresion
    ;

comparisonOperand
    : numericExpression                                                         #ComparissonOperandNumericExpression
    | booleanLiteral                                                            #ComparissonOperandBooleanLiteral
    | stringExpression                                                          #ComparissonOperandStringExpression
    ;

// Numeric Expression
numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ( plusMinusExpression multiplicativeExpression )*
    ;

multiplicativeExpression
    : unaryExpression ( multSplitExpression unaryExpression )*
    ;

unaryExpression
    : (addSubExpression) unaryExpression                                        #UnaryExpressionAddSub
    | primaryNumeric                                                            #UnaryExpressionNumeric
    ;

addSubExpression
    : PLUS                                                                      #AddSubExpressionPlus
    | MINUS                                                                     #AddSubExpressionMinus
    | ADD                                                                       #AddSubExpressionAdd
    | SUB                                                                       #AddSubExpressionSub
    ;

incrementDecrementLiteral
    : ADD                                                                       #IncrementDecrementLiteralAdd
    | SUB                                                                       #IncrementDecrementLiteralSub
    ;

multSplitExpression
    : MULT                                                                      #MultSplitExpressionMult
    | SPLIT                                                                     #MultSplitExpressionSplit
    ;

plusMinusExpression
    : PLUS                                                                      #PlusMinusExpressionPlus
    | MINUS                                                                     #PlusMinusExpressionMinus
    ;

// String Expression
stringExpression
    : stringAdditiveExpression
    ;

stringAdditiveExpression
    : stringAdditiveItem (PLUS stringAdditiveItem)*
    ;

stringAdditiveItem
    : stringPrimary                                                             #StringAdditiveItemStringPrimary
    | numericExpression                                                         #StringAdditiveItemNumericExpression
    | booleanLiteral                                                            #StringAdditiveItemBoolean
    ;

stringPrimary
    : STRING                                                                    #StringPrimaryString
    | CHAR                                                                      #StringPrimaryChar
    | ID (atributeAccessExpresion)*                                             #StringPrimaryAtributeAccessExpression
    ;

primaryNumeric
    : numericLiteral                                                            #PrimaryNumericNumericLiteral
    | ID (atributeAccessExpresion)* (incrementDecrementLiteral)?                #PrimaryNumericAtributeAccessExpression
    | LEFT_PAREN numericExpression RIGHT_PAREN                                  #PrimaryNumericNumericExpression
    ;

numericLiteral
    : INTEGER                                                                   #NumericLiteralInteger
    | DECIMAL                                                                   #NumericLiteralDecimal
    | CHAR                                                                      #NumericLiteralChar
    ;

booleanLiteral
    : VERUM                                                                     #BooleanLiteralVerum
    | FALSUS                                                                    #BooleanLiteralFalsus
    ;

relationalLiteral
    : IDENTIC                                                                   #RelationalLiteralIdentic
    | DIFF                                                                      #RelationalLiteralDiff
    | MINOR                                                                     #RelationalLiteralMinor
    | MAJOR                                                                     #RelationalLiteralMajor
    | MINORTO                                                                   #RelationalLiteralMinorTo
    | MAJORTO                                                                   #RelationalLiteralMajorTo
    ;

atributeAccessExpresion
    : DOT ID                                                                    #AtributeAccessExpressionDitID
    | LEFT_CLASP expression RIGHT_CLASP                                         #AtributeAccessExpressionClaspExpression
    | LEFT_PAREN argumentList? RIGHT_PAREN                                      #AtributeAccessExpressionParenExpression
    ;
