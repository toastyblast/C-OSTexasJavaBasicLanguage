grammar TJB;

codeLine: (expression)* EOF;

expression: assignment
          | calculation
          | ifTJB
          | whileTJB
          | display
          | forTJB
          | booleanEXP
          | comment
          ;

//...

//FIXME: Allow multiple brackets (i.e. "(((5)))") and more than 2 negatives (i.e. "------2")?
calculation: '(' val=calculation ')'                                          # ExParentheses
          | '-' val=calculation                                               # ExNegate
          | left=calculation '*' right=calculation                            # ExMulOp
          | left=calculation '/' right=calculation                            # ExDivOp
          | left=calculation op=('+' | '-') right=calculation                 # ExAddOp
          | left=calculation '%' right=calculation                            # ExModOp
          | val=checkVAR                                                      # ExVarLiteral
          | DBL                                                               # ExDblLiteral
          | NIN                                                               # ExNegLiteral
          | INT                                                               # ExIntLiteral
          ;

//I defined so many things because I thought it would be easier to manage them with the parser. I don't know if it is
//very good, tho.

ifTJB: ifStatement (elseIfStatement)* (elseStatement)+ 'End';
ifStatement: 'If' bool=booleanEXP thenStatement;
thenStatement: 'Then' (expression)*;
elseStatement: 'Else' (expression)*;
elseIfStatement: 'Else if' bool=booleanEXP thenStatement;

booleanEXP: '(' bool=booleanEXP ')'                         #BoolParentheses
          | '!' bool=booleanEXP                             #BoolNeg
          | left=booleanEXP comp=COMPTKN right=booleanEXP   #BoolComp
          | left=booleanEXP comp=LOGTKN right=booleanEXP    #BoolCompLog
          | calc=calculation                                #BoolCalc
          | str=checkSTRID                                  #BoolSTRID
          | STR                                             #BoolSTR
          ;

whileTJB: 'While' bool=booleanEXP (expression)* 'End';
display: 'Disp' displayOptions (',' displayOptions)*;
//FIXME: Fix the calculation part ??
forTJB: 'For' '(' iterator=checkVAR  (',' iterVal=(INT | DBL))? ',' comp=COMPTKN ',' upper=(VAR|INT|DBL) ',' increments=incrementEXP ')' expression* 'End';
incrementEXP: nameVar=checkVAR '=' calc=calculation;

comment: '<COM>' STR '</COM>'                               #CommentLine;

displayOptions:
           STR                   #DispSTR
          | name=checkSTRID      #DispSTRID
          | calc=calculation     #DispCalc
          | name=checkArray      #DispArray
          ;

assignment: value=calculation ASN name=checkVAR       #NumAsn //Declaration of a number + inital assign.
          | value=STR ASN name=checkSTRID             #StrAsn //Declaration of a string + inital assign.
          | value=checkSTRID ASN name=checkSTRID      #StrCpyAsn //Declaration of a string + copying the value of another string variable.
          | value=arrayBuild ASN name=checkArray      #ArrAsn //Declaration of an array + inital assign.
          | value=checkArray ASN name=checkArray      #ArrCpyAsn //Declaration of an array + copying the value of another array variable.
          | value=checkArray CPYASN name=checkArray   #ArrAsnVAR //Changing the value of an already existing array.
          | value=calculation CPYASN name=checkVAR    #NumAsnVAR //Changing the value of an already existing number.
          | value=checkSTRID CPYASN name=checkSTRID   #StrAsnVAR //Changing the value of an already existing string (value from another existing string).
          | value=STR CPYASN name=checkSTRID          #StrAsnNEWVAR //Changing the value of an already existing string (value from user typed string).
          ;

arrayBuild: '{' (NIN | INT | DBL | checkSTRID | calculation | STR) (',' (NIN | INT | DBL | checkSTRID | calculation | STR))* '}';

ASN: '->';
CPYASN: '-->';
VAR: [A-Z]+;
STRID: 'Str' [0-9]+;
STR: '"' ('a'..'z' | 'A'..'Z' | ' ' | [0-9])+ '"' | '""';
COMPTKN: '<' | '<=' | '=' | '!=' | '>' | '>=';
LOGTKN: ('||' | 'And') | ('&&' | 'Or');
ARRAY: ('L' | 'l') (INT|VAR)+;
INT: '0' | [1-9][0-9]*;
NIN: '-' INT;
DBL: (NIN | INT) '.' INT;
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
            throw new RuntimeException(strid + " Cannot be more than 1 characters.");
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