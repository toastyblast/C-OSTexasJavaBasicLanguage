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
	.limit	stack	40
	.limit	locals	4

	;	"This while loop will run twice after which it leaves the loop"
	ldc	0
	istore	1

while_0:
	iload	1
	ldc	2
	if_icmpge	compNeg_0
	ldc	1
	goto	compDone_0
compNeg_0:
	ldc	0
compDone_0:

	ifeq	whileDone_0
	iload	1
	ldc	1
	iadd

	istore	1

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"While loop run done number"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	while_0
whileDone_0:
	;	"Endless while loops are also possible by giving something like 2 equals 2 or a var that always equals one value up until that might be changed in some branch"
	;	"This for loop declares the new variable D"
	ldc	5
	istore	2
for_0:
	iload	2
	ldc	3
	if_icmple	compNeg_1
	ldc	1
	goto	compDone_1
compNeg_1:
	ldc	0
compDone_1:

	ifeq	forDone_0
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	iload	2
	ldc	-1
	iadd
	istore	2

	goto	for_0
forDone_0:

	;	"As side note B will only be available within the for loop as it was declared within said scope"
	;	"But for loops can also use variables already declared"
	ldc	0
	istore	3

for_1:
	iload	3
	ldc	2
	if_icmpge	compNeg_2
	ldc	1
	goto	compDone_2
compNeg_2:
	ldc	0
compDone_2:

	ifeq	forDone_1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	3
	invokevirtual	java/io/PrintStream/println(I)V

	iload	3
	ldc	1
	iadd
	istore	3

	goto	for_1
forDone_1:

	;	"Or reassign said already declared variables and increment using calculations or other vars"
	ldc	10
	istore	3
for_2:
	iload	3
	ldc	17
	if_icmpgt	compNeg_3
	ldc	1
	goto	compDone_3
compNeg_3:
	ldc	0
compDone_3:

	ifeq	forDone_2
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	3
	invokevirtual	java/io/PrintStream/println(I)V

	iload	3
	ldc	3
	iload	1
	imul

	ldc	1
	iadd

	iadd
	istore	3

	goto	for_2
forDone_2:

	return
.end method