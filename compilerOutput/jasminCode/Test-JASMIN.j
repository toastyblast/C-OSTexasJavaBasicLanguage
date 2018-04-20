.class public Test
.super java/lang/Object

;
; standard initializer (calls java.lang.Object's initializer)
;
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

;
; main() method
;
.method public static main([Ljava/lang/String;)V
	.limit	stack	64
	.limit	locals	5

	ldc	10
	istore	1

	;	"Lets start off simple with a single comparison"
	;	"Change A to a different value to trigger the else branch"
if_0:
	iload	1
	ldc	10
	if_icmpne	compNeg_0
	ldc	1
	goto	compDone_0
compNeg_0:
	ldc	0
compDone_0:

	ifeq	ifDone_0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is 10"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_0
ifDone_0:
else_0:
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is NOT 10"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_0
allDone_0:

	;	"This is a double negation and shows that comparisons can be negated"
if_1:
	iload	1
	ldc	10
	if_icmpeq	compNeg_1
	ldc	1
	goto	compDone_1
compNeg_1:
	ldc	0
compDone_1:

	ifeq	negPos_1
	ldc	0
	goto	negDone_1
negPos_1:
	ldc	1
negDone_1:

	ifeq	ifDone_1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is still 10"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_1
ifDone_1:
allDone_1:

	ldc	5
	istore	2

	ldc	15
	istore	3

	;	"This shows the ability to use logic statements for branching"
	;	"Alternatively And and Or can be used instead"
if_2:
	iload	1
	ldc	9
	if_icmpgt	compNeg_2
	ldc	1
	goto	compDone_2
compNeg_2:
	ldc	0
compDone_2:

	ifgt	logicAnd_0
	ldc	0
	goto	logicAndEnd_0
logicAnd_0:
	iload	2
	ldc	6
	if_icmplt	compNeg_3
	ldc	1
	goto	compDone_3
compNeg_3:
	ldc	0
compDone_3:

logicAndEnd_0:
	ifgt	logicOr_0
	iload	3
	ldc	14
	if_icmple	compNeg_4
	ldc	1
	goto	compDone_4
compNeg_4:
	ldc	0
compDone_4:

	goto	logicOrEnd_0
logicOr_0:
	ldc	1
logicOrEnd_0:
	ifeq	ifDone_2
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is less than or equal to 9 and B is more than or equal to 6 OR C is more than 14"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	3
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_2
ifDone_2:
allDone_2:

	;	"Else if statements can also be used as many times as desired as well as including or not including an else at the end"
	;	"And calculations with or without variables can also be used in the comparisons"
if_3:
	iload	2
	ldc	2
	ldc	3
	imul

	if_icmpge	compNeg_5
	ldc	1
	goto	compDone_5
compNeg_5:
	ldc	0
compDone_5:

	ifeq	ifDone_3
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"B is less than 5"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_3
ifDone_3:
elseIf_3-0:
	iload	1
	ldc	10
	if_icmple	compNeg_6
	ldc	1
	goto	compDone_6
compNeg_6:
	ldc	0
compDone_6:

	ifeq	elseIfDone_3-0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is more than 10"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_3
elseIfDone_3-0:
elseIf_3-1:
	iload	3
	ldc	15
	if_icmpne	compNeg_7
	ldc	1
	goto	compDone_7
compNeg_7:
	ldc	0
compDone_7:

	ifeq	elseIfDone_3-1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"C is 15"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_3
elseIfDone_3-1:
allDone_3:

	ldc	1
	istore	4

	;	"Of course branches can be nested within branches as well and so can loops as many times as desired"
	;	"Also comparisons can be surrounded by brackets but this is not necessary"
if_4:
	iload	4
	ldc	1
	if_icmpne	compNeg_8
	ldc	1
	goto	compDone_8
compNeg_8:
	ldc	0
compDone_8:

	ifeq	ifDone_4
if_5:
	iload	1
	ldc	10
	if_icmpne	compNeg_9
	ldc	1
	goto	compDone_9
compNeg_9:
	ldc	0
compDone_9:

	ifeq	ifDone_5
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is still as ever 10"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_5
ifDone_5:
else_5:
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A is once more not 10"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	goto	allDone_5
allDone_5:

	goto	allDone_4
ifDone_4:
else_4:
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"D is not 1"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	4
	invokevirtual	java/io/PrintStream/println(I)V

	goto	allDone_4
allDone_4:

	;	"To make an always true branch compare 1 to 1 and to make an always negative compare 1 to 0 for instance"
	;	"Everything is comparisons so terms like true and false are not supported"
	;	"Likewise strings and arrays cannot be compared although individual array items can be"
	;	"Of course within branches any code can be run so not only displays as shown here for educational purposes"
	;	"Do remember that like loops branches can only access variables from their scope or the ones of all their parents and not their children"
	;	"Examples on scoping can be found in the scopes file"
	return
.end method