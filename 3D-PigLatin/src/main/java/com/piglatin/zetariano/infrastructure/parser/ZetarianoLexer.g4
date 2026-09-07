lexer grammar ZetarianoLexer;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Arithmetic
PLUS: '+';
MINUS: '-';
MULT: '*';
SPLIT: '/';
MODULO: '%';

// Assignment operators
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
SPLIT_ASSIGN: '/=';

// Relational
IDENTIC: '==';
DIFF: '!=';
MAJORTO: '>=';
MINORTO: '<=';
MINOR: '<';
MAJOR: '>';

// Logical
AND: '&&';
OR: '||';

// Negation
NOT: '!';

// Increment/Decrement
INCREMENT: '++';
DECREMENT: '--';

// Punctuation
COLON: ':';
COMMA: ',';
DOT: '.';
SEMICOLON: ';';
QUESTION: '?';

// Structural
LEFT_CLASP: '[';
RIGHT_CLASP: ']';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';

// Reserved Words
PUBLIC: 'public';
CLASS: 'class';
NEW: 'new';
VOID: 'void';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE: 'continue';
FOR: 'for';
WHILE: 'while';
DO: 'do';
PRINTLN: 'println';
PRINT: 'print';
READLN: 'readln';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

// Types
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
BOOLEAN: 'boolean';
STRING: 'String';

// Identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Literal Values
INTEGER: [0-9]+;
DECIMAL: [0-9]+ '.' [0-9]+;
STRING_LITERAL: '"' ( '\\' . | ~["\\] )* '"';
CHAR_LITERAL: '\'' ( '\\' . | ~['\\] ) '\'';

// Ignore
WS: [ \t\r\n]+ -> skip;