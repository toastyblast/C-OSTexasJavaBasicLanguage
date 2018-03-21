grammar TJB;

codeLine: (expression)* EOF;

expression: assignment
          | calculation
          | if
          | while
          | display
          | for
          | booleanEXP
          ;

//...

//FIXME: Allow multiple brackets (i.e. "(((5)))") and more than 2 negatives (i.e. "------2")?
calculation: '(' calculation ')'                                              # ExParentheses
          | NIN                                                               # ExNegLiteral
          | INT                                                               # ExIntLiteral
          | DBL                                                               # ExDblLiteral
          | VAR                                                               # ExVarLiteral
          | '-' calculation                                                   # ExNegate
          | left=calculation '*' right=calculation                            # ExMulOp
          | left=calculation '/' right=calculation                            # ExDivOp
          | left=calculation '%' right=calculation                            # ExModOp
          | left=calculation op=('+' | '-') right=calculation                 # ExAddOp
          ;

//I defined so many things because I thought it would be easier to manage them with the parser. I don't know if it is
//very good, tho.

if: ifStatement (elseIfStatement)* (elseStatement)* 'End';
ifStatement: 'If' booleanEXP thenStatement;
thenStatement: 'Then' (expression)*;
elseStatement: 'Else' (expression)*;
elseIfStatement: 'Else' ifStatement;

booleanEXP: '(' booleanEXP ')'
          | '!' booleanEXP
          | calculation
          | STR
          | STRID
          | left=booleanEXP comp=COMPTKN right=booleanEXP
          ;

while: 'While' booleanEXP (expression)* 'End';
display: 'Disp' (calculation | STR) (',' (calculation | STR))*;
//FIXME: Fix the calculation part ??
for: 'For' iterator=VAR  (',' iterVal=(INT | DBL))? ',' comp=COMPTKN ',' upper=(VAR|INT|DBL) ',' increments=calculation expression* 'End';

comparisonSTR:;

assignment: calculation ASN VAR
          | STR ASN STRID
          | arrayBuild ASN ARRAY;

arrayBuild: '{' (NIN | INT | DBL) (',' (NIN | INT | DBL))* '}';

ASN: '->';
VAR: [A-Z];
STRID: 'Str' [0-9];
STR: '"' ('a'..'z' | 'A'..'Z' | ' ')+ '"' | '""';
COMPTKN: '<' | '<=' | '=' | '!=' | '>' | '>=' | ('||' | 'And') | ('&&' | 'Or');
//TODO: ONLY ALLOW UP TO 5 CHARACTERS FOR STRING NAME
ARRAY: 'L'[1-6] | 'l'[a-zA-Z0-9];
INT: '0' | [1-9][0-9]*;
NIN: '-' INT;
//FIXME: Is this okay???
DBL: (NIN | INT) ',' INT;
WS: [\r\t\n ]+ -> skip;