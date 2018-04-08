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
	.limit	locals	3

	new		java/util/Scanner	
	dup	
	getstatic		java/lang/System/in Ljava/io/InputStream;	
	invokespecial		java/util/Scanner/<init>(Ljava/io/InputStream;)V	
	astore_1
	aload_1
	invokevirtual	java/util/Scanner/nextInt()I
	istore 2
	aload_1
	invokevirtual	java/util/Scanner/close()V
	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	iload	2
	invokevirtual	java/io/PrintStream/println(I)V

	getstatic	java/lang/System/out	Ljava/io/PrintStream;
	ldc	5
	invokevirtual	java/io/PrintStream/println(I)V

	return
.end method