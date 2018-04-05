// Generated from D:/IdeaProjects/C-OSTexasJavaBasicLanguage\TJB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TJBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ASN=21, CPYASN=22, VAR=23, STRID=24, STR=25, 
		COMPTKN=26, LOGTKN=27, ARRAY=28, INT=29, NIN=30, DBL=31, WS=32;
	public static final int
		RULE_codeLine = 0, RULE_expression = 1, RULE_calculation = 2, RULE_ifTJB = 3, 
		RULE_ifStatement = 4, RULE_thenStatement = 5, RULE_elseStatement = 6, 
		RULE_elseIfStatement = 7, RULE_booleanEXP = 8, RULE_whileTJB = 9, RULE_display = 10, 
		RULE_forTJB = 11, RULE_comment = 12, RULE_displayOptions = 13, RULE_assignment = 14, 
		RULE_arrayBuild = 15, RULE_checkSTRID = 16, RULE_checkVAR = 17, RULE_checkArray = 18;
	public static final String[] ruleNames = {
		"codeLine", "expression", "calculation", "ifTJB", "ifStatement", "thenStatement", 
		"elseStatement", "elseIfStatement", "booleanEXP", "whileTJB", "display", 
		"forTJB", "comment", "displayOptions", "assignment", "arrayBuild", "checkSTRID", 
		"checkVAR", "checkArray"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'%'", "'End'", "'If'", 
		"'Then'", "'Else'", "'!'", "'While'", "'Disp'", "','", "'For'", "'<COM>'", 
		"'</COM>'", "'{'", "'}'", "'->'", "'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ASN", "CPYASN", 
		"VAR", "STRID", "STR", "COMPTKN", "LOGTKN", "ARRAY", "INT", "NIN", "DBL", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TJB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TJBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeLineContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TJBParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CodeLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCodeLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCodeLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCodeLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeLineContext codeLine() throws RecognitionException {
		CodeLineContext _localctx = new CodeLineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codeLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(38);
				expression();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public IfTJBContext ifTJB() {
			return getRuleContext(IfTJBContext.class,0);
		}
		public WhileTJBContext whileTJB() {
			return getRuleContext(WhileTJBContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public ForTJBContext forTJB() {
			return getRuleContext(ForTJBContext.class,0);
		}
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				calculation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				ifTJB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				whileTJB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				forTJB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				booleanEXP(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				comment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculationContext extends ParserRuleContext {
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
	 
		public CalculationContext() { }
		public void copyFrom(CalculationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExNegateContext extends CalculationContext {
		public CalculationContext val;
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public ExNegateContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExModOpContext extends CalculationContext {
		public CalculationContext left;
		public CalculationContext right;
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public ExModOpContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExVarLiteralContext extends CalculationContext {
		public CheckVARContext val;
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public ExVarLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExVarLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExVarLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExVarLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExDblLiteralContext extends CalculationContext {
		public TerminalNode DBL() { return getToken(TJBParser.DBL, 0); }
		public ExDblLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExDblLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExDblLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExDblLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExNegLiteralContext extends CalculationContext {
		public TerminalNode NIN() { return getToken(TJBParser.NIN, 0); }
		public ExNegLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExNegLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExNegLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExNegLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMulOpContext extends CalculationContext {
		public CalculationContext left;
		public CalculationContext right;
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public ExMulOpContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExMulOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAddOpContext extends CalculationContext {
		public CalculationContext left;
		public Token op;
		public CalculationContext right;
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public ExAddOpContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntLiteralContext extends CalculationContext {
		public TerminalNode INT() { return getToken(TJBParser.INT, 0); }
		public ExIntLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExDivOpContext extends CalculationContext {
		public CalculationContext left;
		public CalculationContext right;
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public ExDivOpContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenthesesContext extends CalculationContext {
		public CalculationContext val;
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public ExParenthesesContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		return calculation(0);
	}

	private CalculationContext calculation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalculationContext _localctx = new CalculationContext(_ctx, _parentState);
		CalculationContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_calculation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(T__0);
				setState(58);
				((ExParenthesesContext)_localctx).val = calculation(0);
				setState(59);
				match(T__1);
				}
				break;
			case T__2:
				{
				_localctx = new ExNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__2);
				setState(62);
				((ExNegateContext)_localctx).val = calculation(9);
				}
				break;
			case VAR:
				{
				_localctx = new ExVarLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				((ExVarLiteralContext)_localctx).val = checkVAR();
				}
				break;
			case DBL:
				{
				_localctx = new ExDblLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(DBL);
				}
				break;
			case NIN:
				{
				_localctx = new ExNegLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(NIN);
				}
				break;
			case INT:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulOpContext(new CalculationContext(_parentctx, _parentState));
						((ExMulOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(69);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(70);
						match(T__3);
						setState(71);
						((ExMulOpContext)_localctx).right = calculation(9);
						}
						break;
					case 2:
						{
						_localctx = new ExDivOpContext(new CalculationContext(_parentctx, _parentState));
						((ExDivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(72);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(73);
						match(T__4);
						setState(74);
						((ExDivOpContext)_localctx).right = calculation(8);
						}
						break;
					case 3:
						{
						_localctx = new ExAddOpContext(new CalculationContext(_parentctx, _parentState));
						((ExAddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(75);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(76);
						((ExAddOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__5) ) {
							((ExAddOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						((ExAddOpContext)_localctx).right = calculation(7);
						}
						break;
					case 4:
						{
						_localctx = new ExModOpContext(new CalculationContext(_parentctx, _parentState));
						((ExModOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						match(T__6);
						setState(80);
						((ExModOpContext)_localctx).right = calculation(6);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfTJBContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public List<ElseStatementContext> elseStatement() {
			return getRuleContexts(ElseStatementContext.class);
		}
		public ElseStatementContext elseStatement(int i) {
			return getRuleContext(ElseStatementContext.class,i);
		}
		public IfTJBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTJB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterIfTJB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitIfTJB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitIfTJB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfTJBContext ifTJB() throws RecognitionException {
		IfTJBContext _localctx = new IfTJBContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifTJB);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			ifStatement();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					elseIfStatement();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(93);
				elseStatement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public BooleanEXPContext bool;
		public ThenStatementContext thenStatement() {
			return getRuleContext(ThenStatementContext.class,0);
		}
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__8);
			setState(102);
			((IfStatementContext)_localctx).bool = booleanEXP(0);
			setState(103);
			thenStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenStatementContext thenStatement() throws RecognitionException {
		ThenStatementContext _localctx = new ThenStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__9);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(106);
				expression();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__10);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(113);
				expression();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__10);
			setState(120);
			ifStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanEXPContext extends ParserRuleContext {
		public BooleanEXPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanEXP; }
	 
		public BooleanEXPContext() { }
		public void copyFrom(BooleanEXPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolParenthesesContext extends BooleanEXPContext {
		public BooleanEXPContext bool;
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public BoolParenthesesContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCalcContext extends BooleanEXPContext {
		public CalculationContext calc;
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public BoolCalcContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolCalc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCompLogContext extends BooleanEXPContext {
		public BooleanEXPContext left;
		public Token comp;
		public BooleanEXPContext right;
		public List<BooleanEXPContext> booleanEXP() {
			return getRuleContexts(BooleanEXPContext.class);
		}
		public BooleanEXPContext booleanEXP(int i) {
			return getRuleContext(BooleanEXPContext.class,i);
		}
		public TerminalNode LOGTKN() { return getToken(TJBParser.LOGTKN, 0); }
		public BoolCompLogContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolCompLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolCompLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolCompLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolSTRContext extends BooleanEXPContext {
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public BoolSTRContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolSTR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCompContext extends BooleanEXPContext {
		public BooleanEXPContext left;
		public Token comp;
		public BooleanEXPContext right;
		public List<BooleanEXPContext> booleanEXP() {
			return getRuleContexts(BooleanEXPContext.class);
		}
		public BooleanEXPContext booleanEXP(int i) {
			return getRuleContext(BooleanEXPContext.class,i);
		}
		public TerminalNode COMPTKN() { return getToken(TJBParser.COMPTKN, 0); }
		public BoolCompContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNegContext extends BooleanEXPContext {
		public BooleanEXPContext bool;
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public BoolNegContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolSTRIDContext extends BooleanEXPContext {
		public CheckSTRIDContext str;
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public BoolSTRIDContext(BooleanEXPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterBoolSTRID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitBoolSTRID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBoolSTRID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanEXPContext booleanEXP() throws RecognitionException {
		return booleanEXP(0);
	}

	private BooleanEXPContext booleanEXP(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanEXPContext _localctx = new BooleanEXPContext(_ctx, _parentState);
		BooleanEXPContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_booleanEXP, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(T__0);
				setState(124);
				((BoolParenthesesContext)_localctx).bool = booleanEXP(0);
				setState(125);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__11);
				setState(128);
				((BoolNegContext)_localctx).bool = booleanEXP(6);
				}
				break;
			case 3:
				{
				_localctx = new BoolCalcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				((BoolCalcContext)_localctx).calc = calculation(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolSTRIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				((BoolSTRIDContext)_localctx).str = checkSTRID();
				}
				break;
			case 5:
				{
				_localctx = new BoolSTRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(STR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BoolCompContext(new BooleanEXPContext(_parentctx, _parentState));
						((BoolCompContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
						setState(134);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(135);
						((BoolCompContext)_localctx).comp = match(COMPTKN);
						setState(136);
						((BoolCompContext)_localctx).right = booleanEXP(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolCompLogContext(new BooleanEXPContext(_parentctx, _parentState));
						((BoolCompLogContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
						setState(137);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(138);
						((BoolCompLogContext)_localctx).comp = match(LOGTKN);
						setState(139);
						((BoolCompLogContext)_localctx).right = booleanEXP(5);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WhileTJBContext extends ParserRuleContext {
		public BooleanEXPContext bool;
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhileTJBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileTJB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterWhileTJB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitWhileTJB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitWhileTJB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileTJBContext whileTJB() throws RecognitionException {
		WhileTJBContext _localctx = new WhileTJBContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileTJB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__12);
			setState(146);
			((WhileTJBContext)_localctx).bool = booleanEXP(0);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(147);
				expression();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayContext extends ParserRuleContext {
		public List<DisplayOptionsContext> displayOptions() {
			return getRuleContexts(DisplayOptionsContext.class);
		}
		public DisplayOptionsContext displayOptions(int i) {
			return getRuleContext(DisplayOptionsContext.class,i);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__13);
			setState(156);
			displayOptions();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(157);
				match(T__14);
				setState(158);
				displayOptions();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForTJBContext extends ParserRuleContext {
		public CheckVARContext iterator;
		public Token iterVal;
		public Token comp;
		public Token upper;
		public CalculationContext increments;
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public TerminalNode COMPTKN() { return getToken(TJBParser.COMPTKN, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode VAR() { return getToken(TJBParser.VAR, 0); }
		public List<TerminalNode> INT() { return getTokens(TJBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TJBParser.INT, i);
		}
		public List<TerminalNode> DBL() { return getTokens(TJBParser.DBL); }
		public TerminalNode DBL(int i) {
			return getToken(TJBParser.DBL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForTJBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forTJB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterForTJB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitForTJB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitForTJB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForTJBContext forTJB() throws RecognitionException {
		ForTJBContext _localctx = new ForTJBContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forTJB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__15);
			setState(165);
			((ForTJBContext)_localctx).iterator = checkVAR();
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(166);
				match(T__14);
				setState(167);
				((ForTJBContext)_localctx).iterVal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DBL) ) {
					((ForTJBContext)_localctx).iterVal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(170);
			match(T__14);
			setState(171);
			((ForTJBContext)_localctx).comp = match(COMPTKN);
			setState(172);
			match(T__14);
			setState(173);
			((ForTJBContext)_localctx).upper = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << DBL))) != 0)) ) {
				((ForTJBContext)_localctx).upper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			match(T__14);
			setState(175);
			((ForTJBContext)_localctx).increments = calculation(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(176);
				expression();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	 
		public CommentContext() { }
		public void copyFrom(CommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentLineContext extends CommentContext {
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public CommentLineContext(CommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCommentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCommentLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCommentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment);
		try {
			_localctx = new CommentLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__16);
			setState(185);
			match(STR);
			setState(186);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayOptionsContext extends ParserRuleContext {
		public DisplayOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayOptions; }
	 
		public DisplayOptionsContext() { }
		public void copyFrom(DisplayOptionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DispSTRContext extends DisplayOptionsContext {
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public DispSTRContext(DisplayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterDispSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitDispSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitDispSTR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispCalcContext extends DisplayOptionsContext {
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public DispCalcContext(DisplayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterDispCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitDispCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitDispCalc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispSTRIDContext extends DisplayOptionsContext {
		public CheckSTRIDContext name;
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public DispSTRIDContext(DisplayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterDispSTRID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitDispSTRID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitDispSTRID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispArrayContext extends DisplayOptionsContext {
		public CheckArrayContext name;
		public CheckArrayContext checkArray() {
			return getRuleContext(CheckArrayContext.class,0);
		}
		public DispArrayContext(DisplayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterDispArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitDispArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitDispArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayOptionsContext displayOptions() throws RecognitionException {
		DisplayOptionsContext _localctx = new DisplayOptionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_displayOptions);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				_localctx = new DispSTRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(STR);
				}
				break;
			case STRID:
				_localctx = new DispSTRIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((DispSTRIDContext)_localctx).name = checkSTRID();
				}
				break;
			case T__0:
			case T__2:
			case VAR:
			case INT:
			case NIN:
			case DBL:
				_localctx = new DispCalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				calculation(0);
				}
				break;
			case ARRAY:
				_localctx = new DispArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				((DispArrayContext)_localctx).name = checkArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrAsnContext extends AssignmentContext {
		public Token value;
		public CheckSTRIDContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public StrAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrCpyAsnContext extends AssignmentContext {
		public CheckArrayContext value;
		public CheckArrayContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public List<CheckArrayContext> checkArray() {
			return getRuleContexts(CheckArrayContext.class);
		}
		public CheckArrayContext checkArray(int i) {
			return getRuleContext(CheckArrayContext.class,i);
		}
		public ArrCpyAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterArrCpyAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitArrCpyAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrCpyAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrAsnVARContext extends AssignmentContext {
		public CheckArrayContext value;
		public CheckArrayContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public List<CheckArrayContext> checkArray() {
			return getRuleContexts(CheckArrayContext.class);
		}
		public CheckArrayContext checkArray(int i) {
			return getRuleContext(CheckArrayContext.class,i);
		}
		public ArrAsnVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterArrAsnVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitArrAsnVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrAsnVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrAsnNEWVARContext extends AssignmentContext {
		public Token value;
		public CheckSTRIDContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public StrAsnNEWVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrAsnNEWVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrAsnNEWVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrAsnNEWVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrCpyAsnContext extends AssignmentContext {
		public CheckSTRIDContext value;
		public CheckSTRIDContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public List<CheckSTRIDContext> checkSTRID() {
			return getRuleContexts(CheckSTRIDContext.class);
		}
		public CheckSTRIDContext checkSTRID(int i) {
			return getRuleContext(CheckSTRIDContext.class,i);
		}
		public StrCpyAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrCpyAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrCpyAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrCpyAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAsnContext extends AssignmentContext {
		public CalculationContext value;
		public CheckVARContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public NumAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterNumAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitNumAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAsnVARContext extends AssignmentContext {
		public CalculationContext value;
		public CheckVARContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public NumAsnVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterNumAsnVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitNumAsnVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsnVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrAsnContext extends AssignmentContext {
		public ArrayBuildContext value;
		public CheckArrayContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public ArrayBuildContext arrayBuild() {
			return getRuleContext(ArrayBuildContext.class,0);
		}
		public CheckArrayContext checkArray() {
			return getRuleContext(CheckArrayContext.class,0);
		}
		public ArrAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterArrAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitArrAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrAsnVARContext extends AssignmentContext {
		public CheckSTRIDContext value;
		public CheckSTRIDContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public List<CheckSTRIDContext> checkSTRID() {
			return getRuleContexts(CheckSTRIDContext.class);
		}
		public CheckSTRIDContext checkSTRID(int i) {
			return getRuleContext(CheckSTRIDContext.class,i);
		}
		public StrAsnVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrAsnVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrAsnVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrAsnVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NumAsnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((NumAsnContext)_localctx).value = calculation(0);
				setState(195);
				match(ASN);
				setState(196);
				((NumAsnContext)_localctx).name = checkVAR();
				}
				break;
			case 2:
				_localctx = new StrAsnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((StrAsnContext)_localctx).value = match(STR);
				setState(199);
				match(ASN);
				setState(200);
				((StrAsnContext)_localctx).name = checkSTRID();
				}
				break;
			case 3:
				_localctx = new StrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((StrCpyAsnContext)_localctx).value = checkSTRID();
				setState(202);
				match(ASN);
				setState(203);
				((StrCpyAsnContext)_localctx).name = checkSTRID();
				}
				break;
			case 4:
				_localctx = new ArrAsnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((ArrAsnContext)_localctx).value = arrayBuild();
				setState(206);
				match(ASN);
				setState(207);
				((ArrAsnContext)_localctx).name = checkArray();
				}
				break;
			case 5:
				_localctx = new ArrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				((ArrCpyAsnContext)_localctx).value = checkArray();
				setState(210);
				match(ASN);
				setState(211);
				((ArrCpyAsnContext)_localctx).name = checkArray();
				}
				break;
			case 6:
				_localctx = new ArrAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				((ArrAsnVARContext)_localctx).value = checkArray();
				setState(214);
				match(CPYASN);
				setState(215);
				((ArrAsnVARContext)_localctx).name = checkArray();
				}
				break;
			case 7:
				_localctx = new NumAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				((NumAsnVARContext)_localctx).value = calculation(0);
				setState(218);
				match(CPYASN);
				setState(219);
				((NumAsnVARContext)_localctx).name = checkVAR();
				}
				break;
			case 8:
				_localctx = new StrAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				((StrAsnVARContext)_localctx).value = checkSTRID();
				setState(222);
				match(CPYASN);
				setState(223);
				((StrAsnVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 9:
				_localctx = new StrAsnNEWVARContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				((StrAsnNEWVARContext)_localctx).value = match(STR);
				setState(226);
				match(CPYASN);
				setState(227);
				((StrAsnNEWVARContext)_localctx).name = checkSTRID();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayBuildContext extends ParserRuleContext {
		public List<TerminalNode> NIN() { return getTokens(TJBParser.NIN); }
		public TerminalNode NIN(int i) {
			return getToken(TJBParser.NIN, i);
		}
		public List<TerminalNode> INT() { return getTokens(TJBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TJBParser.INT, i);
		}
		public List<TerminalNode> DBL() { return getTokens(TJBParser.DBL); }
		public TerminalNode DBL(int i) {
			return getToken(TJBParser.DBL, i);
		}
		public ArrayBuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBuild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterArrayBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitArrayBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrayBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBuildContext arrayBuild() throws RecognitionException {
		ArrayBuildContext _localctx = new ArrayBuildContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayBuild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__18);
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(232);
				match(T__14);
				setState(233);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckSTRIDContext extends ParserRuleContext {
		public Token STRID;
		public TerminalNode STRID() { return getToken(TJBParser.STRID, 0); }
		public CheckSTRIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSTRID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCheckSTRID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCheckSTRID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCheckSTRID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckSTRIDContext checkSTRID() throws RecognitionException {
		CheckSTRIDContext _localctx = new CheckSTRIDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_checkSTRID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((CheckSTRIDContext)_localctx).STRID = match(STRID);

			        final String strid = (((CheckSTRIDContext)_localctx).STRID!=null?((CheckSTRIDContext)_localctx).STRID.getText():null);
			        if (strid.length() > 4) {
			            throw new RuntimeException(strid + " Cannot be more than 4 characters.");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckVARContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode VAR() { return getToken(TJBParser.VAR, 0); }
		public CheckVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkVAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCheckVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCheckVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCheckVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckVARContext checkVAR() throws RecognitionException {
		CheckVARContext _localctx = new CheckVARContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_checkVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((CheckVARContext)_localctx).VAR = match(VAR);

			        final String strid = (((CheckVARContext)_localctx).VAR!=null?((CheckVARContext)_localctx).VAR.getText():null);
			        if (strid.length() > 1) {
			            throw new RuntimeException(strid + " Cannot be more than 1 characters.");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckArrayContext extends ParserRuleContext {
		public Token ARRAY;
		public TerminalNode ARRAY() { return getToken(TJBParser.ARRAY, 0); }
		public CheckArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCheckArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCheckArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCheckArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckArrayContext checkArray() throws RecognitionException {
		CheckArrayContext _localctx = new CheckArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_checkArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((CheckArrayContext)_localctx).ARRAY = match(ARRAY);

			        final String id = (((CheckArrayContext)_localctx).ARRAY!=null?((CheckArrayContext)_localctx).ARRAY.getText():null);
			        if(id.charAt(0) == 'L'){
			            int number = Integer.parseInt(String.valueOf(id.charAt(1)));
			            if(id.length() > 2){
			            throw new RuntimeException(id + " Cannot be more than 2 characters.");
			            } else if (number > 6 || number < 1){
			            throw new RuntimeException(id + " Number must be between 1 and 6.");
			            }
			        } else {
			            if (id.length() > 5){
			            throw new RuntimeException(id + " Cannot be more than 5 characters.");
			            }
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return calculation_sempred((CalculationContext)_localctx, predIndex);
		case 8:
			return booleanEXP_sempred((BooleanEXPContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean calculation_sempred(CalculationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean booleanEXP_sempred(BooleanEXPContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4F\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4T\n\4\f"+
		"\4\16\4W\13\4\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\7\5a\n\5\f\5\16\5d\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\b\3\b\7\b"+
		"u\n\b\f\b\16\bx\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0087\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092"+
		"\13\n\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\r\3\r\3\r\3\r\5\r"+
		"\u00ab\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\21\3\21\3\21\3\21\7\21\u00ed"+
		"\n\21\f\21\16\21\u00f0\13\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\2\4\6\22\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\6\4\2\5\5\b\b\4\2\37\37!!\5\2\31\31\37\37!!\3\2\37!\2\u0114\2"+
		"+\3\2\2\2\48\3\2\2\2\6E\3\2\2\2\bX\3\2\2\2\ng\3\2\2\2\fk\3\2\2\2\16r\3"+
		"\2\2\2\20y\3\2\2\2\22\u0086\3\2\2\2\24\u0093\3\2\2\2\26\u009d\3\2\2\2"+
		"\30\u00a6\3\2\2\2\32\u00ba\3\2\2\2\34\u00c2\3\2\2\2\36\u00e6\3\2\2\2 "+
		"\u00e8\3\2\2\2\"\u00f3\3\2\2\2$\u00f6\3\2\2\2&\u00f9\3\2\2\2(*\5\4\3\2"+
		")(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2\3"+
		"/\3\3\2\2\2\609\5\36\20\2\619\5\6\4\2\629\5\b\5\2\639\5\24\13\2\649\5"+
		"\26\f\2\659\5\30\r\2\669\5\22\n\2\679\5\32\16\28\60\3\2\2\28\61\3\2\2"+
		"\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2"+
		"\2\29\5\3\2\2\2:;\b\4\1\2;<\7\3\2\2<=\5\6\4\2=>\7\4\2\2>F\3\2\2\2?@\7"+
		"\5\2\2@F\5\6\4\13AF\5$\23\2BF\7!\2\2CF\7 \2\2DF\7\37\2\2E:\3\2\2\2E?\3"+
		"\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FU\3\2\2\2GH\f\n\2\2HI\7"+
		"\6\2\2IT\5\6\4\13JK\f\t\2\2KL\7\7\2\2LT\5\6\4\nMN\f\b\2\2NO\t\2\2\2OT"+
		"\5\6\4\tPQ\f\7\2\2QR\7\t\2\2RT\5\6\4\bSG\3\2\2\2SJ\3\2\2\2SM\3\2\2\2S"+
		"P\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WU\3\2\2\2X\\\5\n\6"+
		"\2Y[\5\20\t\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3"+
		"\2\2\2_a\5\16\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db"+
		"\3\2\2\2ef\7\n\2\2f\t\3\2\2\2gh\7\13\2\2hi\5\22\n\2ij\5\f\7\2j\13\3\2"+
		"\2\2ko\7\f\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3"+
		"\2\2\2qo\3\2\2\2rv\7\r\2\2su\5\4\3\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\7\r\2\2z{\5\n\6\2{\21\3\2\2\2|}\b\n\1\2"+
		"}~\7\3\2\2~\177\5\22\n\2\177\u0080\7\4\2\2\u0080\u0087\3\2\2\2\u0081\u0082"+
		"\7\16\2\2\u0082\u0087\5\22\n\b\u0083\u0087\5\6\4\2\u0084\u0087\5\"\22"+
		"\2\u0085\u0087\7\33\2\2\u0086|\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0083"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0090\3\2\2\2\u0088"+
		"\u0089\f\7\2\2\u0089\u008a\7\34\2\2\u008a\u008f\5\22\n\b\u008b\u008c\f"+
		"\6\2\2\u008c\u008d\7\35\2\2\u008d\u008f\5\22\n\7\u008e\u0088\3\2\2\2\u008e"+
		"\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\23\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\17\2\2\u0094\u0098"+
		"\5\22\n\2\u0095\u0097\5\4\3\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7\n\2\2\u009c\25\3\2\2\2\u009d\u009e\7\20\2\2\u009e"+
		"\u00a3\5\34\17\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\5\34\17\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00aa\5$\23"+
		"\2\u00a8\u00a9\7\21\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\7"+
		"\34\2\2\u00ae\u00af\7\21\2\2\u00af\u00b0\t\4\2\2\u00b0\u00b1\7\21\2\2"+
		"\u00b1\u00b5\5\6\4\2\u00b2\u00b4\5\4\3\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\n\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\23\2"+
		"\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\7\24\2\2\u00bd\33\3\2\2\2\u00be\u00c3"+
		"\7\33\2\2\u00bf\u00c3\5\"\22\2\u00c0\u00c3\5\6\4\2\u00c1\u00c3\5&\24\2"+
		"\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\7\27\2\2\u00c6"+
		"\u00c7\5$\23\2\u00c7\u00e7\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\7"+
		"\27\2\2\u00ca\u00e7\5\"\22\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\7\27\2\2"+
		"\u00cd\u00ce\5\"\22\2\u00ce\u00e7\3\2\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1"+
		"\7\27\2\2\u00d1\u00d2\5&\24\2\u00d2\u00e7\3\2\2\2\u00d3\u00d4\5&\24\2"+
		"\u00d4\u00d5\7\27\2\2\u00d5\u00d6\5&\24\2\u00d6\u00e7\3\2\2\2\u00d7\u00d8"+
		"\5&\24\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\5&\24\2\u00da\u00e7\3\2\2\2"+
		"\u00db\u00dc\5\6\4\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\5$\23\2\u00de\u00e7"+
		"\3\2\2\2\u00df\u00e0\5\"\22\2\u00e0\u00e1\7\30\2\2\u00e1\u00e2\5\"\22"+
		"\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5\7\30\2\2\u00e5"+
		"\u00e7\5\"\22\2\u00e6\u00c4\3\2\2\2\u00e6\u00c8\3\2\2\2\u00e6\u00cb\3"+
		"\2\2\2\u00e6\u00cf\3\2\2\2\u00e6\u00d3\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6"+
		"\u00db\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\37\3\2\2"+
		"\2\u00e8\u00e9\7\25\2\2\u00e9\u00ee\t\5\2\2\u00ea\u00eb\7\21\2\2\u00eb"+
		"\u00ed\t\5\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\7\26\2\2\u00f2!\3\2\2\2\u00f3\u00f4\7\32\2\2\u00f4\u00f5\b\22\1"+
		"\2\u00f5#\3\2\2\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8\b\23\1\2\u00f8%\3\2"+
		"\2\2\u00f9\u00fa\7\36\2\2\u00fa\u00fb\b\24\1\2\u00fb\'\3\2\2\2\25+8ES"+
		"U\\bov\u0086\u008e\u0090\u0098\u00a3\u00aa\u00b5\u00c2\u00e6\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}