// Generated from D:/School/Projects/Java Projects/C-OSTexasJavaBasicLanguage-Main\TJB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TJBParser}.
 */
public interface TJBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TJBParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterCodeLine(TJBParser.CodeLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitCodeLine(TJBParser.CodeLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TJBParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TJBParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExNegate}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExNegate(TJBParser.ExNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExNegate}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExNegate(TJBParser.ExNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExModOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExModOp(TJBParser.ExModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExModOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExModOp(TJBParser.ExModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExVarLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExVarLiteral(TJBParser.ExVarLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExVarLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExVarLiteral(TJBParser.ExVarLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExDblLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExDblLiteral(TJBParser.ExDblLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExDblLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExDblLiteral(TJBParser.ExDblLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExNegLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExNegLiteral(TJBParser.ExNegLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExNegLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExNegLiteral(TJBParser.ExNegLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExMulOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExMulOp(TJBParser.ExMulOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExMulOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExMulOp(TJBParser.ExMulOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExAddOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExAddOp(TJBParser.ExAddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExAddOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExAddOp(TJBParser.ExAddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExIntLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExIntLiteral(TJBParser.ExIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExIntLiteral}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExIntLiteral(TJBParser.ExIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExDivOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExDivOp(TJBParser.ExDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExDivOp}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExDivOp(TJBParser.ExDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterExParentheses(TJBParser.ExParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link TJBParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitExParentheses(TJBParser.ExParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#ifTJB}.
	 * @param ctx the parse tree
	 */
	void enterIfTJB(TJBParser.IfTJBContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#ifTJB}.
	 * @param ctx the parse tree
	 */
	void exitIfTJB(TJBParser.IfTJBContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TJBParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TJBParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void enterThenStatement(TJBParser.ThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void exitThenStatement(TJBParser.ThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(TJBParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(TJBParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(TJBParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(TJBParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolParentheses}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void enterBoolParentheses(TJBParser.BoolParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolParentheses}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void exitBoolParentheses(TJBParser.BoolParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolCalc}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void enterBoolCalc(TJBParser.BoolCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolCalc}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void exitBoolCalc(TJBParser.BoolCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolSTR}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void enterBoolSTR(TJBParser.BoolSTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolSTR}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void exitBoolSTR(TJBParser.BoolSTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolComp}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void enterBoolComp(TJBParser.BoolCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolComp}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void exitBoolComp(TJBParser.BoolCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNeg}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void enterBoolNeg(TJBParser.BoolNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNeg}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void exitBoolNeg(TJBParser.BoolNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolSTRID}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void enterBoolSTRID(TJBParser.BoolSTRIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolSTRID}
	 * labeled alternative in {@link TJBParser#booleanEXP}.
	 * @param ctx the parse tree
	 */
	void exitBoolSTRID(TJBParser.BoolSTRIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#whileTJB}.
	 * @param ctx the parse tree
	 */
	void enterWhileTJB(TJBParser.WhileTJBContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#whileTJB}.
	 * @param ctx the parse tree
	 */
	void exitWhileTJB(TJBParser.WhileTJBContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(TJBParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(TJBParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#forTJB}.
	 * @param ctx the parse tree
	 */
	void enterForTJB(TJBParser.ForTJBContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#forTJB}.
	 * @param ctx the parse tree
	 */
	void exitForTJB(TJBParser.ForTJBContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(TJBParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(TJBParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DispSTR}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void enterDispSTR(TJBParser.DispSTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DispSTR}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void exitDispSTR(TJBParser.DispSTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DispSTRID}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void enterDispSTRID(TJBParser.DispSTRIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DispSTRID}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void exitDispSTRID(TJBParser.DispSTRIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DispCalc}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void enterDispCalc(TJBParser.DispCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DispCalc}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void exitDispCalc(TJBParser.DispCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DispArray}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void enterDispArray(TJBParser.DispArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DispArray}
	 * labeled alternative in {@link TJBParser#displayOptions}.
	 * @param ctx the parse tree
	 */
	void exitDispArray(TJBParser.DispArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNumAsn(TJBParser.NumAsnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNumAsn(TJBParser.NumAsnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStrAsn(TJBParser.StrAsnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStrAsn(TJBParser.StrAsnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrCpyAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStrCpyAsn(TJBParser.StrCpyAsnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrCpyAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStrCpyAsn(TJBParser.StrCpyAsnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrAsn(TJBParser.ArrAsnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrAsn(TJBParser.ArrAsnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrCpyAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrCpyAsn(TJBParser.ArrCpyAsnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrCpyAsn}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrAsnVAR(TJBParser.ArrAsnVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrAsnVAR(TJBParser.ArrAsnVARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNumAsnVAR(TJBParser.NumAsnVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNumAsnVAR(TJBParser.NumAsnVARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStrAsnVAR(TJBParser.StrAsnVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrAsnVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStrAsnVAR(TJBParser.StrAsnVARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrAsnNEWVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrAsnNEWVAR}
	 * labeled alternative in {@link TJBParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#arrayBuild}.
	 * @param ctx the parse tree
	 */
	void enterArrayBuild(TJBParser.ArrayBuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#arrayBuild}.
	 * @param ctx the parse tree
	 */
	void exitArrayBuild(TJBParser.ArrayBuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#checkSTRID}.
	 * @param ctx the parse tree
	 */
	void enterCheckSTRID(TJBParser.CheckSTRIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#checkSTRID}.
	 * @param ctx the parse tree
	 */
	void exitCheckSTRID(TJBParser.CheckSTRIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#checkVAR}.
	 * @param ctx the parse tree
	 */
	void enterCheckVAR(TJBParser.CheckVARContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#checkVAR}.
	 * @param ctx the parse tree
	 */
	void exitCheckVAR(TJBParser.CheckVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJBParser#checkArray}.
	 * @param ctx the parse tree
	 */
	void enterCheckArray(TJBParser.CheckArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJBParser#checkArray}.
	 * @param ctx the parse tree
	 */
	void exitCheckArray(TJBParser.CheckArrayContext ctx);
}