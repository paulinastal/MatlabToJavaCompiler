// Generated from E:/Git/MatlabToJavaCompiler/src/main/java/pl/kompilatory/antlr4\Matlab.g4 by ANTLR 4.8
package pl.kompilatory.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatlabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, WS=2, PLUS=3, MINUS=4, DIVIDE=5, MULTIPLY=6, POWER=7, ELEMENT_WISE_MULTIPLY=8, 
		ELEMENT_WISE_DIVIDE=9, ELEMENT_WISE_POWER=10, GLOBAL=11, IF=12, ELSE=13, 
		ELSEIF=14, END=15, WHILE=16, FOR=17, SWITCH=18, OTHERWISE=19, CASE=20, 
		FUNCTION=21, RETURN=22, ASSIGN=23, DOT=24, COMMA=25, COLON=26, SEMI_COLON=27, 
		LEFT_PARENTHESIS=28, RIGHT_PARENTHESIS=29, LEFT_BRACE=30, RIGHT_BRACE=31, 
		LEFT_SQUARE_BRACKET=32, RIGHT_SQUARE_BRACKET=33, TRUE=34, FALSE=35, ID=36, 
		AND=37, OR=38, NOT=39, EQUAL=40, NOT_EQUAL=41, GREATER_THAN=42, GREATER_OR_EQUAL=43, 
		LESS_THAN=44, LESS_OR_EQUAL=45, INT=46, FLOAT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "WS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "POWER", "ELEMENT_WISE_MULTIPLY", 
			"ELEMENT_WISE_DIVIDE", "ELEMENT_WISE_POWER", "GLOBAL", "IF", "ELSE", 
			"ELSEIF", "END", "WHILE", "FOR", "SWITCH", "OTHERWISE", "CASE", "FUNCTION", 
			"RETURN", "ASSIGN", "DOT", "COMMA", "COLON", "SEMI_COLON", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "TRUE", "FALSE", "ID", "AND", "OR", "NOT", "EQUAL", 
			"NOT_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", 
			"INT", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'/'", "'*'", "'^'", "'.*'", "'./'", 
			"'.^'", "'global'", "'if'", "'else'", "'elseif'", "'end'", "'while'", 
			"'for'", "'switch'", "'otherwise'", "'case'", "'function'", "'return'", 
			"'='", "'.'", "','", "':'", "';'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'true'", "'false'", null, "'&&'", "'||'", "'~'", "'=='", "'~='", 
			"'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "WS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "POWER", "ELEMENT_WISE_MULTIPLY", 
			"ELEMENT_WISE_DIVIDE", "ELEMENT_WISE_POWER", "GLOBAL", "IF", "ELSE", 
			"ELSEIF", "END", "WHILE", "FOR", "SWITCH", "OTHERWISE", "CASE", "FUNCTION", 
			"RETURN", "ASSIGN", "DOT", "COMMA", "COLON", "SEMI_COLON", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "TRUE", "FALSE", "ID", "AND", "OR", "NOT", "EQUAL", 
			"NOT_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", 
			"INT", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MatlabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Matlab.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u011a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\5\2e\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\7%\u00ed\n%\f%\16%\u00f0\13%\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\6"+
		"/\u010b\n/\r/\16/\u010c\3\60\6\60\u0110\n\60\r\60\16\60\u0111\3\60\3\60"+
		"\7\60\u0116\n\60\f\60\16\60\u0119\13\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2\62"+
		";C\\aac|\3\2\62;\2\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3d\3\2\2\2\5h\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2\13p\3\2"+
		"\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27\177"+
		"\3\2\2\2\31\u0086\3\2\2\2\33\u0089\3\2\2\2\35\u008e\3\2\2\2\37\u0095\3"+
		"\2\2\2!\u0099\3\2\2\2#\u009f\3\2\2\2%\u00a3\3\2\2\2\'\u00aa\3\2\2\2)\u00b4"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00c2\3\2\2\2/\u00c9\3\2\2\2\61\u00cb\3\2\2\2"+
		"\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5"+
		"\3\2\2\2=\u00d7\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E"+
		"\u00df\3\2\2\2G\u00e4\3\2\2\2I\u00ea\3\2\2\2K\u00f1\3\2\2\2M\u00f4\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00f9\3\2\2\2S\u00fc\3\2\2\2U\u00ff\3\2\2\2W\u0101"+
		"\3\2\2\2Y\u0104\3\2\2\2[\u0106\3\2\2\2]\u010a\3\2\2\2_\u010f\3\2\2\2a"+
		"b\7\17\2\2be\7\f\2\2ce\t\2\2\2da\3\2\2\2dc\3\2\2\2ef\3\2\2\2fg\b\2\2\2"+
		"g\4\3\2\2\2hi\t\3\2\2ij\3\2\2\2jk\b\3\3\2k\6\3\2\2\2lm\7-\2\2m\b\3\2\2"+
		"\2no\7/\2\2o\n\3\2\2\2pq\7\61\2\2q\f\3\2\2\2rs\7,\2\2s\16\3\2\2\2tu\7"+
		"`\2\2u\20\3\2\2\2vw\7\60\2\2wx\7,\2\2x\22\3\2\2\2yz\7\60\2\2z{\7\61\2"+
		"\2{\24\3\2\2\2|}\7\60\2\2}~\7`\2\2~\26\3\2\2\2\177\u0080\7i\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082\u0083\7d\2\2\u0083\u0084\7c\2\2"+
		"\u0084\u0085\7n\2\2\u0085\30\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7"+
		"h\2\2\u0088\32\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c"+
		"\7u\2\2\u008c\u008d\7g\2\2\u008d\34\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7h\2\2\u0094\36\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7f\2\2\u0098 \3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\"\3\2\2\2\u009f"+
		"\u00a0\7h\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2$\3\2\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7y\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7q\2"+
		"\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\u00bb\7w\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1,\3\2\2"+
		"\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7p\2\2\u00c8.\3\2\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc\62\3\2\2\2\u00cd\u00ce"+
		"\7.\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0\66\3\2\2\2\u00d1\u00d2"+
		"\7=\2\2\u00d28\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7"+
		"+\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8>\3\2\2\2\u00d9\u00da\7\177"+
		"\2\2\u00da@\3\2\2\2\u00db\u00dc\7]\2\2\u00dcB\3\2\2\2\u00dd\u00de\7_\2"+
		"\2\u00deD\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7"+
		"w\2\2\u00e2\u00e3\7g\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6"+
		"\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"H\3\2\2\2\u00ea\u00ee\t\4\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efJ\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7(\2\2\u00f3"+
		"L\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7~\2\2\u00f6N\3\2\2\2\u00f7\u00f8"+
		"\7\u0080\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"R\3\2\2\2\u00fc\u00fd\7\u0080\2\2\u00fd\u00fe\7?\2\2\u00feT\3\2\2\2\u00ff"+
		"\u0100\7@\2\2\u0100V\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103"+
		"X\3\2\2\2\u0104\u0105\7>\2\2\u0105Z\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108"+
		"\7?\2\2\u0108\\\3\2\2\2\u0109\u010b\t\6\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d^\3\2\2\2"+
		"\u010e\u0110\t\6\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0117\7\60\2\2"+
		"\u0114\u0116\t\6\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118`\3\2\2\2\u0119\u0117\3\2\2\2\b\2d\u00ee"+
		"\u010c\u0111\u0117\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}