// Generated from D:/School/Projects/Java Projects/C-OSTexasJavaBasicLanguage - Copy\TJB.g4 by ANTLR 4.7
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
		T__17=18, ASN=19, CPYASN=20, VAR=21, STRID=22, STR=23, COMPTKN=24, ARRAY=25, 
		INT=26, NIN=27, DBL=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "ASN", "CPYASN", "VAR", "STRID", "STR", "COMPTKN", "ARRAY", "INT", 
		"NIN", "DBL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'*'", "'/'", "'%'", "'+'", "'End'", "'If'", 
		"'Then'", "'Else'", "'!'", "'While'", "'Disp'", "','", "'For'", "'{'", 
		"'}'", "'->'", "'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ASN", "CPYASN", "VAR", "STRID", 
		"STR", "COMPTKN", "ARRAY", "INT", "NIN", "DBL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26|\n\26"+
		"\r\26\16\26}\3\27\3\27\3\27\3\27\3\27\6\27\u0085\n\27\r\27\16\27\u0086"+
		"\3\30\3\30\6\30\u008b\n\30\r\30\16\30\u008c\3\30\3\30\3\30\5\30\u0092"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00a2\n\31\3\31\3\31\3\31\3\31\5\31\u00a8\n\31\5\31\u00aa\n"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00b2\n\33\f\33\16\33\u00b5\13"+
		"\33\5\33\u00b7\n\33\3\34\3\34\3\34\3\35\3\35\5\35\u00be\n\35\3\35\3\35"+
		"\3\35\3\36\6\36\u00c4\n\36\r\36\16\36\u00c5\3\36\3\36\2\2\37\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\b\3"+
		"\2C\\\3\2\62;\5\2\"\"C\\c|\4\2NNnn\3\2\63;\5\2\13\f\17\17\"\"\2\u00d9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2"+
		"\2\2\17I\3\2\2\2\21K\3\2\2\2\23O\3\2\2\2\25R\3\2\2\2\27W\3\2\2\2\31\\"+
		"\3\2\2\2\33^\3\2\2\2\35d\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#o\3\2\2\2%q\3\2"+
		"\2\2\'s\3\2\2\2)v\3\2\2\2+{\3\2\2\2-\177\3\2\2\2/\u0091\3\2\2\2\61\u00a9"+
		"\3\2\2\2\63\u00ab\3\2\2\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00bd\3\2"+
		"\2\2;\u00c3\3\2\2\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7/\2\2B"+
		"\b\3\2\2\2CD\7,\2\2D\n\3\2\2\2EF\7\61\2\2F\f\3\2\2\2GH\7\'\2\2H\16\3\2"+
		"\2\2IJ\7-\2\2J\20\3\2\2\2KL\7G\2\2LM\7p\2\2MN\7f\2\2N\22\3\2\2\2OP\7K"+
		"\2\2PQ\7h\2\2Q\24\3\2\2\2RS\7V\2\2ST\7j\2\2TU\7g\2\2UV\7p\2\2V\26\3\2"+
		"\2\2WX\7G\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\30\3\2\2\2\\]\7#\2\2]\32\3\2"+
		"\2\2^_\7Y\2\2_`\7j\2\2`a\7k\2\2ab\7n\2\2bc\7g\2\2c\34\3\2\2\2de\7F\2\2"+
		"ef\7k\2\2fg\7u\2\2gh\7r\2\2h\36\3\2\2\2ij\7.\2\2j \3\2\2\2kl\7H\2\2lm"+
		"\7q\2\2mn\7t\2\2n\"\3\2\2\2op\7}\2\2p$\3\2\2\2qr\7\177\2\2r&\3\2\2\2s"+
		"t\7/\2\2tu\7@\2\2u(\3\2\2\2vw\7/\2\2wx\7/\2\2xy\7@\2\2y*\3\2\2\2z|\t\2"+
		"\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~,\3\2\2\2\177\u0080\7U\2"+
		"\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0084\3\2\2\2\u0083\u0085"+
		"\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087.\3\2\2\2\u0088\u008a\7$\2\2\u0089\u008b\t\4\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0092\7$\2\2\u008f\u0090\7$\2\2\u0090\u0092"+
		"\7$\2\2\u0091\u0088\3\2\2\2\u0091\u008f\3\2\2\2\u0092\60\3\2\2\2\u0093"+
		"\u00aa\7>\2\2\u0094\u0095\7>\2\2\u0095\u00aa\7?\2\2\u0096\u00aa\7?\2\2"+
		"\u0097\u0098\7#\2\2\u0098\u00aa\7?\2\2\u0099\u00aa\7@\2\2\u009a\u009b"+
		"\7@\2\2\u009b\u00aa\7?\2\2\u009c\u009d\7~\2\2\u009d\u00a2\7~\2\2\u009e"+
		"\u009f\7C\2\2\u009f\u00a0\7p\2\2\u00a0\u00a2\7f\2\2\u00a1\u009c\3\2\2"+
		"\2\u00a1\u009e\3\2\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a4\7(\2\2\u00a4\u00a8"+
		"\7(\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a8\7t\2\2\u00a7\u00a3\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u0093\3\2\2\2\u00a9\u0094\3\2"+
		"\2\2\u00a9\u0096\3\2\2\2\u00a9\u0097\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9"+
		"\u009a\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\62\3\2\2"+
		"\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\5\65\33\2\u00ad\64\3\2\2\2\u00ae\u00b7"+
		"\7\62\2\2\u00af\u00b3\t\6\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7"+
		"\66\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\5\65\33\2\u00ba8\3\2\2\2\u00bb"+
		"\u00be\5\67\34\2\u00bc\u00be\5\65\33\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\u00c1\5\65\33\2"+
		"\u00c1:\3\2\2\2\u00c2\u00c4\t\7\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\b\36\2\2\u00c8<\3\2\2\2\16\2}\u0086\u008c\u0091\u00a1\u00a7\u00a9"+
		"\u00b3\u00b6\u00bd\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}