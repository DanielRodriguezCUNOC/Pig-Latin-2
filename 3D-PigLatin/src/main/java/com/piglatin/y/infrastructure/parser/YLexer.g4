lexer grammar YLexer;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Arithmetic
PLUS: '+';
MINUS: '-';
MULT: '*';
SPLIT: '/';

// Declaration blocks
ESTRUCTS_INIT: '%estructuras';
FUNCTIONS_INIT: '%funciones';

// Relational
IDENTIC: '==';
DIFF: '!=';
MAJORTO: '>=';
MINORTO: '<=';
MINOR: '<';
MAJOR: '>';
ASSIGN: '=';

// Logical
AND: '&&';
OR: '||';

// Negation
NOT: '!';

// Add/Subtract one unit
ADD: '++';
SUB: '--';

// Punctuation
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
DOT: '.';

// Structural
LEFT_CLASP: '[';
RIGHT_CLASP: ']';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';

// Reserved Words
ESTRUCTURA: 'estructura';
DEFINIR: 'definir';
RETORNAR: 'retornar';
SI: 'si';
ENTONCES: 'entonces';
SINO: 'sino';
CONTRARIO: 'contrario';
ELEGIR: 'elegir';
CASO: 'caso';
SIEMPRE: 'siempre';
ROMPER: 'romper';
PARA: 'para';
MIENTRAS: 'mientras';
HACER: 'hacer';
CONTINUAR: 'continuar';
IMPRIMIR: 'imprimir';
LEER: 'leer';
VERDADERO: 'verdadero';
FALSO: 'falso';

// Type Keywords
ENTERO: 'entero';
CADENA: 'cadena';
FLOTANTE: 'flotante';
CARACTER: 'caracter';
BOOL: 'bool';

// Identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Literal Values
DECIMAL: [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;
STRING: '"' ( '\\' . | ~["\\] )* '"';
CHAR: '\'' ( '\\' . | ~['\\] ) '\'';

// Ignore
WS: [ \t\r\n]+ -> skip;