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
	.limit	locals	2

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
	return
.end method