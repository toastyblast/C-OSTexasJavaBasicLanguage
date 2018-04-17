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
	.limit	locals	6

	ldc	10
	istore	1

	;	"Any loop or branch has its own scope"
	;	"Only they and their children can access variables declared within their scope"
	;	"But children can access variables declared by any of their parents as seen here"
if_0:
	ldc	1
	ldc	1
	if_icmpne	compNeg_0
	ldc	1
	goto	compDone_0
compNeg_0:
	ldc	0
compDone_0:

	ifeq	ifDone_0
	;	"We initialize B here by using the value of A"
	ldc	2
	iload	1
	imul

	istore	2

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Value of A"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Value of B"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

if_1:
	iload	2
	ldc	20
	if_icmpne	compNeg_1
	ldc	1
	goto	compDone_1
compNeg_1:
	ldc	0
compDone_1:

	ifeq	ifDone_1
	;	"Assign C and also give A the same value as C plus 1"
	iload	2
	ldc	4
	idiv

	istore	3

	iload	3
	ldc	1
	iadd

	istore	1

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"New value of A"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Value of C"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	3
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"B remains the same"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	goto	allDone_1
ifDone_1:
allDone_1:

for_0:
	iload	2
	ldc	10
	if_icmple	compNeg_2
	ldc	1
	goto	compDone_2
compNeg_2:
	ldc	0
compDone_2:

	ifeq	forDone_0
	;	"Do nothing"
	iload	2
	ldc	-5
	iadd
	istore	2

	goto	for_0
forDone_0:

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Value of B after internal loop"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	goto	allDone_0
ifDone_0:
allDone_0:

	;	"Of course each else if and else branch also has its own scope just like the if"
	;	"So a variable declared in the if branch cannot be used by an else if or if from the same branch"
	;	"However it can be used by any loops or branches within said if branch as one would expect"
	;	"Seen here is that the value of A has indeed been changed by the child scopes"
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Still value of A"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	;	"Any variable declared in a while loop just like for branches has its own scope"
while_0:
	iload	1
	ldc	3
	if_icmple	compNeg_3
	ldc	1
	goto	compDone_3
compNeg_3:
	ldc	0
compDone_3:

	ifeq	whileDone_0
	iload	1
	ldc	1
	isub

	istore	1

	goto	while_0
whileDone_0:
	;	"Again seen here is that children can edit variables from parent scopes"
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"New value of A after while loop"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	1
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	;	"Since B was declared in branches before it will not conflict here as in the main scope B does not exist yet"
	ldc	5
	istore	4
for_1:
	iload	4
	ldc	3
	if_icmple	compNeg_4
	ldc	1
	goto	compDone_4
compNeg_4:
	ldc	0
compDone_4:

	ifeq	forDone_1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	4
	invokevirtual	java/io/PrintStream/println(I)V

	iload	4
	ldc	-1
	iadd
	istore	4

	goto	for_1
forDone_1:

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	""
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	;	"To demonstrate this further we can assign B like its empty here because it was not added in this scope yet"
	ldc	15
	istore	5

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Declared B with value in main"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	5
	invokevirtual	java/io/PrintStream/println(I)V

	return
.end method