import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class CompilerException extends RuntimeException {
	public CompilerException(ParserRuleContext ctx, String s ) {
		super(buildMessage(ctx, s));
	}

	private static String buildMessage( ParserRuleContext ctx, String msg ) {
		Token firstToken = ctx.getStart();
		//int line = firstToken.getLine();
		int pos = firstToken.getStartIndex();

		return String.format("LINE %d, POS %d => %s", ctx.start.getLine(),pos, msg);
	}
}
