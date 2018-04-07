// Generated from D:/IdeaProjects/C-OSTexasJavaBasicLanguage\TJB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TJBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ASN=23, CPYASN=24, VAR=25, 
		STRID=26, STR=27, COMPTKN=28, LOGTKN=29, ARRAY=30, INT=31, NIN=32, DBL=33, 
		WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "ASN", "CPYASN", "VAR", "STRID", 
		"STR", "COMPTKN", "LOGTKN", "ARRAY", "INT", "NIN", "DBL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'%'", "'End'", "'If'", 
		"'Then'", "'Else'", "'Else if'", "'!'", "'While'", "'Disp'", "','", "'For'", 
		"'='", "'<COM>'", "'</COM>'", "'{'", "'}'", "'->'", "'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ASN", 
		"CPYASN", "VAR", "STRID", "STR", "COMPTKN", "LOGTKN", "ARRAY", "INT", 
		"NIN", "DBL", "WS"
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


	public TJBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TJB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\6\32\u009d"+
		"\n\32\r\32\16\32\u009e\3\33\3\33\3\33\3\33\3\33\6\33\u00a6\n\33\r\33\16"+
		"\33\u00a7\3\34\3\34\6\34\u00ac\n\34\r\34\16\34\u00ad\3\34\3\34\3\34\5"+
		"\34\u00b3\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00be"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u00c5\n\36\3\36\3\36\3\36\3\36\5\36"+
		"\u00cb\n\36\5\36\u00cd\n\36\3\37\3\37\3\37\6\37\u00d2\n\37\r\37\16\37"+
		"\u00d3\3 \3 \3 \7 \u00d9\n \f \16 \u00dc\13 \5 \u00de\n \3!\3!\3!\3\""+
		"\3\"\5\"\u00e5\n\"\3\"\3\"\3\"\3#\6#\u00eb\n#\r#\16#\u00ec\3#\3#\2\2$"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$\3\2\b\3\2C\\\3\2\62;\6\2\"\"\62;C\\c|\4\2NNnn\3\2\63;\5\2"+
		"\13\f\17\17\"\"\2\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2"+
		"\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23Y\3\2\2\2\25\\\3\2\2\2\27a\3\2\2"+
		"\2\31f\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37v\3\2\2\2!{\3\2\2\2#}\3\2\2\2"+
		"%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0089\3\2\2\2+\u0090\3\2\2\2-\u0092\3"+
		"\2\2\2/\u0094\3\2\2\2\61\u0097\3\2\2\2\63\u009c\3\2\2\2\65\u00a0\3\2\2"+
		"\2\67\u00b2\3\2\2\29\u00bd\3\2\2\2;\u00cc\3\2\2\2=\u00ce\3\2\2\2?\u00dd"+
		"\3\2\2\2A\u00df\3\2\2\2C\u00e4\3\2\2\2E\u00ea\3\2\2\2GH\7*\2\2H\4\3\2"+
		"\2\2IJ\7+\2\2J\6\3\2\2\2KL\7/\2\2L\b\3\2\2\2MN\7,\2\2N\n\3\2\2\2OP\7\61"+
		"\2\2P\f\3\2\2\2QR\7-\2\2R\16\3\2\2\2ST\7\'\2\2T\20\3\2\2\2UV\7G\2\2VW"+
		"\7p\2\2WX\7f\2\2X\22\3\2\2\2YZ\7K\2\2Z[\7h\2\2[\24\3\2\2\2\\]\7V\2\2]"+
		"^\7j\2\2^_\7g\2\2_`\7p\2\2`\26\3\2\2\2ab\7G\2\2bc\7n\2\2cd\7u\2\2de\7"+
		"g\2\2e\30\3\2\2\2fg\7G\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2jk\7\"\2\2kl\7k\2"+
		"\2lm\7h\2\2m\32\3\2\2\2no\7#\2\2o\34\3\2\2\2pq\7Y\2\2qr\7j\2\2rs\7k\2"+
		"\2st\7n\2\2tu\7g\2\2u\36\3\2\2\2vw\7F\2\2wx\7k\2\2xy\7u\2\2yz\7r\2\2z"+
		" \3\2\2\2{|\7.\2\2|\"\3\2\2\2}~\7H\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080"+
		"$\3\2\2\2\u0081\u0082\7?\2\2\u0082&\3\2\2\2\u0083\u0084\7>\2\2\u0084\u0085"+
		"\7E\2\2\u0085\u0086\7Q\2\2\u0086\u0087\7O\2\2\u0087\u0088\7@\2\2\u0088"+
		"(\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7E\2\2\u008c"+
		"\u008d\7Q\2\2\u008d\u008e\7O\2\2\u008e\u008f\7@\2\2\u008f*\3\2\2\2\u0090"+
		"\u0091\7}\2\2\u0091,\3\2\2\2\u0092\u0093\7\177\2\2\u0093.\3\2\2\2\u0094"+
		"\u0095\7/\2\2\u0095\u0096\7@\2\2\u0096\60\3\2\2\2\u0097\u0098\7/\2\2\u0098"+
		"\u0099\7/\2\2\u0099\u009a\7@\2\2\u009a\62\3\2\2\2\u009b\u009d\t\2\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\66\3\2\2\2\u00a9\u00ab\7$\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b3\7$\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b3\7$\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b38\3\2\2\2\u00b4\u00be\7>\2\2\u00b5"+
		"\u00b6\7>\2\2\u00b6\u00be\7?\2\2\u00b7\u00be\7?\2\2\u00b8\u00b9\7#\2\2"+
		"\u00b9\u00be\7?\2\2\u00ba\u00be\7@\2\2\u00bb\u00bc\7@\2\2\u00bc\u00be"+
		"\7?\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be:\3\2\2\2"+
		"\u00bf\u00c0\7~\2\2\u00c0\u00c5\7~\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3"+
		"\7p\2\2\u00c3\u00c5\7f\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5"+
		"\u00cd\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00cb\7(\2\2\u00c8\u00c9\7Q\2"+
		"\2\u00c9\u00cb\7t\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd<\3\2\2\2\u00ce"+
		"\u00d1\t\5\2\2\u00cf\u00d2\5? \2\u00d0\u00d2\5\63\32\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4>\3\2\2\2\u00d5\u00de\7\62\2\2\u00d6\u00da\t\6\2\2"+
		"\u00d7\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00de@\3\2\2\2\u00df\u00e0\7/\2\2\u00e0"+
		"\u00e1\5? \2\u00e1B\3\2\2\2\u00e2\u00e5\5A!\2\u00e3\u00e5\5? \2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\60"+
		"\2\2\u00e7\u00e8\5? \2\u00e8D\3\2\2\2\u00e9\u00eb\t\7\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\b#\2\2\u00efF\3\2\2\2\22\2\u009e\u00a7\u00ab"+
		"\u00ad\u00b2\u00bd\u00c4\u00ca\u00cc\u00d1\u00d3\u00da\u00dd\u00e4\u00ec"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}