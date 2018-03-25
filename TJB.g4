grammar TJB;

codeLine: (expression)* EOF;

expression: assignment
          | calculation
          | ifTJB
          | whileTJB
          | display
          | forTJB
          | booleanEXP
          ;

//...

//FIXME: Allow multiple brackets (i.e. "(((5)))") and more than 2 negatives (i.e. "------2")?
calculation: '(' calculation ')'                                              # ExParentheses
          | NIN                                                               # ExNegLiteral
          | INT                                                               # ExIntLiteral
          | DBL                                                               # ExDblLiteral
          | checkVAR                                                          # ExVarLiteral
          | '-' calculation                                                   # ExNegate
          | left=calculation '*' right=calculation                            # ExMulOp
          | left=calculation '/' right=calculation                            # ExDivOp
          | left=calculation '%' right=calculation                            # ExModOp
          | left=calculation op=('+' | '-') right=calculation                 # ExAddOp
          ;

//I defined so many things because I thought it would be easier to manage them with the parser. I don't know if it is
//very good, tho.

ifTJB: ifStatement (elseIfStatement)* (elseStatement)* 'End';
ifStatement: 'If' booleanEXP thenStatement;
thenStatement: 'Then' (expression)*;
elseStatement: 'Else' (expression)*;
elseIfStatement: 'Else' ifStatement;

booleanEXP: '(' booleanEXP ')'
          | '!' booleanEXP
          | calculation
          | STR
          | checkSTRID
          | left=booleanEXP comp=COMPTKN right=booleanEXP
          ;

whileTJB: 'While' booleanEXP (expression)* 'End';
display: 'Disp' (calculation | STR) (',' (calculation | STR))*;
//FIXME: Fix the calculation part ??
forTJB: 'For' iterator=checkVAR  (',' iterVal=(INT | DBL))? ',' comp=COMPTKN ',' upper=(VAR|INT|DBL) ',' increments=calculation expression* 'End';

comparisonSTR:;

assignment: value=calculation ASN name=VAR         #NumAsn
          | value=STR ASN name=checkSTRID          #StrAsn
          | value=checkSTRID ASN name=checkSTRID   #StrCpyAsn
          | value=arrayBuild ASN name=checkArray   #ArrAsn
          | value=checkArray ASN name=checkArray   #ArrCpyAsn
          ;

arrayBuild: '{' (NIN | INT | DBL) (',' (NIN | INT | DBL))* '}';

ASN: '->';
VAR: [A-Z]+;
STRID: 'Str' [0-9]+;
STR: '"' ('a'..'z' | 'A'..'Z' | ' ')+ '"' | '""';
COMPTKN: '<' | '<=' | '=' | '!=' | '>' | '>=' | ('||' | 'And') | ('&&' | 'Or');
ARRAY: ('L' | 'l') INT;
INT: '0' | [1-9][0-9]*;
NIN: '-' INT;
DBL: (NIN | INT) ',' INT;
WS: [\r\t\n ]+ -> skip;

checkSTRID
    :
    STRID
    {
        final String strid = $STRID.text;
        if (strid.length() > 4) {
            throw new RuntimeException(strid + " Cannot be more than 4 characters.");
        }
    }
    ;

checkVAR
    :
    VAR
    {
        final String strid = $VAR.text;
        if (strid.length() > 1) {
            throw new RuntimeException(VAR + " Cannot be more than 1 characters.");
        }
    }
    ;

checkArray
    : ARRAY
    {
        final String id = $ARRAY.text;
        if(id.charAt(0) == 'L'){
            int number = Integer.parseInt(String.valueOf(id.charAt(1)));
            if(id.length() > 2){
            throw new RuntimeException(id + " Cannot be more than 2 characters.");
            } else if (number > 6 || number < 1){
            throw new RuntimeException(id + " Number must be between 1 and 6.");
            }
        } else {
            if (id.length() > 5){
            throw new RuntimeException(id + " Cannot be more than 5 characters.");
            }
        }
    }
    ;