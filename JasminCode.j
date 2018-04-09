.class public PLACEHOLDER
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
	.limit	stack	40
	.limit	locals	5

	ldc	11
	istore	1

	ldc	5
	istore	2

if_0:
	iload	1
	ldc	10
	if_icmpeq	ifDone_0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Random"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_0
ifDone_0:
allDone_0:

	;	"Prints an empty line of text"
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	;	"Put integer 10 into the already existing variable A which is also an integer previously 11"
	ldc	10
	istore	1

if_1:
	iload	1
	ldc	10
	if_icmpne	ifDone_1
	ldc	20
	istore	1

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A was ten now 20"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	ldc	0
	istore	3

while_0:
	iload	3
	ldc	2
	if_icmpge	whileDone_0
	ldc	5
	istore	4
for_0:
	iload	4
	ldc	3
	if_icmple	forDone_0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	4
	invokevirtual	java/io/PrintStream/println(I)V

	iload	4
	ldc	-1
	iadd
	istore	4

	goto	for_0
forDone_0:
if_2:
	iload	2
	ldc	5
	if_icmpne	ifDone_2
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"B is five"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_2
ifDone_2:
elseIf_2-0:
	iload	2
	ldc	5
	if_icmple	elseIfDone_2-0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"B is more than five"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_2

elseIfDone_2-0:
else_2:
	;	"Do nothing"
	goto	allDone_2

allDone_2:

	iload	3
	ldc	1
	iadd

	istore	3

	goto	while_0
whileDone_0:
	goto	allDone_1
ifDone_1:
elseIf_1-0:
	iload	1
	ldc	15
	if_icmpgt	elseIfDone_1-0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A else is less than or equal to 15"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_1

elseIfDone_1-0:
elseIf_1-1:
	iload	1
	ldc	15
	if_icmple	elseIfDone_1-1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"A else is more than 15"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_1

elseIfDone_1-1:
else_1:
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Not 10 or less than and or equal to 15"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_1

allDone_1:

	ldc	15
	ldc	2
	imul

	istore	4

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	4
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Showing D"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	return
.end method