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

calculation: '(' val=calculation ')'                                          # ExParentheses
          | '-' val=calculation                                               # ExNegate
          | left=calculation op=('*' | '/') right=calculation                 # ExMulDivOp
          | left=calculation op=('+' | '-') right=calculation                 # ExAddOp
          | left=calculation '%' right=calculation                            # ExModOp
          | val=checkVAR                                                      # ExVarLiteral
          | DBL                                                               # ExDblLiteral
          | NIN                                                               # ExNegLiteral
          | INT                                                               # ExIntLiteral
          | arrayGetValue                                                     # ExArrLiteral
          | scnr=checkSCNID '.nextInt'                                        # ExAsnUsrInt
          | scnr=checkSCNID '.nextDbl'                                        # ExAsnUsrDbl
          ;

ifTJB: ifStatement (elseIfStatement)* (elsePart=elseStatement)? 'End';
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

display: line=('Dispn' | 'Displn') displayOptions (',' displayOptions)*;

forTJB: 'For' '(' iterator=checkVAR  (',' iterVal=(INT | DBL))? ',' comp=booleanEXP ',' increments=incrementEXP ')' expression* 'End';
incrementEXP: nameVar=checkVAR '+=' calc=calculation;

comment: '<COM>' STR '</COM>'                               #CommentLine;

displayOptions:
           STR                   #DispSTR
          | name=checkSTRID      #DispSTRID
          | calc=calculation     #DispCalc
          | name=checkArray      #DispArray
          | str=stringUsrIn      #DispUsrString
          ;

assignment:
            value=calculation ASN name=checkVAR       #NumAsn //Declaration of a number + inital assign.
          | value=STR ASN name=checkSTRID             #StrAsn //Declaration of a string + inital assign.
          | value=checkSTRID ASN name=checkSTRID      #StrCpyAsn //Declaration of a string + copying the value of another string variable.
          | value=arrayBuild ASN name=checkArray      #ArrAsn //Declaration of an array + inital assign.
          | value=checkArray ASN name=checkArray      #ArrCpyAsn //Declaration of an array + copying the value of another array variable.
          | value=checkArray CPYASN name=checkArray   #ArrAsnVAR //Changing the value of an already existing array.
          | value=calculation CPYASN name=checkVAR    #NumAsnVAR //Changing the value of an already existing number.
          | value=checkSTRID CPYASN name=checkSTRID   #StrAsnVAR //Changing the value of an already existing string (value from another existing string).
          | value=STR CPYASN name=checkSTRID          #StrAsnNEWVAR //Changing the value of an already existing string (value from user typed string).

          | scnr=checkSCNID '.nextStr' ASN name=checkSTRID      #StrAsnUsrIn
          | scnr=checkSCNID '.nextStr' CPYASN name=checkSTRID   #StrAsnUsrInVAR

          | 'Scanner ' name=checkSCNID ';'                      #ScannerAsn
          | scnr=checkSCNID '.close'                            #ScannerCls

          | value=calculation ASN name=arrayGetValue            #AsnArrVal //Assign a value to an array position.
          | value=STR ASN name=arrayGetValue                    #StrArrAsn
          | value=checkSTRID CPYASN name=arrayGetValue          #StrArrAsnVar

          | scnr=checkSCNID '.nextStr' ASN name=arrayGetValue   #StrArrValUsrIn //Take user input and assign the given string to the array position.

          | value=arrayGetValue ASN name=checkSTRID             #AsnStrFromArr //Get a value from an array and use it to create a new string value;
          | value=arrayGetValue CPYASN name=checkSTRID          #CpyAsnStrFromArr //Get a value from an array and use it to overwrite an old string.
          ;

arrayBuild: '{' (checkSTRID | calculation | STR | stringUsrIn) (',' (checkSTRID | calculation | STR | stringUsrIn))* '}';
arrayGetValue: arrayName = checkArray '.[' number=INT']';

stringUsrIn: scnr=checkSCNID '.nextStr';

ASN: '->';
CPYASN: '-->';
VAR: [A-Z]+;
STRID: 'Str' [0-9]+;
SCNID: 'Scn' [0-9]+;
STR: '"' ('a'..'z' | 'A'..'Z' | ' ' | [0-9] | '#' )+ '"' | '""';
COMPTKN: '<' | '<=' | '=' | '!=' | '>' | '>=';
LOGTKN: ('||' | 'Or') | ('&&' | 'And');
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

checkSCNID
    :
    SCNID
     {
         final String strid = $SCNID.text;

         if (strid.length() > 5) {
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
