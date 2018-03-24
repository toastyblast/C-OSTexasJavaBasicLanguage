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
		T__17=18, ASN=19, VAR=20, STRID=21, STR=22, COMPTKN=23, ARRAY=24, INT=25, 
		NIN=26, DBL=27, WS=28;
	public static final int
		RULE_codeLine = 0, RULE_expression = 1, RULE_calculation = 2, RULE_ifTJB = 3, 
		RULE_ifStatement = 4, RULE_thenStatement = 5, RULE_elseStatement = 6, 
		RULE_elseIfStatement = 7, RULE_booleanEXP = 8, RULE_whileTJB = 9, RULE_display = 10, 
		RULE_forTJB = 11, RULE_comparisonSTR = 12, RULE_assignment = 13, RULE_arrayBuild = 14, 
		RULE_string32 = 15;
	public static final String[] ruleNames = {
		"codeLine", "expression", "calculation", "ifTJB", "ifStatement", "thenStatement", 
		"elseStatement", "elseIfStatement", "booleanEXP", "whileTJB", "display", 
		"forTJB", "comparisonSTR", "assignment", "arrayBuild", "string32"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'*'", "'/'", "'%'", "'+'", "'End'", "'If'", 
		"'Then'", "'Else'", "'!'", "'While'", "'Disp'", "','", "'For'", "'{'", 
		"'}'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ASN", "VAR", "STRID", "STR", 
		"COMPTKN", "ARRAY", "INT", "NIN", "DBL", "WS"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(32);
				expression();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				calculation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				ifTJB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				whileTJB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				forTJB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				booleanEXP(0);
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
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public ExNegateContext(CalculationContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExNegLiteralContext extends CalculationContext {
		public TerminalNode NIN() { return getToken(TJBParser.NIN, 0); }
		public ExNegLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExNegLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExDblLiteralContext extends CalculationContext {
		public TerminalNode DBL() { return getToken(TJBParser.DBL, 0); }
		public ExDblLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExDblLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExVarLiteralContext extends CalculationContext {
		public TerminalNode VAR() { return getToken(TJBParser.VAR, 0); }
		public ExVarLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExVarLiteral(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntLiteralContext extends CalculationContext {
		public TerminalNode INT() { return getToken(TJBParser.INT, 0); }
		public ExIntLiteralContext(CalculationContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitExDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenthesesContext extends CalculationContext {
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public ExParenthesesContext(CalculationContext ctx) { copyFrom(ctx); }
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(T__0);
				setState(51);
				calculation(0);
				setState(52);
				match(T__1);
				}
				break;
			case NIN:
				{
				_localctx = new ExNegLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(NIN);
				}
				break;
			case INT:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(INT);
				}
				break;
			case DBL:
				{
				_localctx = new ExDblLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(DBL);
				}
				break;
			case VAR:
				{
				_localctx = new ExVarLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(VAR);
				}
				break;
			case T__2:
				{
				_localctx = new ExNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(T__2);
				setState(59);
				calculation(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulOpContext(new CalculationContext(_parentctx, _parentState));
						((ExMulOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						match(T__3);
						setState(64);
						((ExMulOpContext)_localctx).right = calculation(5);
						}
						break;
					case 2:
						{
						_localctx = new ExDivOpContext(new CalculationContext(_parentctx, _parentState));
						((ExDivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						match(T__4);
						setState(67);
						((ExDivOpContext)_localctx).right = calculation(4);
						}
						break;
					case 3:
						{
						_localctx = new ExModOpContext(new CalculationContext(_parentctx, _parentState));
						((ExModOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						match(T__5);
						setState(70);
						((ExModOpContext)_localctx).right = calculation(3);
						}
						break;
					case 4:
						{
						_localctx = new ExAddOpContext(new CalculationContext(_parentctx, _parentState));
						((ExAddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calculation);
						setState(71);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(72);
						((ExAddOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__6) ) {
							((ExAddOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						((ExAddOpContext)_localctx).right = calculation(2);
						}
						break;
					}
					} 
				}
				setState(78);
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
			setState(79);
			ifStatement();
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					elseIfStatement();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(86);
				elseStatement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		public BooleanEXPContext booleanEXP() {
			return getRuleContext(BooleanEXPContext.class,0);
		}
		public ThenStatementContext thenStatement() {
			return getRuleContext(ThenStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
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
			setState(94);
			match(T__8);
			setState(95);
			booleanEXP(0);
			setState(96);
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
			setState(98);
			match(T__9);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(99);
				expression();
				}
				}
				setState(104);
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
			setState(105);
			match(T__10);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
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
			setState(112);
			match(T__10);
			setState(113);
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
		public BooleanEXPContext left;
		public Token comp;
		public BooleanEXPContext right;
		public List<BooleanEXPContext> booleanEXP() {
			return getRuleContexts(BooleanEXPContext.class);
		}
		public BooleanEXPContext booleanEXP(int i) {
			return getRuleContext(BooleanEXPContext.class,i);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public TerminalNode STRID() { return getToken(TJBParser.STRID, 0); }
		public TerminalNode COMPTKN() { return getToken(TJBParser.COMPTKN, 0); }
		public BooleanEXPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanEXP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitBooleanEXP(this);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(116);
				match(T__0);
				setState(117);
				booleanEXP(0);
				setState(118);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(120);
				match(T__11);
				setState(121);
				booleanEXP(5);
				}
				break;
			case 3:
				{
				setState(122);
				calculation(0);
				}
				break;
			case 4:
				{
				setState(123);
				match(STR);
				}
				break;
			case 5:
				{
				setState(124);
				match(STRID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanEXPContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_booleanEXP);
					setState(127);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(128);
					((BooleanEXPContext)_localctx).comp = match(COMPTKN);
					setState(129);
					((BooleanEXPContext)_localctx).right = booleanEXP(2);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(135);
			match(T__12);
			setState(136);
			booleanEXP(0);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(137);
				expression();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
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
			setState(145);
			match(T__13);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case VAR:
			case INT:
			case NIN:
			case DBL:
				{
				setState(146);
				calculation(0);
				}
				break;
			case STR:
				{
				setState(147);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(150);
				match(T__14);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case VAR:
				case INT:
				case NIN:
				case DBL:
					{
					setState(151);
					calculation(0);
					}
					break;
				case STR:
					{
					setState(152);
					match(STR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(159);
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
		public Token iterator;
		public Token iterVal;
		public Token comp;
		public Token upper;
		public CalculationContext increments;
		public List<TerminalNode> VAR() { return getTokens(TJBParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(TJBParser.VAR, i);
		}
		public TerminalNode COMPTKN() { return getToken(TJBParser.COMPTKN, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
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
			setState(160);
			match(T__15);
			setState(161);
			((ForTJBContext)_localctx).iterator = match(VAR);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(162);
				match(T__14);
				setState(163);
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
			setState(166);
			match(T__14);
			setState(167);
			((ForTJBContext)_localctx).comp = match(COMPTKN);
			setState(168);
			match(T__14);
			setState(169);
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
			setState(170);
			match(T__14);
			setState(171);
			((ForTJBContext)_localctx).increments = calculation(0);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << VAR) | (1L << STRID) | (1L << STR) | (1L << ARRAY) | (1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) {
				{
				{
				setState(172);
				expression();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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

	public static class ComparisonSTRContext extends ParserRuleContext {
		public ComparisonSTRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonSTR; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitComparisonSTR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonSTRContext comparisonSTR() throws RecognitionException {
		ComparisonSTRContext _localctx = new ComparisonSTRContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparisonSTR);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public Token name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public List<TerminalNode> STRID() { return getTokens(TJBParser.STRID); }
		public TerminalNode STRID(int i) {
			return getToken(TJBParser.STRID, i);
		}
		public TerminalNode STR() { return getToken(TJBParser.STR, 0); }
		public StrAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitStrAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrCpyAsnContext extends AssignmentContext {
		public String32Context value;
		public Token name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public String32Context string32() {
			return getRuleContext(String32Context.class,0);
		}
		public TerminalNode ARRAY() { return getToken(TJBParser.ARRAY, 0); }
		public ArrCpyAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrCpyAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAsnContext extends AssignmentContext {
		public CalculationContext value;
		public Token name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode VAR() { return getToken(TJBParser.VAR, 0); }
		public NumAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitNumAsn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrAsnContext extends AssignmentContext {
		public ArrayBuildContext value;
		public Token name;
		public TerminalNode ASN() { return getToken(TJBParser.ASN, 0); }
		public ArrayBuildContext arrayBuild() {
			return getRuleContext(ArrayBuildContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(TJBParser.ARRAY, 0); }
		public ArrAsnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrAsn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case VAR:
			case INT:
			case NIN:
			case DBL:
				_localctx = new NumAsnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((NumAsnContext)_localctx).value = calculation(0);
				setState(183);
				match(ASN);
				setState(184);
				((NumAsnContext)_localctx).name = match(VAR);
				}
				break;
			case STRID:
			case STR:
				_localctx = new StrAsnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((StrAsnContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRID || _la==STR) ) {
					((StrAsnContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				match(ASN);
				setState(188);
				((StrAsnContext)_localctx).name = match(STRID);
				}
				break;
			case T__16:
				_localctx = new ArrAsnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				((ArrAsnContext)_localctx).value = arrayBuild();
				setState(190);
				match(ASN);
				setState(191);
				((ArrAsnContext)_localctx).name = match(ARRAY);
				}
				break;
			case ARRAY:
				_localctx = new ArrCpyAsnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				((ArrCpyAsnContext)_localctx).value = string32();
				setState(194);
				match(ASN);
				setState(195);
				((ArrCpyAsnContext)_localctx).name = match(ARRAY);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitArrayBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBuildContext arrayBuild() throws RecognitionException {
		ArrayBuildContext _localctx = new ArrayBuildContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayBuild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__16);
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NIN) | (1L << DBL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(201);
				match(T__14);
				setState(202);
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
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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

	public static class String32Context extends ParserRuleContext {
		public Token ARRAY;
		public TerminalNode ARRAY() { return getToken(TJBParser.ARRAY, 0); }
		public String32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string32; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TJBVisitor ) return ((TJBVisitor<? extends T>)visitor).visitString32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String32Context string32() throws RecognitionException {
		String32Context _localctx = new String32Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_string32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((String32Context)_localctx).ARRAY = match(ARRAY);

			        final String id = (((String32Context)_localctx).ARRAY!=null?((String32Context)_localctx).ARRAY.getText():null);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanEXP_sempred(BooleanEXPContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\5\3\5\7\5T\n"+
		"\5\f\5\16\5W\13\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\3\n\3"+
		"\n\7\n\u0085\n\n\f\n\16\n\u0088\13\n\3\13\3\13\3\13\7\13\u008d\n\13\f"+
		"\13\16\13\u0090\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f"+
		"\5\f\u009c\n\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\3\r\3\r\5\r\u00a7"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\7\20\u00ce\n"+
		"\20\f\20\16\20\u00d1\13\20\3\20\3\20\3\21\3\21\3\21\3\21\2\4\6\22\22\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\4\2\5\5\t\t\4\2\33\33\35\35"+
		"\5\2\26\26\33\33\35\35\3\2\27\30\3\2\33\35\2\u00ea\2%\3\2\2\2\4\61\3\2"+
		"\2\2\6>\3\2\2\2\bQ\3\2\2\2\n`\3\2\2\2\fd\3\2\2\2\16k\3\2\2\2\20r\3\2\2"+
		"\2\22\177\3\2\2\2\24\u0089\3\2\2\2\26\u0093\3\2\2\2\30\u00a2\3\2\2\2\32"+
		"\u00b6\3\2\2\2\34\u00c7\3\2\2\2\36\u00c9\3\2\2\2 \u00d4\3\2\2\2\"$\5\4"+
		"\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()"+
		"\7\2\2\3)\3\3\2\2\2*\62\5\34\17\2+\62\5\6\4\2,\62\5\b\5\2-\62\5\24\13"+
		"\2.\62\5\26\f\2/\62\5\30\r\2\60\62\5\22\n\2\61*\3\2\2\2\61+\3\2\2\2\61"+
		",\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2"+
		"\2\63\64\b\4\1\2\64\65\7\3\2\2\65\66\5\6\4\2\66\67\7\4\2\2\67?\3\2\2\2"+
		"8?\7\34\2\29?\7\33\2\2:?\7\35\2\2;?\7\26\2\2<=\7\5\2\2=?\5\6\4\7>\63\3"+
		"\2\2\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2?N\3\2\2\2@A\f"+
		"\6\2\2AB\7\6\2\2BM\5\6\4\7CD\f\5\2\2DE\7\7\2\2EM\5\6\4\6FG\f\4\2\2GH\7"+
		"\b\2\2HM\5\6\4\5IJ\f\3\2\2JK\t\2\2\2KM\5\6\4\4L@\3\2\2\2LC\3\2\2\2LF\3"+
		"\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2\2QU"+
		"\5\n\6\2RT\5\20\t\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2\2"+
		"WU\3\2\2\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2"+
		"\2\2][\3\2\2\2^_\7\n\2\2_\t\3\2\2\2`a\7\13\2\2ab\5\22\n\2bc\5\f\7\2c\13"+
		"\3\2\2\2dh\7\f\2\2eg\5\4\3\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i"+
		"\r\3\2\2\2jh\3\2\2\2ko\7\r\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p\17\3\2\2\2qo\3\2\2\2rs\7\r\2\2st\5\n\6\2t\21\3\2\2\2uv\b\n"+
		"\1\2vw\7\3\2\2wx\5\22\n\2xy\7\4\2\2y\u0080\3\2\2\2z{\7\16\2\2{\u0080\5"+
		"\22\n\7|\u0080\5\6\4\2}\u0080\7\30\2\2~\u0080\7\27\2\2\177u\3\2\2\2\177"+
		"z\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0086\3\2\2\2\u0081"+
		"\u0082\f\3\2\2\u0082\u0083\7\31\2\2\u0083\u0085\5\22\n\4\u0084\u0081\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\23\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\17\2\2\u008a\u008e\5\22"+
		"\n\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\n\2\2\u0092\25\3\2\2\2\u0093\u0096\7\20\2\2\u0094\u0097"+
		"\5\6\4\2\u0095\u0097\7\30\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u009f\3\2\2\2\u0098\u009b\7\21\2\2\u0099\u009c\5\6\4\2\u009a\u009c"+
		"\7\30\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009e\3\2\2\2"+
		"\u009d\u0098\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\22\2\2\u00a3"+
		"\u00a6\7\26\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9"+
		"\u00aa\7\31\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac\t\4\2\2\u00ac\u00ad\7"+
		"\21\2\2\u00ad\u00b1\5\6\4\2\u00ae\u00b0\5\4\3\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\n\2\2\u00b5\31\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\25\2\2\u00ba"+
		"\u00bb\7\26\2\2\u00bb\u00c8\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd\u00be\7"+
		"\25\2\2\u00be\u00c8\7\27\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7\25\2"+
		"\2\u00c1\u00c2\7\32\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\5 \21\2\u00c4"+
		"\u00c5\7\25\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b8\3"+
		"\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8"+
		"\35\3\2\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cf\t\6\2\2\u00cb\u00cc\7\21"+
		"\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d3\7\24\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7\32\2\2\u00d5"+
		"\u00d6\b\21\1\2\u00d6!\3\2\2\2\25%\61>LNU[ho\177\u0086\u008e\u0096\u009b"+
		"\u009f\u00a6\u00b1\u00c7\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}