// Generated from D:/School/Projects/Java Projects/C-OSTexasJavaBasicLanguage\TJB.g4 by ANTLR 4.7
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		ASN=32, CPYASN=33, VAR=34, STRID=35, SCNID=36, STR=37, COMPTKN=38, LOGTKN=39, 
		ARRAY=40, INT=41, NIN=42, DBL=43, WS=44;
	public static final int
		RULE_codeLine = 0, RULE_expression = 1, RULE_calculation = 2, RULE_ifTJB = 3, 
		RULE_ifStatement = 4, RULE_thenStatement = 5, RULE_elseStatement = 6, 
		RULE_elseIfStatement = 7, RULE_booleanEXP = 8, RULE_whileTJB = 9, RULE_display = 10, 
		RULE_forTJB = 11, RULE_incrementEXP = 12, RULE_comment = 13, RULE_displayOptions = 14, 
		RULE_assignment = 15, RULE_arrayBuild = 16, RULE_arrayGetValue = 17, RULE_stringUsrIn = 18, 
		RULE_checkSTRID = 19, RULE_checkSCNID = 20, RULE_checkVAR = 21, RULE_checkArray = 22;
	public static final String[] ruleNames = {
		"codeLine", "expression", "calculation", "ifTJB", "ifStatement", "thenStatement", 
		"elseStatement", "elseIfStatement", "booleanEXP", "whileTJB", "display", 
		"forTJB", "incrementEXP", "comment", "displayOptions", "assignment", "arrayBuild", 
		"arrayGetValue", "stringUsrIn", "checkSTRID", "checkSCNID", "checkVAR", 
		"checkArray"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'%'", "'.nextInt'", "'.nextDbl'", 
		"'End'", "'If'", "'Then'", "'Else'", "'Else if'", "'!'", "'While'", "'Dispn'", 
		"'Displn'", "','", "'For'", "'+='", "'<COM>'", "'</COM>'", "'.nextStr'", 
		"'Scanner '", "';'", "'.close'", "'{'", "'}'", "'.['", "']'", "'->'", 
		"'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ASN", "CPYASN", "VAR", 
		"STRID", "SCNID", "STR", "COMPTKN", "LOGTKN", "ARRAY", "INT", "NIN", "DBL", 
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(46);
				expression();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				calculation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				ifTJB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				whileTJB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				forTJB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				booleanEXP(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
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
	public static class ExArrLiteralContext extends CalculationContext {
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public ExArrLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExArrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExArrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExArrLiteral(this);
			else return visitor.visitChildren(this);
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
	public static class ExAsnUsrDblContext extends CalculationContext {
		public CheckSCNIDContext scnr;
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public ExAsnUsrDblContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExAsnUsrDbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExAsnUsrDbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExAsnUsrDbl(this);
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
	public static class ExAsnUsrIntContext extends CalculationContext {
		public CheckSCNIDContext scnr;
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public ExAsnUsrIntContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterExAsnUsrInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitExAsnUsrInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExAsnUsrInt(this);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(T__0);
				setState(66);
				((ExParenthesesContext)_localctx).val = calculation(0);
				setState(67);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new ExNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(T__2);
				setState(70);
				((ExNegateContext)_localctx).val = calculation(11);
				}
				break;
			case 3:
				{
				_localctx = new ExVarLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((ExVarLiteralContext)_localctx).val = checkVAR();
				}
				break;
			case 4:
				{
				_localctx = new ExDblLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(DBL);
				}
				break;
			case 5:
				{
				_localctx = new ExNegLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(NIN);
				}
				break;
			case 6:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new ExArrLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				arrayGetValue();
				}
				break;
			case 8:
				{
				_localctx = new ExAsnUsrIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				((ExAsnUsrIntContext)_localctx).scnr = checkSCNID();
				setState(77);
				match(T__7);
				}
				break;
			case 9:
				{
				_localctx = new ExAsnUsrDblContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				((ExAsnUsrDblContext)_localctx).scnr = checkSCNID();
				setState(80);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulDivOpContext(new CalculationContext(_parentctx, _parentState));
						((ExMulDivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(84);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(85);
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
						setState(86);
						((ExMulDivOpContext)_localctx).right = calculation(11);
						}
						break;
					case 2:
						{
						_localctx = new ExAddOpContext(new CalculationContext(_parentctx, _parentState));
						((ExAddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(87);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(88);
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
						setState(89);
						((ExAddOpContext)_localctx).right = calculation(10);
						}
						break;
					case 3:
						{
						_localctx = new ExModOpContext(new CalculationContext(_parentctx, _parentState));
						((ExModOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(90);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(91);
						match(T__6);
						setState(92);
						((ExModOpContext)_localctx).right = calculation(9);
						}
						break;
					}
					} 
				}
				setState(97);
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
			setState(98);
			ifStatement();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(99);
				elseIfStatement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(105);
				((IfTJBContext)_localctx).elsePart = elseStatement();
				}
			}

			setState(108);
			match(T__9);
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
			setState(110);
			match(T__10);
			setState(111);
			((IfStatementContext)_localctx).bool = booleanEXP(0);
			setState(112);
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
			setState(114);
			match(T__11);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(115);
				expression();
				}
				}
				setState(120);
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
			setState(121);
			match(T__12);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(122);
				expression();
				}
				}
				setState(127);
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
			setState(128);
			match(T__13);
			setState(129);
			((ElseIfStatementContext)_localctx).bool = booleanEXP(0);
			setState(130);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(133);
				match(T__0);
				setState(134);
				((BoolParenthesesContext)_localctx).bool = booleanEXP(0);
				setState(135);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(T__14);
				setState(138);
				((BoolNegContext)_localctx).bool = booleanEXP(6);
				}
				break;
			case 3:
				{
				_localctx = new BoolCalcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				((BoolCalcContext)_localctx).calc = calculation(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolSTRIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				((BoolSTRIDContext)_localctx).str = checkSTRID();
				}
				break;
			case 5:
				{
				_localctx = new BoolSTRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(STR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BoolCompContext(new BooleanEXPContext(_parentctx, _parentState));
						((BoolCompContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						((BoolCompContext)_localctx).comp = match(COMPTKN);
						setState(146);
						((BoolCompContext)_localctx).right = booleanEXP(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolCompLogContext(new BooleanEXPContext(_parentctx, _parentState));
						((BoolCompLogContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						((BoolCompLogContext)_localctx).comp = match(LOGTKN);
						setState(149);
						((BoolCompLogContext)_localctx).right = booleanEXP(5);
						}
						break;
					}
					} 
				}
				setState(154);
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
			setState(155);
			match(T__15);
			setState(156);
			((WhileTJBContext)_localctx).bool = booleanEXP(0);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(157);
				expression();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__9);
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
		public Token line;
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
			setState(165);
			((DisplayContext)_localctx).line = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
				((DisplayContext)_localctx).line = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(166);
			displayOptions();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(167);
				match(T__18);
				setState(168);
				displayOptions();
				}
				}
				setState(173);
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
			setState(174);
			match(T__19);
			setState(175);
			match(T__0);
			setState(176);
			((ForTJBContext)_localctx).iterator = checkVAR();
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(177);
				match(T__18);
				setState(178);
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
			setState(181);
			match(T__18);
			setState(182);
			((ForTJBContext)_localctx).comp = booleanEXP(0);
			setState(183);
			match(T__18);
			setState(184);
			((ForTJBContext)_localctx).increments = incrementEXP();
			setState(185);
			match(T__1);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << VAR) | (1L << STRID) | (1L << SCNID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(186);
				expression();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__9);
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
			setState(194);
			((IncrementEXPContext)_localctx).nameVar = checkVAR();
			setState(195);
			match(T__20);
			setState(196);
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
			setState(198);
			match(T__21);
			setState(199);
			match(STR);
			setState(200);
			match(T__22);
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
	public static class DispUsrStringContext extends DisplayOptionsContext {
		public StringUsrInContext str;
		public StringUsrInContext stringUsrIn() {
			return getRuleContext(StringUsrInContext.class,0);
		}
		public DispUsrStringContext(DisplayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterDispUsrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitDispUsrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitDispUsrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayOptionsContext displayOptions() throws RecognitionException {
		DisplayOptionsContext _localctx = new DisplayOptionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_displayOptions);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DispSTRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(STR);
				}
				break;
			case 2:
				_localctx = new DispSTRIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((DispSTRIDContext)_localctx).name = checkSTRID();
				}
				break;
			case 3:
				_localctx = new DispCalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((DispCalcContext)_localctx).calc = calculation(0);
				}
				break;
			case 4:
				_localctx = new DispArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((DispArrayContext)_localctx).name = checkArray();
				}
				break;
			case 5:
				_localctx = new DispUsrStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				((DispUsrStringContext)_localctx).str = stringUsrIn();
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
	public static class AsnArrValContext extends AssignmentContext {
		public CalculationContext value;
		public ArrayGetValueContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public AsnArrValContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterAsnArrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitAsnArrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitAsnArrVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrArrAsnContext extends AssignmentContext {
		public Token value;
		public ArrayGetValueContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public StrArrAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrArrAsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrArrAsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrArrAsn(this);
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
	public static class CpyAsnStrFromArrContext extends AssignmentContext {
		public ArrayGetValueContext value;
		public CheckSTRIDContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public CpyAsnStrFromArrContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterCpyAsnStrFromArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitCpyAsnStrFromArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitCpyAsnStrFromArr(this);
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
	public static class StrArrAsnVarContext extends AssignmentContext {
		public CheckSTRIDContext value;
		public ArrayGetValueContext name;
		public TerminalNode CPYASN() { return getToken(TJBParser.CPYASN, 0); }
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public StrArrAsnVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrArrAsnVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrArrAsnVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrArrAsnVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsnStrFromArrContext extends AssignmentContext {
		public ArrayGetValueContext value;
		public CheckSTRIDContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public CheckSTRIDContext checkSTRID() {
			return getRuleContext(CheckSTRIDContext.class,0);
		}
		public AsnStrFromArrContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterAsnStrFromArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitAsnStrFromArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitAsnStrFromArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrArrValUsrInContext extends AssignmentContext {
		public CheckSCNIDContext scnr;
		public ArrayGetValueContext name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public ArrayGetValueContext arrayGetValue() {
			return getRuleContext(ArrayGetValueContext.class,0);
		}
		public StrArrValUsrInContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStrArrValUsrIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStrArrValUsrIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrArrValUsrIn(this);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NumAsnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((NumAsnContext)_localctx).value = calculation(0);
				setState(210);
				match(ASN);
				setState(211);
				((NumAsnContext)_localctx).name = checkVAR();
				}
				break;
			case 2:
				_localctx = new StrAsnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((StrAsnContext)_localctx).value = match(STR);
				setState(214);
				match(ASN);
				setState(215);
				((StrAsnContext)_localctx).name = checkSTRID();
				}
				break;
			case 3:
				_localctx = new StrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				((StrCpyAsnContext)_localctx).value = checkSTRID();
				setState(217);
				match(ASN);
				setState(218);
				((StrCpyAsnContext)_localctx).name = checkSTRID();
				}
				break;
			case 4:
				_localctx = new ArrAsnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				((ArrAsnContext)_localctx).value = arrayBuild();
				setState(221);
				match(ASN);
				setState(222);
				((ArrAsnContext)_localctx).name = checkArray();
				}
				break;
			case 5:
				_localctx = new ArrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				((ArrCpyAsnContext)_localctx).value = checkArray();
				setState(225);
				match(ASN);
				setState(226);
				((ArrCpyAsnContext)_localctx).name = checkArray();
				}
				break;
			case 6:
				_localctx = new ArrAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				((ArrAsnVARContext)_localctx).value = checkArray();
				setState(229);
				match(CPYASN);
				setState(230);
				((ArrAsnVARContext)_localctx).name = checkArray();
				}
				break;
			case 7:
				_localctx = new NumAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				((NumAsnVARContext)_localctx).value = calculation(0);
				setState(233);
				match(CPYASN);
				setState(234);
				((NumAsnVARContext)_localctx).name = checkVAR();
				}
				break;
			case 8:
				_localctx = new StrAsnVARContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				((StrAsnVARContext)_localctx).value = checkSTRID();
				setState(237);
				match(CPYASN);
				setState(238);
				((StrAsnVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 9:
				_localctx = new StrAsnNEWVARContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				((StrAsnNEWVARContext)_localctx).value = match(STR);
				setState(241);
				match(CPYASN);
				setState(242);
				((StrAsnNEWVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 10:
				_localctx = new StrAsnUsrInContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				((StrAsnUsrInContext)_localctx).scnr = checkSCNID();
				setState(244);
				match(T__23);
				setState(245);
				match(ASN);
				setState(246);
				((StrAsnUsrInContext)_localctx).name = checkSTRID();
				}
				break;
			case 11:
				_localctx = new StrAsnUsrInVARContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				((StrAsnUsrInVARContext)_localctx).scnr = checkSCNID();
				setState(249);
				match(T__23);
				setState(250);
				match(CPYASN);
				setState(251);
				((StrAsnUsrInVARContext)_localctx).name = checkSTRID();
				}
				break;
			case 12:
				_localctx = new ScannerAsnContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(253);
				match(T__24);
				setState(254);
				((ScannerAsnContext)_localctx).name = checkSCNID();
				setState(255);
				match(T__25);
				}
				break;
			case 13:
				_localctx = new ScannerClsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(257);
				((ScannerClsContext)_localctx).scnr = checkSCNID();
				setState(258);
				match(T__26);
				}
				break;
			case 14:
				_localctx = new AsnArrValContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(260);
				((AsnArrValContext)_localctx).value = calculation(0);
				setState(261);
				match(ASN);
				setState(262);
				((AsnArrValContext)_localctx).name = arrayGetValue();
				}
				break;
			case 15:
				_localctx = new StrArrAsnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(264);
				((StrArrAsnContext)_localctx).value = match(STR);
				setState(265);
				match(ASN);
				setState(266);
				((StrArrAsnContext)_localctx).name = arrayGetValue();
				}
				break;
			case 16:
				_localctx = new StrArrAsnVarContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(267);
				((StrArrAsnVarContext)_localctx).value = checkSTRID();
				setState(268);
				match(CPYASN);
				setState(269);
				((StrArrAsnVarContext)_localctx).name = arrayGetValue();
				}
				break;
			case 17:
				_localctx = new StrArrValUsrInContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(271);
				((StrArrValUsrInContext)_localctx).scnr = checkSCNID();
				setState(272);
				match(T__23);
				setState(273);
				match(ASN);
				setState(274);
				((StrArrValUsrInContext)_localctx).name = arrayGetValue();
				}
				break;
			case 18:
				_localctx = new AsnStrFromArrContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(276);
				((AsnStrFromArrContext)_localctx).value = arrayGetValue();
				setState(277);
				match(ASN);
				setState(278);
				((AsnStrFromArrContext)_localctx).name = checkSTRID();
				}
				break;
			case 19:
				_localctx = new CpyAsnStrFromArrContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(280);
				((CpyAsnStrFromArrContext)_localctx).value = arrayGetValue();
				setState(281);
				match(CPYASN);
				setState(282);
				((CpyAsnStrFromArrContext)_localctx).name = checkSTRID();
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
		public List<StringUsrInContext> stringUsrIn() {
			return getRuleContexts(StringUsrInContext.class);
		}
		public StringUsrInContext stringUsrIn(int i) {
			return getRuleContext(StringUsrInContext.class,i);
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
			setState(286);
			match(T__27);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(287);
				checkSTRID();
				}
				break;
			case 2:
				{
				setState(288);
				calculation(0);
				}
				break;
			case 3:
				{
				setState(289);
				match(STR);
				}
				break;
			case 4:
				{
				setState(290);
				stringUsrIn();
				}
				break;
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(293);
				match(T__18);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(294);
					checkSTRID();
					}
					break;
				case 2:
					{
					setState(295);
					calculation(0);
					}
					break;
				case 3:
					{
					setState(296);
					match(STR);
					}
					break;
				case 4:
					{
					setState(297);
					stringUsrIn();
					}
					break;
				}
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__28);
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

	public static class ArrayGetValueContext extends ParserRuleContext {
		public CheckArrayContext arrayName;
		public Token number;
		public CheckArrayContext checkArray() {
			return getRuleContext(CheckArrayContext.class,0);
		}
		public TerminalNode INT() { return getToken(TJBParser.INT, 0); }
		public ArrayGetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGetValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterArrayGetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitArrayGetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrayGetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayGetValueContext arrayGetValue() throws RecognitionException {
		ArrayGetValueContext _localctx = new ArrayGetValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayGetValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((ArrayGetValueContext)_localctx).arrayName = checkArray();
			setState(308);
			match(T__29);
			setState(309);
			((ArrayGetValueContext)_localctx).number = match(INT);
			setState(310);
			match(T__30);
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

	public static class StringUsrInContext extends ParserRuleContext {
		public CheckSCNIDContext scnr;
		public CheckSCNIDContext checkSCNID() {
			return getRuleContext(CheckSCNIDContext.class,0);
		}
		public StringUsrInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringUsrIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).enterStringUsrIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TJBListener ) ((TJBListener)listener).exitStringUsrIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStringUsrIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringUsrInContext stringUsrIn() throws RecognitionException {
		StringUsrInContext _localctx = new StringUsrInContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringUsrIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((StringUsrInContext)_localctx).scnr = checkSCNID();
			setState(313);
			match(T__23);
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
		enterRule(_localctx, 38, RULE_checkSTRID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 40, RULE_checkSCNID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 42, RULE_checkVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 44, RULE_checkArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4U\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13"+
		"\4\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\5\5m\n\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n\3\13\3\13"+
		"\3\13\7\13\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\7\f\u00ac\n\f\f\f\16\f\u00af\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00d2"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011f\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0126\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u012d\n\22\7\22\u012f\n"+
		"\22\f\22\16\22\u0132\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\2\4\6\22\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\6"+
		"\7\4\2\5\5\b\b\3\2\23\24\4\2++--\2\u0170\2\63\3\2\2\2\4@\3\2\2\2\6T\3"+
		"\2\2\2\bd\3\2\2\2\np\3\2\2\2\ft\3\2\2\2\16{\3\2\2\2\20\u0082\3\2\2\2\22"+
		"\u0090\3\2\2\2\24\u009d\3\2\2\2\26\u00a7\3\2\2\2\30\u00b0\3\2\2\2\32\u00c4"+
		"\3\2\2\2\34\u00c8\3\2\2\2\36\u00d1\3\2\2\2 \u011e\3\2\2\2\"\u0120\3\2"+
		"\2\2$\u0135\3\2\2\2&\u013a\3\2\2\2(\u013d\3\2\2\2*\u0140\3\2\2\2,\u0143"+
		"\3\2\2\2.\u0146\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2\2\3\67\3"+
		"\3\2\2\28A\5 \21\29A\5\6\4\2:A\5\b\5\2;A\5\24\13\2<A\5\26\f\2=A\5\30\r"+
		"\2>A\5\22\n\2?A\5\34\17\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3"+
		"\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\b\4\1\2CD\7\3\2\2DE"+
		"\5\6\4\2EF\7\4\2\2FU\3\2\2\2GH\7\5\2\2HU\5\6\4\rIU\5,\27\2JU\7-\2\2KU"+
		"\7,\2\2LU\7+\2\2MU\5$\23\2NO\5*\26\2OP\7\n\2\2PU\3\2\2\2QR\5*\26\2RS\7"+
		"\13\2\2SU\3\2\2\2TB\3\2\2\2TG\3\2\2\2TI\3\2\2\2TJ\3\2\2\2TK\3\2\2\2TL"+
		"\3\2\2\2TM\3\2\2\2TN\3\2\2\2TQ\3\2\2\2Ua\3\2\2\2VW\f\f\2\2WX\t\2\2\2X"+
		"`\5\6\4\rYZ\f\13\2\2Z[\t\3\2\2[`\5\6\4\f\\]\f\n\2\2]^\7\t\2\2^`\5\6\4"+
		"\13_V\3\2\2\2_Y\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3"+
		"\2\2\2ca\3\2\2\2dh\5\n\6\2eg\5\20\t\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi"+
		"\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\16\b\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"no\7\f\2\2o\t\3\2\2\2pq\7\r\2\2qr\5\22\n\2rs\5\f\7\2s\13\3\2\2\2tx\7\16"+
		"\2\2uw\5\4\3\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\r\3\2\2\2zx\3"+
		"\2\2\2{\177\7\17\2\2|~\5\4\3\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\20\2\2"+
		"\u0083\u0084\5\22\n\2\u0084\u0085\5\f\7\2\u0085\21\3\2\2\2\u0086\u0087"+
		"\b\n\1\2\u0087\u0088\7\3\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\4\2\2"+
		"\u008a\u0091\3\2\2\2\u008b\u008c\7\21\2\2\u008c\u0091\5\22\n\b\u008d\u0091"+
		"\5\6\4\2\u008e\u0091\5(\25\2\u008f\u0091\7\'\2\2\u0090\u0086\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u009a\3\2\2\2\u0092\u0093\f\7\2\2\u0093\u0094\7(\2\2\u0094"+
		"\u0099\5\22\n\b\u0095\u0096\f\6\2\2\u0096\u0097\7)\2\2\u0097\u0099\5\22"+
		"\n\7\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\23\3\2\2\2\u009c\u009a\3\2\2"+
		"\2\u009d\u009e\7\22\2\2\u009e\u00a2\5\22\n\2\u009f\u00a1\5\4\3\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\25\3\2\2\2\u00a7\u00a8\t\4\2\2\u00a8\u00ad\5\36\20\2\u00a9\u00aa\7\25"+
		"\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\27\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b5\5,\27\2\u00b3"+
		"\u00b4\7\25\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\5\22\n\2\u00b9"+
		"\u00ba\7\25\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bf\7\4\2\2\u00bc\u00be"+
		"\5\4\3\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\f"+
		"\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\5,\27\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7"+
		"\5\6\4\2\u00c7\33\3\2\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca\7\'\2\2\u00ca"+
		"\u00cb\7\31\2\2\u00cb\35\3\2\2\2\u00cc\u00d2\7\'\2\2\u00cd\u00d2\5(\25"+
		"\2\u00ce\u00d2\5\6\4\2\u00cf\u00d2\5.\30\2\u00d0\u00d2\5&\24\2\u00d1\u00cc"+
		"\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\5\6\4\2\u00d4\u00d5\7\"\2"+
		"\2\u00d5\u00d6\5,\27\2\u00d6\u011f\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d8\u00d9"+
		"\7\"\2\2\u00d9\u011f\5(\25\2\u00da\u00db\5(\25\2\u00db\u00dc\7\"\2\2\u00dc"+
		"\u00dd\5(\25\2\u00dd\u011f\3\2\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7"+
		"\"\2\2\u00e0\u00e1\5.\30\2\u00e1\u011f\3\2\2\2\u00e2\u00e3\5.\30\2\u00e3"+
		"\u00e4\7\"\2\2\u00e4\u00e5\5.\30\2\u00e5\u011f\3\2\2\2\u00e6\u00e7\5."+
		"\30\2\u00e7\u00e8\7#\2\2\u00e8\u00e9\5.\30\2\u00e9\u011f\3\2\2\2\u00ea"+
		"\u00eb\5\6\4\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\5,\27\2\u00ed\u011f\3\2"+
		"\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f0\7#\2\2\u00f0\u00f1\5(\25\2\u00f1"+
		"\u011f\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3\u00f4\7#\2\2\u00f4\u011f\5(\25"+
		"\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8\7\"\2\2\u00f8"+
		"\u00f9\5(\25\2\u00f9\u011f\3\2\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc\7\32"+
		"\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\5(\25\2\u00fe\u011f\3\2\2\2\u00ff"+
		"\u0100\7\33\2\2\u0100\u0101\5*\26\2\u0101\u0102\7\34\2\2\u0102\u011f\3"+
		"\2\2\2\u0103\u0104\5*\26\2\u0104\u0105\7\35\2\2\u0105\u011f\3\2\2\2\u0106"+
		"\u0107\5\6\4\2\u0107\u0108\7\"\2\2\u0108\u0109\5$\23\2\u0109\u011f\3\2"+
		"\2\2\u010a\u010b\7\'\2\2\u010b\u010c\7\"\2\2\u010c\u011f\5$\23\2\u010d"+
		"\u010e\5(\25\2\u010e\u010f\7#\2\2\u010f\u0110\5$\23\2\u0110\u011f\3\2"+
		"\2\2\u0111\u0112\5*\26\2\u0112\u0113\7\32\2\2\u0113\u0114\7\"\2\2\u0114"+
		"\u0115\5$\23\2\u0115\u011f\3\2\2\2\u0116\u0117\5$\23\2\u0117\u0118\7\""+
		"\2\2\u0118\u0119\5(\25\2\u0119\u011f\3\2\2\2\u011a\u011b\5$\23\2\u011b"+
		"\u011c\7#\2\2\u011c\u011d\5(\25\2\u011d\u011f\3\2\2\2\u011e\u00d3\3\2"+
		"\2\2\u011e\u00d7\3\2\2\2\u011e\u00da\3\2\2\2\u011e\u00de\3\2\2\2\u011e"+
		"\u00e2\3\2\2\2\u011e\u00e6\3\2\2\2\u011e\u00ea\3\2\2\2\u011e\u00ee\3\2"+
		"\2\2\u011e\u00f2\3\2\2\2\u011e\u00f5\3\2\2\2\u011e\u00fa\3\2\2\2\u011e"+
		"\u00ff\3\2\2\2\u011e\u0103\3\2\2\2\u011e\u0106\3\2\2\2\u011e\u010a\3\2"+
		"\2\2\u011e\u010d\3\2\2\2\u011e\u0111\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
		"\u011a\3\2\2\2\u011f!\3\2\2\2\u0120\u0125\7\36\2\2\u0121\u0126\5(\25\2"+
		"\u0122\u0126\5\6\4\2\u0123\u0126\7\'\2\2\u0124\u0126\5&\24\2\u0125\u0121"+
		"\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0130\3\2\2\2\u0127\u012c\7\25\2\2\u0128\u012d\5(\25\2\u0129\u012d\5"+
		"\6\4\2\u012a\u012d\7\'\2\2\u012b\u012d\5&\24\2\u012c\u0128\3\2\2\2\u012c"+
		"\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u0127\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\37"+
		"\2\2\u0134#\3\2\2\2\u0135\u0136\5.\30\2\u0136\u0137\7 \2\2\u0137\u0138"+
		"\7+\2\2\u0138\u0139\7!\2\2\u0139%\3\2\2\2\u013a\u013b\5*\26\2\u013b\u013c"+
		"\7\32\2\2\u013c\'\3\2\2\2\u013d\u013e\7%\2\2\u013e\u013f\b\25\1\2\u013f"+
		")\3\2\2\2\u0140\u0141\7&\2\2\u0141\u0142\b\26\1\2\u0142+\3\2\2\2\u0143"+
		"\u0144\7$\2\2\u0144\u0145\b\27\1\2\u0145-\3\2\2\2\u0146\u0147\7*\2\2\u0147"+
		"\u0148\b\30\1\2\u0148/\3\2\2\2\27\63@T_ahlx\177\u0090\u0098\u009a\u00a2"+
		"\u00ad\u00b5\u00bf\u00d1\u011e\u0125\u012c\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}