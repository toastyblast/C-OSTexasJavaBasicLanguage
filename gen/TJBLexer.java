// Generated from D:/School/Projects/Java Projects/C-OSTexasJavaBasicLanguage\TJB.g4 by ANTLR 4.7
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
		T__17=18, ASN=19, VAR=20, STRID=21, STR=22, COMPTKN=23, ARRAY=24, INT=25, 
		NIN=26, DBL=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "ASN", "VAR", "STRID", "STR", "COMPTKN", "ARRAY", "INT", "NIN", 
		"DBL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\6\27\177\n\27\r\27\16\27\u0080\3\27\3\27\3\27\5\27\u0086\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0096\n\30\3\30\3\30\3\30\3\30\5\30\u009c\n\30\5\30\u009e\n\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\7\32\u00a6\n\32\f\32\16\32\u00a9\13\32\5\32\u00ab"+
		"\n\32\3\33\3\33\3\33\3\34\3\34\5\34\u00b2\n\34\3\34\3\34\3\34\3\35\6\35"+
		"\u00b8\n\35\r\35\16\35\u00b9\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\b\3\2C\\\3\2\62;\5\2\"\""+
		"C\\c|\4\2NNnn\3\2\63;\5\2\13\f\17\17\"\"\2\u00cb\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3"+
		"\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23M\3"+
		"\2\2\2\25P\3\2\2\2\27U\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35b\3\2\2\2\37"+
		"g\3\2\2\2!i\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)t\3\2\2\2+v\3\2\2\2"+
		"-\u0085\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac"+
		"\3\2\2\2\67\u00b1\3\2\2\29\u00b7\3\2\2\2;<\7*\2\2<\4\3\2\2\2=>\7+\2\2"+
		">\6\3\2\2\2?@\7/\2\2@\b\3\2\2\2AB\7,\2\2B\n\3\2\2\2CD\7\61\2\2D\f\3\2"+
		"\2\2EF\7\'\2\2F\16\3\2\2\2GH\7-\2\2H\20\3\2\2\2IJ\7G\2\2JK\7p\2\2KL\7"+
		"f\2\2L\22\3\2\2\2MN\7K\2\2NO\7h\2\2O\24\3\2\2\2PQ\7V\2\2QR\7j\2\2RS\7"+
		"g\2\2ST\7p\2\2T\26\3\2\2\2UV\7G\2\2VW\7n\2\2WX\7u\2\2XY\7g\2\2Y\30\3\2"+
		"\2\2Z[\7#\2\2[\32\3\2\2\2\\]\7Y\2\2]^\7j\2\2^_\7k\2\2_`\7n\2\2`a\7g\2"+
		"\2a\34\3\2\2\2bc\7F\2\2cd\7k\2\2de\7u\2\2ef\7r\2\2f\36\3\2\2\2gh\7.\2"+
		"\2h \3\2\2\2ij\7H\2\2jk\7q\2\2kl\7t\2\2l\"\3\2\2\2mn\7}\2\2n$\3\2\2\2"+
		"op\7\177\2\2p&\3\2\2\2qr\7/\2\2rs\7@\2\2s(\3\2\2\2tu\t\2\2\2u*\3\2\2\2"+
		"vw\7U\2\2wx\7v\2\2xy\7t\2\2yz\3\2\2\2z{\t\3\2\2{,\3\2\2\2|~\7$\2\2}\177"+
		"\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0086\7$\2\2\u0083\u0084\7$\2\2\u0084\u0086"+
		"\7$\2\2\u0085|\3\2\2\2\u0085\u0083\3\2\2\2\u0086.\3\2\2\2\u0087\u009e"+
		"\7>\2\2\u0088\u0089\7>\2\2\u0089\u009e\7?\2\2\u008a\u009e\7?\2\2\u008b"+
		"\u008c\7#\2\2\u008c\u009e\7?\2\2\u008d\u009e\7@\2\2\u008e\u008f\7@\2\2"+
		"\u008f\u009e\7?\2\2\u0090\u0091\7~\2\2\u0091\u0096\7~\2\2\u0092\u0093"+
		"\7C\2\2\u0093\u0094\7p\2\2\u0094\u0096\7f\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0096\u009e\3\2\2\2\u0097\u0098\7(\2\2\u0098\u009c\7(\2"+
		"\2\u0099\u009a\7Q\2\2\u009a\u009c\7t\2\2\u009b\u0097\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0087\3\2\2\2\u009d\u0088\3\2\2\2\u009d"+
		"\u008a\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u008e\3\2"+
		"\2\2\u009d\u0095\3\2\2\2\u009d\u009b\3\2\2\2\u009e\60\3\2\2\2\u009f\u00a0"+
		"\t\5\2\2\u00a0\u00a1\5\63\32\2\u00a1\62\3\2\2\2\u00a2\u00ab\7\62\2\2\u00a3"+
		"\u00a7\t\6\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2\2\2\u00ab\64\3\2\2"+
		"\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\5\63\32\2\u00ae\66\3\2\2\2\u00af\u00b2"+
		"\5\65\33\2\u00b0\u00b2\5\63\32\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4\u00b5\5\63\32\2\u00b5"+
		"8\3\2\2\2\u00b6\u00b8\t\7\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b\35\2\2\u00bc:\3\2\2\2\f\2\u0080\u0085\u0095\u009b\u009d\u00a7\u00aa"+
		"\u00b1\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}