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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ASN=29, CPYASN=30, VAR=31, STRID=32, 
		SCNID=33, STR=34, COMPTKN=35, LOGTKN=36, ARRAY=37, INT=38, NIN=39, DBL=40, 
		WS=41;
	public static final int
		RULE_codeLine = 0, RULE_expression = 1, RULE_calculation = 2, RULE_ifTJB = 3, 
		RULE_ifStatement = 4, RULE_thenStatement = 5, RULE_elseStatement = 6, 
		RULE_elseIfStatement = 7, RULE_booleanEXP = 8, RULE_whileTJB = 9, RULE_display = 10, 
		RULE_forTJB = 11, RULE_incrementEXP = 12, RULE_comment = 13, RULE_displayOptions = 14, 
		RULE_assignment = 15, RULE_arrayBuild = 16, RULE_checkSTRID = 17, RULE_checkSCNID = 18, 
		RULE_checkVAR = 19, RULE_checkArray = 20;
	public static final String[] ruleNames = {
		"codeLine", "expression", "calculation", "ifTJB", "ifStatement", "thenStatement", 
		"elseStatement", "elseIfStatement", "booleanEXP", "whileTJB", "display", 
		"forTJB", "incrementEXP", "comment", "displayOptions", "assignment", "arrayBuild", 
		"checkSTRID", "checkSCNID", "checkVAR", "checkArray"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'%'", "'End'", "'If'", 
		"'Then'", "'Else'", "'Else if'", "'!'", "'While'", "'Disp'", "','", "'For'", 
		"'+='", "'<COM>'", "'</COM>'", "'.nextStr'", "'.nextInt'", "'.nextDbl'", 
		"'Scanner '", "';'", "'.close'", "'{'", "'}'", "'->'", "'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ASN", "CPYASN", "VAR", "STRID", "SCNID", 
		"STR", "COMPTKN", "LOGTKN", "ARRAY", "INT", "NIN", "DBL", "WS"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__23) | (1L << T__26) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(42);
				expression();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				calculation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				ifTJB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				whileTJB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				forTJB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				booleanEXP(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
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
	public static class ExMulDivOpContext extends CalculationContext {
		public CalculationContext left;
		public Token op;
		public CalculationContext right;
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public ExMulDivOpContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExMulDivOp(this);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(T__0);
				setState(62);
				((ExParenthesesContext)_localctx).val = calculation(0);
				setState(63);
				match(T__1);
				}
				break;
			case T__2:
				{
				_localctx = new ExNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__2);
				setState(66);
				((ExNegateContext)_localctx).val = calculation(8);
				}
				break;
			case VAR:
				{
				_localctx = new ExVarLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				((ExVarLiteralContext)_localctx).val = checkVAR();
				}
				break;
			case DBL:
				{
				_localctx = new ExDblLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(DBL);
				}
				break;
			case NIN:
				{
				_localctx = new ExNegLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(NIN);
				}
				break;
			case INT:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulDivOpContext(new CalculationContext(_parentctx, _parentState));
						((ExMulDivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(74);
						((ExMulDivOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExMulDivOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						((ExMulDivOpContext)_localctx).right = calculation(8);
						}
						break;
					case 2:
						{
						_localctx = new ExAddOpContext(new CalculationContext(_parentctx, _parentState));
						((ExAddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(76);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(77);
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
						setState(78);
						((ExAddOpContext)_localctx).right = calculation(7);
						}
						break;
					case 3:
						{
						_localctx = new ExModOpContext(new CalculationContext(_parentctx, _parentState));
						((ExModOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(79);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(80);
						match(T__6);
						setState(81);
						((ExModOpContext)_localctx).right = calculation(6);
						}
						break;
					}
					} 
				}
				setState(86);
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
		public ElseStatementContext elsePart;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			ifStatement();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(88);
				elseIfStatement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(94);
				((IfTJBContext)_localctx).elsePart = elseStatement();
				}
			}

			setState(97);
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
			setState(99);
			match(T__8);
			setState(100);
			((IfStatementContext)_localctx).bool = booleanEXP(0);
			setState(101);
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
			setState(103);
			match(T__9);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__23) | (1L << T__26) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(104);
				expression();
				}
				}
				setState(109);
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
			setState(110);
			match(T__10);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__23) | (1L << T__26) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(111);
				expression();
				}
				}
				setState(116);
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
		public BooleanEXPContext bool;
		public ThenStatementContext thenStatement() {
			return getRuleContext(ThenStatementContext.class,0);
		}
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
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
			setState(117);
			match(T__11);
			setState(118);
			((ElseIfStatementContext)_localctx).bool = booleanEXP(0);
			setState(119);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(T__0);
				setState(123);
				((BoolParenthesesContext)_localctx).bool = booleanEXP(0);
				setState(124);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__12);
				setState(127);
				((BoolNegContext)_localctx).bool = booleanEXP(6);
				}
				break;
			case 3:
				{
				_localctx = new BoolCalcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				((BoolCalcContext)_localctx).calc = calculation(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolSTRIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				((BoolSTRIDContext)_localctx).str = checkSTRID();
				}
				break;
			case 5:
				{
				_localctx = new BoolSTRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(STR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BoolCompContext(new BooleanEXPContext(_parentctx, _parentState));
						((BoolCompContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						((BoolCompContext)_localctx).comp = match(COMPTKN);
						setState(135);
						((BoolCompContext)_localctx).right = booleanEXP(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolCompLogContext(new BooleanEXPContext(_parentctx, _parentState));
						((BoolCompLogContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						((BoolCompLogContext)_localctx).comp = match(LOGTKN);
						setState(138);
						((BoolCompLogContext)_localctx).right = booleanEXP(5);
						}
						break;
					}
					} 
				}
				setState(143);
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
			setState(144);
			match(T__13);
			setState(145);
			((WhileTJBContext)_localctx).bool = booleanEXP(0);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__23) | (1L << T__26) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(146);
				expression();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
			setState(154);
			match(T__14);
			setState(155);
			displayOptions();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(156);
				match(T__15);
				setState(157);
				displayOptions();
				}
				}
				setState(162);
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
		public BooleanEXPContext comp;
		public IncrementEXPContext increments;
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public IncrementEXPContext incrementEXP() {
			return getRuleContext(IncrementEXPContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT() { return getToken(TJBParser.INT, 0); }
		public TerminalNode DBL() { return getToken(TJBParser.DBL, 0); }
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
			setState(163);
			match(T__16);
			setState(164);
			match(T__0);
			setState(165);
			((ForTJBContext)_localctx).iterator = checkVAR();
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(166);
				match(T__15);
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
			match(T__15);
			setState(171);
			((ForTJBContext)_localctx).comp = booleanEXP(0);
			setState(172);
			match(T__15);
			setState(173);
			((ForTJBContext)_localctx).increments = incrementEXP();
			setState(174);
			match(T__1);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__23) | (1L << T__26) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(175);
				expression();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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

	public static class IncrementEXPContext extends ParserRuleContext {
		public CheckVARContext nameVar;
		public CalculationContext calc;
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public IncrementEXPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementEXP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterIncrementEXP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitIncrementEXP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitIncrementEXP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementEXPContext incrementEXP() throws RecognitionException {
		IncrementEXPContext _localctx = new IncrementEXPContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_incrementEXP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((IncrementEXPContext)_localctx).nameVar = checkVAR();
			setState(184);
			match(T__17);
			setState(185);
			((IncrementEXPContext)_localctx).calc = calculation(0);
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
		enterRule(_localctx, 26, RULE_comment);
		try {
			_localctx = new CommentLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__18);
			setState(188);
			match(STR);
			setState(189);
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
		public CalculationContext calc;
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
		enterRule(_localctx, 28, RULE_displayOptions);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				_localctx = new DispSTRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(STR);
				}
				break;
			case STRID:
				_localctx = new DispSTRIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
				setState(193);
				((DispCalcContext)_localctx).calc = calculation(0);
				}
				break;
			case ARRAY:
				_localctx = new DispArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
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
	public static class ScannerAsnContext extends AssignmentContext {
		public CheckSCNIDContext name;
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public ScannerAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterScannerAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitScannerAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitScannerAsn(this);
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
	public static class NumAsnUsrIntContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckVARContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public NumAsnUsrIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterNumAsnUsrInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitNumAsnUsrInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsnUsrInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAsnUsrDblContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckVARContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public NumAsnUsrDblContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterNumAsnUsrDbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitNumAsnUsrDbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsnUsrDbl(this);
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
	public static class StrAsnUsrInVARContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckSTRIDContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public StrAsnUsrInVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrAsnUsrInVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrAsnUsrInVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrAsnUsrInVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScannerClsContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public ScannerClsContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterScannerCls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitScannerCls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitScannerCls(this);
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
	public static class NumAsnUsrIntVARContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckVARContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public NumAsnUsrIntVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterNumAsnUsrIntVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitNumAsnUsrIntVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsnUsrIntVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrAsnUsrInContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckSTRIDContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public StrAsnUsrInContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrAsnUsrIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrAsnUsrIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrAsnUsrIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAsnUsrDblVARContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public CheckVARContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public CheckVARContext checkVAR() {
			return getRuleContext(CheckVARContext.class,0);
		}
		public NumAsnUsrDblVARContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterNumAsnUsrDblVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitNumAsnUsrDblVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsnUsrDblVAR(this);
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

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NumAsnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((NumAsnContext)_localctx).value = calculation(0);
				setState(198);
				match(ASN);
				setState(199);
				((NumAsnContext)_localctx).name = checkVAR();
				}
				break;
			case 2:
				_localctx = new StrAsnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((StrAsnContext)_localctx).value = match(STR);
				setState(202);
				match(ASN);
				setState(203);
				((StrAsnContext)_localctx).name = checkSTRID();
				}
				break;
			case 3:
				_localctx = new StrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((StrCpyAsnContext)_localctx).value = checkSTRID();
				setState(205);
				match(ASN);
				setState(206);
				((StrCpyAsnContext)_localctx).name = checkSTRID();
				}
				break;
			case 4:
				_localctx = new ArrAsnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				((ArrAsnContext)_localctx).value = arrayBuild();
				setState(209);
				match(ASN);
				setState(210);
				((ArrAsnContext)_localctx).name = checkArray();
				}
				break;
			case 5:
				_localctx = new ArrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				((ArrCpyAsnContext)_localctx).value = checkArray();
				setState(213);
				match(ASN);
				setState(214);
				((ArrCpyAsnContext)_localctx).name = checkArray();
				}
				break;
			case 6:
				_localctx = new ArrAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				((ArrAsnVARContext)_localctx).value = checkArray();
				setState(217);
				match(CPYASN);
				setState(218);
				((ArrAsnVARContext)_localctx).name = checkArray();
				}
				break;
			case 7:
				_localctx = new NumAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				((NumAsnVARContext)_localctx).value = calculation(0);
				setState(221);
				match(CPYASN);
				setState(222);
				((NumAsnVARContext)_localctx).name = checkVAR();
				}
				break;
			case 8:
				_localctx = new StrAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(224);
				((StrAsnVARContext)_localctx).value = checkSTRID();
				setState(225);
				match(CPYASN);
				setState(226);
				((StrAsnVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 9:
				_localctx = new StrAsnNEWVARContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				((StrAsnNEWVARContext)_localctx).value = match(STR);
				setState(229);
				match(CPYASN);
				setState(230);
				((StrAsnNEWVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 10:
				_localctx = new StrAsnUsrInContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(231);
				((StrAsnUsrInContext)_localctx).scnr = checkSCNID();
				setState(232);
				match(T__20);
				setState(233);
				match(ASN);
				setState(234);
				((StrAsnUsrInContext)_localctx).name = checkSTRID();
				}
				break;
			case 11:
				_localctx = new StrAsnUsrInVARContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				((StrAsnUsrInVARContext)_localctx).scnr = checkSCNID();
				setState(237);
				match(T__20);
				setState(238);
				match(CPYASN);
				setState(239);
				((StrAsnUsrInVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 12:
				_localctx = new NumAsnUsrIntContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(241);
				((NumAsnUsrIntContext)_localctx).scnr = checkSCNID();
				setState(242);
				match(T__21);
				setState(243);
				match(ASN);
				setState(244);
				((NumAsnUsrIntContext)_localctx).name = checkVAR();
				}
				break;
			case 13:
				_localctx = new NumAsnUsrIntVARContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(246);
				((NumAsnUsrIntVARContext)_localctx).scnr = checkSCNID();
				setState(247);
				match(T__21);
				setState(248);
				match(CPYASN);
				setState(249);
				((NumAsnUsrIntVARContext)_localctx).name = checkVAR();
				}
				break;
			case 14:
				_localctx = new NumAsnUsrDblContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(251);
				((NumAsnUsrDblContext)_localctx).scnr = checkSCNID();
				setState(252);
				match(T__22);
				setState(253);
				match(ASN);
				setState(254);
				((NumAsnUsrDblContext)_localctx).name = checkVAR();
				}
				break;
			case 15:
				_localctx = new NumAsnUsrDblVARContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(256);
				((NumAsnUsrDblVARContext)_localctx).scnr = checkSCNID();
				setState(257);
				match(T__22);
				setState(258);
				match(CPYASN);
				setState(259);
				((NumAsnUsrDblVARContext)_localctx).name = checkVAR();
				}
				break;
			case 16:
				_localctx = new ScannerAsnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(261);
				match(T__23);
				setState(262);
				((ScannerAsnContext)_localctx).name = checkSCNID();
				setState(263);
				match(T__24);
				}
				break;
			case 17:
				_localctx = new ScannerClsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(265);
				((ScannerClsContext)_localctx).scnr = checkSCNID();
				setState(266);
				match(T__25);
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
		public List<CheckSTRIDContext> checkSTRID() {
			return getRuleContexts(CheckSTRIDContext.class);
		}
		public CheckSTRIDContext checkSTRID(int i) {
			return getRuleContext(CheckSTRIDContext.class,i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public List<TerminalNode> STR() { return getTokens(TJBParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(TJBParser.STR, i);
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
		enterRule(_localctx, 32, RULE_arrayBuild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__26);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(271);
				match(NIN);
				}
				break;
			case 2:
				{
				setState(272);
				match(INT);
				}
				break;
			case 3:
				{
				setState(273);
				match(DBL);
				}
				break;
			case 4:
				{
				setState(274);
				checkSTRID();
				}
				break;
			case 5:
				{
				setState(275);
				calculation(0);
				}
				break;
			case 6:
				{
				setState(276);
				match(STR);
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(279);
				match(T__15);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(280);
					match(NIN);
					}
					break;
				case 2:
					{
					setState(281);
					match(INT);
					}
					break;
				case 3:
					{
					setState(282);
					match(DBL);
					}
					break;
				case 4:
					{
					setState(283);
					checkSTRID();
					}
					break;
				case 5:
					{
					setState(284);
					calculation(0);
					}
					break;
				case 6:
					{
					setState(285);
					match(STR);
					}
					break;
				}
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(T__27);
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
		enterRule(_localctx, 34, RULE_checkSTRID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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

	public static class CheckSCNIDContext extends ParserRuleContext {
		public Token SCNID;
		public TerminalNode SCNID() { return getToken(TJBParser.SCNID, 0); }
		public CheckSCNIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSCNID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCheckSCNID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCheckSCNID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCheckSCNID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckSCNIDContext checkSCNID() throws RecognitionException {
		CheckSCNIDContext _localctx = new CheckSCNIDContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_checkSCNID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((CheckSCNIDContext)_localctx).SCNID = match(SCNID);

			         final String strid = (((CheckSCNIDContext)_localctx).SCNID!=null?((CheckSCNIDContext)_localctx).SCNID.getText():null);

			         if (strid.length() > 5) {
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
		enterRule(_localctx, 38, RULE_checkVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 40, RULE_checkArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean booleanEXP_sempred(BooleanEXPContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4U\n\4\f\4\16\4X\13\4\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\5\5b\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b\3\b\7\bs"+
		"\n\b\f\b\16\bv\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0086\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091"+
		"\13\n\3\13\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00ab\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u00c6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u010f\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0118\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0121\n\22\7"+
		"\22\u0123\n\22\f\22\16\22\u0126\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\2\4\6\22\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\6\7\4\2\5\5\b\b\4\2((**\2\u015c"+
		"\2/\3\2\2\2\4<\3\2\2\2\6I\3\2\2\2\bY\3\2\2\2\ne\3\2\2\2\fi\3\2\2\2\16"+
		"p\3\2\2\2\20w\3\2\2\2\22\u0085\3\2\2\2\24\u0092\3\2\2\2\26\u009c\3\2\2"+
		"\2\30\u00a5\3\2\2\2\32\u00b9\3\2\2\2\34\u00bd\3\2\2\2\36\u00c5\3\2\2\2"+
		" \u010e\3\2\2\2\"\u0110\3\2\2\2$\u0129\3\2\2\2&\u012c\3\2\2\2(\u012f\3"+
		"\2\2\2*\u0132\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64=\5 \21"+
		"\2\65=\5\6\4\2\66=\5\b\5\2\67=\5\24\13\28=\5\26\f\29=\5\30\r\2:=\5\22"+
		"\n\2;=\5\34\17\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2"+
		"\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\b\4\1\2?@\7\3\2\2@A\5"+
		"\6\4\2AB\7\4\2\2BJ\3\2\2\2CD\7\5\2\2DJ\5\6\4\nEJ\5(\25\2FJ\7*\2\2GJ\7"+
		")\2\2HJ\7(\2\2I>\3\2\2\2IC\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2"+
		"\2\2JV\3\2\2\2KL\f\t\2\2LM\t\2\2\2MU\5\6\4\nNO\f\b\2\2OP\t\3\2\2PU\5\6"+
		"\4\tQR\f\7\2\2RS\7\t\2\2SU\5\6\4\bTK\3\2\2\2TN\3\2\2\2TQ\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2Y]\5\n\6\2Z\\\5\20\t\2[Z"+
		"\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5\16\b\2"+
		"a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\n\2\2d\t\3\2\2\2ef\7\13\2\2fg\5\22"+
		"\n\2gh\5\f\7\2h\13\3\2\2\2im\7\f\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\r\3\2\2\2om\3\2\2\2pt\7\r\2\2qs\5\4\3\2rq\3\2\2\2sv"+
		"\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vt\3\2\2\2wx\7\16\2\2xy\5\22\n"+
		"\2yz\5\f\7\2z\21\3\2\2\2{|\b\n\1\2|}\7\3\2\2}~\5\22\n\2~\177\7\4\2\2\177"+
		"\u0086\3\2\2\2\u0080\u0081\7\17\2\2\u0081\u0086\5\22\n\b\u0082\u0086\5"+
		"\6\4\2\u0083\u0086\5$\23\2\u0084\u0086\7$\2\2\u0085{\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u008f\3\2\2\2\u0087\u0088\f\7\2\2\u0088\u0089\7%\2\2\u0089\u008e\5\22"+
		"\n\b\u008a\u008b\f\6\2\2\u008b\u008c\7&\2\2\u008c\u008e\5\22\n\7\u008d"+
		"\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\23\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\7\20\2\2\u0093\u0097\5\22\n\2\u0094\u0096\5\4\3\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\n\2\2\u009b\25\3\2\2\2\u009c"+
		"\u009d\7\21\2\2\u009d\u00a2\5\36\20\2\u009e\u009f\7\22\2\2\u009f\u00a1"+
		"\5\36\20\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00aa\5(\25\2\u00a8\u00a9\7\22\2\2"+
		"\u00a9\u00ab\t\4\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7\22\2"+
		"\2\u00af\u00b0\5\32\16\2\u00b0\u00b4\7\4\2\2\u00b1\u00b3\5\4\3\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8"+
		"\31\3\2\2\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\7\24\2\2\u00bb\u00bc\5\6\4"+
		"\2\u00bc\33\3\2\2\2\u00bd\u00be\7\25\2\2\u00be\u00bf\7$\2\2\u00bf\u00c0"+
		"\7\26\2\2\u00c0\35\3\2\2\2\u00c1\u00c6\7$\2\2\u00c2\u00c6\5$\23\2\u00c3"+
		"\u00c6\5\6\4\2\u00c4\u00c6\5*\26\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8"+
		"\5\6\4\2\u00c8\u00c9\7\37\2\2\u00c9\u00ca\5(\25\2\u00ca\u010f\3\2\2\2"+
		"\u00cb\u00cc\7$\2\2\u00cc\u00cd\7\37\2\2\u00cd\u010f\5$\23\2\u00ce\u00cf"+
		"\5$\23\2\u00cf\u00d0\7\37\2\2\u00d0\u00d1\5$\23\2\u00d1\u010f\3\2\2\2"+
		"\u00d2\u00d3\5\"\22\2\u00d3\u00d4\7\37\2\2\u00d4\u00d5\5*\26\2\u00d5\u010f"+
		"\3\2\2\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\5*\26\2"+
		"\u00d9\u010f\3\2\2\2\u00da\u00db\5*\26\2\u00db\u00dc\7 \2\2\u00dc\u00dd"+
		"\5*\26\2\u00dd\u010f\3\2\2\2\u00de\u00df\5\6\4\2\u00df\u00e0\7 \2\2\u00e0"+
		"\u00e1\5(\25\2\u00e1\u010f\3\2\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\7 "+
		"\2\2\u00e4\u00e5\5$\23\2\u00e5\u010f\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7"+
		"\u00e8\7 \2\2\u00e8\u010f\5$\23\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\7\27"+
		"\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\5$\23\2\u00ed\u010f\3\2\2\2\u00ee"+
		"\u00ef\5&\24\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\7 \2\2\u00f1\u00f2\5$"+
		"\23\2\u00f2\u010f\3\2\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\7\30\2\2\u00f5"+
		"\u00f6\7\37\2\2\u00f6\u00f7\5(\25\2\u00f7\u010f\3\2\2\2\u00f8\u00f9\5"+
		"&\24\2\u00f9\u00fa\7\30\2\2\u00fa\u00fb\7 \2\2\u00fb\u00fc\5(\25\2\u00fc"+
		"\u010f\3\2\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\7"+
		"\37\2\2\u0100\u0101\5(\25\2\u0101\u010f\3\2\2\2\u0102\u0103\5&\24\2\u0103"+
		"\u0104\7\31\2\2\u0104\u0105\7 \2\2\u0105\u0106\5(\25\2\u0106\u010f\3\2"+
		"\2\2\u0107\u0108\7\32\2\2\u0108\u0109\5&\24\2\u0109\u010a\7\33\2\2\u010a"+
		"\u010f\3\2\2\2\u010b\u010c\5&\24\2\u010c\u010d\7\34\2\2\u010d\u010f\3"+
		"\2\2\2\u010e\u00c7\3\2\2\2\u010e\u00cb\3\2\2\2\u010e\u00ce\3\2\2\2\u010e"+
		"\u00d2\3\2\2\2\u010e\u00d6\3\2\2\2\u010e\u00da\3\2\2\2\u010e\u00de\3\2"+
		"\2\2\u010e\u00e2\3\2\2\2\u010e\u00e6\3\2\2\2\u010e\u00e9\3\2\2\2\u010e"+
		"\u00ee\3\2\2\2\u010e\u00f3\3\2\2\2\u010e\u00f8\3\2\2\2\u010e\u00fd\3\2"+
		"\2\2\u010e\u0102\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u010b\3\2\2\2\u010f"+
		"!\3\2\2\2\u0110\u0117\7\35\2\2\u0111\u0118\7)\2\2\u0112\u0118\7(\2\2\u0113"+
		"\u0118\7*\2\2\u0114\u0118\5$\23\2\u0115\u0118\5\6\4\2\u0116\u0118\7$\2"+
		"\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0124\3\2\2\2\u0119"+
		"\u0120\7\22\2\2\u011a\u0121\7)\2\2\u011b\u0121\7(\2\2\u011c\u0121\7*\2"+
		"\2\u011d\u0121\5$\23\2\u011e\u0121\5\6\4\2\u011f\u0121\7$\2\2\u0120\u011a"+
		"\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0119\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\36\2\2\u0128#\3\2\2\2"+
		"\u0129\u012a\7\"\2\2\u012a\u012b\b\23\1\2\u012b%\3\2\2\2\u012c\u012d\7"+
		"#\2\2\u012d\u012e\b\24\1\2\u012e\'\3\2\2\2\u012f\u0130\7!\2\2\u0130\u0131"+
		"\b\25\1\2\u0131)\3\2\2\2\u0132\u0133\7\'\2\2\u0133\u0134\b\26\1\2\u0134"+
		"+\3\2\2\2\27/<ITV]amt\u0085\u008d\u008f\u0097\u00a2\u00aa\u00b4\u00c5"+
		"\u010e\u0117\u0120\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}