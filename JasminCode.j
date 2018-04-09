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
	.limit	locals	4

	new		java/util/Scanner	
	dup	
	getstatic		java/lang/System/in Ljava/io/InputStream;	
	invokespecial		java/util/Scanner/<init>(Ljava/io/InputStream;)V	
	astore_1
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Please type a number."
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	aload_1
	invokevirtual	java/util/Scanner/nextFloat()F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	invokevirtual java/lang/Float/floatValue()F
	fstore 2
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	fload	2
	invokevirtual	java/io/PrintStream/println(F)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	"Please type a string."
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	aload_1
	invokevirtual	java/util/Scanner/next()Ljava/lang/String;
	astore 3
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	fload	2
	invokevirtual	java/io/PrintStream/println(F)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	aload	3
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

	aload_1
	invokevirtual	java/util/Scanner/close()V
	return
.end method