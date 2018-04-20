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

	ldc	0
	istore	1

	ldc	0
	istore	2

	ldc	1
	istore	3

	ldc	11
	istore	4

while_0:
	iload	1
	iload	4
	if_icmpge	compNeg_0
	ldc	1
	goto	compDone_0
compNeg_0:
	ldc	0
compDone_0:

	ifeq	whileDone_0
while_1:
	iload	2
	iload	4
	iload	3
	isub

	if_icmpge	compNeg_1
	ldc	1
	goto	compDone_1
compNeg_1:
	ldc	0
compDone_1:

	ifeq	whileDone_1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	" "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

	iload	2
	ldc	1
	iadd

	istore	2

	goto	while_1
whileDone_1:
	ldc	0
	istore	2

while_2:
	iload	2
	iload	3
	ldc	1
	isub

	if_icmpge	compNeg_2
	ldc	1
	goto	compDone_2
compNeg_2:
	ldc	0
compDone_2:

	ifeq	whileDone_2
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"#"
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

	iload	2
	ldc	1
	iadd

	istore	2

	goto	while_2
whileDone_2:
	ldc	0
	istore	2

while_3:
	iload	2
	iload	3
	if_icmpge	compNeg_3
	ldc	1
	goto	compDone_3
compNeg_3:
	ldc	0
compDone_3:

	ifeq	whileDone_3
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"#"
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

	iload	2
	ldc	1
	iadd

	istore	2

	goto	while_3
whileDone_3:
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	" "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	ldc	0
	istore	2

	iload	3
	ldc	1
	iadd

	istore	3

	iload	1
	ldc	1
	iadd

	istore	1

	goto	while_0
whileDone_0:
	return
.end method