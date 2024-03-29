// Generated from D:/School/Projects/Java Projects/C-OSTexasJavaBasicLanguage\TJB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TJBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TJBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TJBParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeLine(TJBParser.CodeLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TJBParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExArrLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExArrLiteral(TJBParser.ExArrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNegate}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNegate(TJBParser.ExNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExModOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExModOp(TJBParser.ExModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExVarLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExVarLiteral(TJBParser.ExVarLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExDblLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExDblLiteral(TJBParser.ExDblLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNegLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNegLiteral(TJBParser.ExNegLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAsnUsrDbl}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAsnUsrDbl(TJBParser.ExAsnUsrDblContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAddOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAddOp(TJBParser.ExAddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIntLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIntLiteral(TJBParser.ExIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParentheses(TJBParser.ExParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAsnUsrInt}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAsnUsrInt(TJBParser.ExAsnUsrIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMulDivOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMulDivOp(TJBParser.ExMulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#ifTJB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTJB(TJBParser.IfTJBContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TJBParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#thenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenStatement(TJBParser.ThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(TJBParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(TJBParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParentheses}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParentheses(TJBParser.BoolParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolCalc}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCalc(TJBParser.BoolCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolCompLog}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompLog(TJBParser.BoolCompLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolSTR}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSTR(TJBParser.BoolSTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolComp}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolComp(TJBParser.BoolCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNeg}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNeg(TJBParser.BoolNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolSTRID}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSTRID(TJBParser.BoolSTRIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#whileTJB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileTJB(TJBParser.WhileTJBContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(TJBParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#forTJB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForTJB(TJBParser.ForTJBContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#incrementEXP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementEXP(TJBParser.IncrementEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommentLine}
	 * labeled alternative in {@link TJBParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentLine(TJBParser.CommentLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DispSTR}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispSTR(TJBParser.DispSTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DispSTRID}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispSTRID(TJBParser.DispSTRIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DispCalc}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispCalc(TJBParser.DispCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DispArray}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispArray(TJBParser.DispArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DispUsrString}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispUsrString(TJBParser.DispUsrStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAsn(TJBParser.NumAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrAsn(TJBParser.StrAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrCpyAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAsn(TJBParser.ArrAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrCpyAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAsnVAR(TJBParser.ArrAsnVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAsnVAR(TJBParser.NumAsnVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrAsnVAR(TJBParser.StrAsnVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrAsnNEWVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrAsnUsrIn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrAsnUsrIn(TJBParser.StrAsnUsrInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrAsnUsrInVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrAsnUsrInVAR(TJBParser.StrAsnUsrInVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScannerAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScannerAsn(TJBParser.ScannerAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScannerCls}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScannerCls(TJBParser.ScannerClsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsnArrVal}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsnArrVal(TJBParser.AsnArrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrArrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArrAsn(TJBParser.StrArrAsnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrArrAsnVar}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArrAsnVar(TJBParser.StrArrAsnVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrArrValUsrIn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArrValUsrIn(TJBParser.StrArrValUsrInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsnStrFromArr}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsnStrFromArr(TJBParser.AsnStrFromArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CpyAsnStrFromArr}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpyAsnStrFromArr(TJBParser.CpyAsnStrFromArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#arrayBuild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBuild(TJBParser.ArrayBuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#arrayGetValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayGetValue(TJBParser.ArrayGetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#stringUsrIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringUsrIn(TJBParser.StringUsrInContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#checkSTRID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSTRID(TJBParser.CheckSTRIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#checkSCNID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSCNID(TJBParser.CheckSCNIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#checkVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckVAR(TJBParser.CheckVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link TJBParser#checkArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckArray(TJBParser.CheckArrayContext ctx);
}