// Generated from /home/andre/IdeaProjects/toml-to-c-struct/src/toml.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tomlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, NL=11, COMMENT=12, BOOLEAN=13, BASIC_STRING=14, ML_BASIC_STRING=15, 
		LITERAL_STRING=16, ML_LITERAL_STRING=17, FLOAT=18, INF=19, NAN=20, DEC_INT=21, 
		HEX_INT=22, OCT_INT=23, BIN_INT=24, OFFSET_DATE_TIME=25, LOCAL_DATE_TIME=26, 
		LOCAL_DATE=27, LOCAL_TIME=28, UNQUOTED_KEY=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WS", "NL", "COMMENT", "DIGIT", "ALPHA", "BOOLEAN", "ESC", "ML_ESC", 
			"UNICODE", "EX_UNICODE", "BASIC_STRING", "ML_BASIC_STRING", "LITERAL_STRING", 
			"ML_LITERAL_STRING", "EXP", "ZERO_PREFIXABLE_INT", "FRAC", "FLOAT", "INF", 
			"NAN", "HEX_DIGIT", "DIGIT_1_9", "DIGIT_0_7", "DIGIT_0_1", "DEC_INT", 
			"HEX_INT", "OCT_INT", "BIN_INT", "YEAR", "MONTH", "DAY", "DELIM", "HOUR", 
			"MINUTE", "SECOND", "SECFRAC", "NUMOFFSET", "OFFSET", "PARTIAL_TIME", 
			"FULL_DATE", "FULL_TIME", "OFFSET_DATE_TIME", "LOCAL_DATE_TIME", "LOCAL_DATE", 
			"LOCAL_TIME", "UNQUOTED_KEY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'.'", "'['", "']'", "','", "'{'", "'}'", "'[['", "']]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "NL", 
			"COMMENT", "BOOLEAN", "BASIC_STRING", "ML_BASIC_STRING", "LITERAL_STRING", 
			"ML_LITERAL_STRING", "FLOAT", "INF", "NAN", "DEC_INT", "HEX_INT", "OCT_INT", 
			"BIN_INT", "OFFSET_DATE_TIME", "LOCAL_DATE_TIME", "LOCAL_DATE", "LOCAL_TIME", 
			"UNQUOTED_KEY"
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


	public tomlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "toml.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u019f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\6\13\u0087\n"+
		"\13\r\13\16\13\u0088\3\13\3\13\3\f\5\f\u008e\n\f\3\f\6\f\u0091\n\f\r\f"+
		"\16\f\u0092\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21"+
		"\3\21\3\21\3\21\5\21\u00af\n\21\3\22\3\22\5\22\u00b3\n\22\3\22\3\22\5"+
		"\22\u00b7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d9\n\26\f\26\16"+
		"\26\u00dc\13\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00e4\n\27\f\27\16"+
		"\27\u00e7\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00f0\n\30\f\30"+
		"\16\30\u00f3\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\7\32\u0100\n\32\f\32\16\32\u0103\13\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\5\34\u010c\n\34\5\34\u010e\n\34\3\35\5\35\u0111\n\35\3\35\3\35"+
		"\3\35\3\35\3\36\5\36\u0118\n\36\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u0120"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\3#\5#\u0129\n#\3#\3#\3#\3#\3#\6#\u0130\n#\r"+
		"#\16#\u0131\5#\u0134\n#\3$\3$\3$\3$\3$\3$\3$\7$\u013d\n$\f$\16$\u0140"+
		"\13$\3%\3%\3%\3%\3%\3%\3%\5%\u0149\n%\3&\3&\3&\3&\3&\3&\3&\7&\u0152\n"+
		"&\f&\16&\u0155\13&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\6.\u016f\n.\r.\16.\u0170\3/\3/\3/\3/\3/\3\60"+
		"\3\60\5\60\u017a\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0182\n\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\68\u019c\n8\r8\168\u019d\6"+
		"\u00cd\u00da\u00e5\u00f1\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\2\35\2\37\17!\2#\2%\2\'\2)\20+\21-\22/\23\61\2\63\2\65"+
		"\2\67\249\25;\26=\2?\2A\2C\2E\27G\30I\31K\32M\2O\2Q\2S\2U\2W\2Y\2[\2]"+
		"\2_\2a\2c\2e\2g\33i\34k\35m\36o\37\3\2\22\4\2\13\13\"\"\3\2\f\f\3\2\62"+
		";\4\2C\\c|\n\2$$\61\61^^ddhhppttvv\5\2\f\f$$^^\4\2$$^^\4\2\f\f))\4\2G"+
		"Ggg\4\2--//\3\2CH\3\2\63;\3\2\629\3\2\62\63\4\2VVvv\4\2//aa\2\u01a9\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\37\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2"+
		"\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2"+
		"\2\21\177\3\2\2\2\23\u0082\3\2\2\2\25\u0086\3\2\2\2\27\u0090\3\2\2\2\31"+
		"\u0094\3\2\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2\2\37\u00a8\3\2\2\2!\u00aa"+
		"\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00be\3\2\2\2)\u00c8\3\2\2\2"+
		"+\u00d2\3\2\2\2-\u00e1\3\2\2\2/\u00ea\3\2\2\2\61\u00f8\3\2\2\2\63\u00fb"+
		"\3\2\2\2\65\u0104\3\2\2\2\67\u0107\3\2\2\29\u0110\3\2\2\2;\u0117\3\2\2"+
		"\2=\u011f\3\2\2\2?\u0121\3\2\2\2A\u0123\3\2\2\2C\u0125\3\2\2\2E\u0128"+
		"\3\2\2\2G\u0135\3\2\2\2I\u0141\3\2\2\2K\u014a\3\2\2\2M\u0156\3\2\2\2O"+
		"\u015b\3\2\2\2Q\u015e\3\2\2\2S\u0161\3\2\2\2U\u0163\3\2\2\2W\u0166\3\2"+
		"\2\2Y\u0169\3\2\2\2[\u016c\3\2\2\2]\u0172\3\2\2\2_\u0179\3\2\2\2a\u017b"+
		"\3\2\2\2c\u0183\3\2\2\2e\u0189\3\2\2\2g\u018c\3\2\2\2i\u0190\3\2\2\2k"+
		"\u0194\3\2\2\2m\u0196\3\2\2\2o\u019b\3\2\2\2qr\7?\2\2r\4\3\2\2\2st\7\60"+
		"\2\2t\6\3\2\2\2uv\7]\2\2v\b\3\2\2\2wx\7_\2\2x\n\3\2\2\2yz\7.\2\2z\f\3"+
		"\2\2\2{|\7}\2\2|\16\3\2\2\2}~\7\177\2\2~\20\3\2\2\2\177\u0080\7]\2\2\u0080"+
		"\u0081\7]\2\2\u0081\22\3\2\2\2\u0082\u0083\7_\2\2\u0083\u0084\7_\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\b\13\2\2\u008b\26\3\2\2\2\u008c\u008e\7\17\2\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\f\2\2\u0090\u008d\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\30\3\2\2\2\u0094\u0098\7%\2\2\u0095\u0097\n\3\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\32"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\t\4\2\2\u009c\34\3\2\2\2\u009d"+
		"\u009e\t\5\2\2\u009e\36\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\u00a2\7w\2\2\u00a2\u00a9\7g\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2\u00a8"+
		"\u009f\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9 \3\2\2\2\u00aa\u00ae\7^\2\2\u00ab"+
		"\u00af\t\6\2\2\u00ac\u00af\5%\23\2\u00ad\u00af\5\'\24\2\u00ae\u00ab\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\"\3\2\2\2\u00b0\u00b2"+
		"\7^\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b7\7\f\2\2\u00b5\u00b7\5!\21\2\u00b6\u00b0\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba"+
		"\5=\37\2\u00ba\u00bb\5=\37\2\u00bb\u00bc\5=\37\2\u00bc\u00bd\5=\37\2\u00bd"+
		"&\3\2\2\2\u00be\u00bf\7W\2\2\u00bf\u00c0\5=\37\2\u00c0\u00c1\5=\37\2\u00c1"+
		"\u00c2\5=\37\2\u00c2\u00c3\5=\37\2\u00c3\u00c4\5=\37\2\u00c4\u00c5\5="+
		"\37\2\u00c5\u00c6\5=\37\2\u00c6\u00c7\5=\37\2\u00c7(\3\2\2\2\u00c8\u00cd"+
		"\7$\2\2\u00c9\u00cc\5!\21\2\u00ca\u00cc\n\7\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1"+
		"*\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d4\7$\2\2\u00d4\u00d5\7$\2\2\u00d5"+
		"\u00da\3\2\2\2\u00d6\u00d9\5#\22\2\u00d7\u00d9\n\b\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$"+
		"\2\2\u00de\u00df\7$\2\2\u00df\u00e0\7$\2\2\u00e0,\3\2\2\2\u00e1\u00e5"+
		"\7)\2\2\u00e2\u00e4\n\t\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\7)\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec"+
		"\7)\2\2\u00ec\u00ed\7)\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\13\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7)\2\2\u00f5"+
		"\u00f6\7)\2\2\u00f6\u00f7\7)\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\t\n\2\2"+
		"\u00f9\u00fa\5E#\2\u00fa\62\3\2\2\2\u00fb\u0101\5\33\16\2\u00fc\u0100"+
		"\5\33\16\2\u00fd\u00fe\7a\2\2\u00fe\u0100\5\33\16\2\u00ff\u00fc\3\2\2"+
		"\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\64\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\60\2\2\u0105"+
		"\u0106\5\63\32\2\u0106\66\3\2\2\2\u0107\u010d\5E#\2\u0108\u010e\5\61\31"+
		"\2\u0109\u010b\5\65\33\2\u010a\u010c\5\61\31\2\u010b\u010a\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010e8\3\2\2\2\u010f\u0111\t\13\2\2\u0110\u010f\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114"+
		"\u0115\7h\2\2\u0115:\3\2\2\2\u0116\u0118\t\13\2\2\u0117\u0116\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7p\2\2\u011a\u011b"+
		"\7c\2\2\u011b\u011c\7p\2\2\u011c<\3\2\2\2\u011d\u0120\t\f\2\2\u011e\u0120"+
		"\5\33\16\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120>\3\2\2\2\u0121"+
		"\u0122\t\r\2\2\u0122@\3\2\2\2\u0123\u0124\t\16\2\2\u0124B\3\2\2\2\u0125"+
		"\u0126\t\17\2\2\u0126D\3\2\2\2\u0127\u0129\t\13\2\2\u0128\u0127\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u0133\3\2\2\2\u012a\u0134\5\33\16\2\u012b"+
		"\u012f\5? \2\u012c\u0130\5\33\16\2\u012d\u012e\7a\2\2\u012e\u0130\5\33"+
		"\16\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012a\3\2"+
		"\2\2\u0133\u012b\3\2\2\2\u0134F\3\2\2\2\u0135\u0136\7\62\2\2\u0136\u0137"+
		"\7z\2\2\u0137\u0138\3\2\2\2\u0138\u013e\5=\37\2\u0139\u013d\5=\37\2\u013a"+
		"\u013b\7a\2\2\u013b\u013d\5=\37\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"H\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\62\2\2\u0142\u0143\7q\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0148\5A!\2\u0145\u0149\5A!\2\u0146\u0147\7"+
		"a\2\2\u0147\u0149\5A!\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"J\3\2\2\2\u014a\u014b\7\62\2\2\u014b\u014c\7d\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\u0153\5C\"\2\u014e\u0152\5C\"\2\u014f\u0150\7a\2\2\u0150\u0152"+
		"\5C\"\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154L\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0156\u0157\5\33\16\2\u0157\u0158\5\33\16\2\u0158\u0159\5\33\16\2\u0159"+
		"\u015a\5\33\16\2\u015aN\3\2\2\2\u015b\u015c\5\33\16\2\u015c\u015d\5\33"+
		"\16\2\u015dP\3\2\2\2\u015e\u015f\5\33\16\2\u015f\u0160\5\33\16\2\u0160"+
		"R\3\2\2\2\u0161\u0162\t\20\2\2\u0162T\3\2\2\2\u0163\u0164\5\33\16\2\u0164"+
		"\u0165\5\33\16\2\u0165V\3\2\2\2\u0166\u0167\5\33\16\2\u0167\u0168\5\33"+
		"\16\2\u0168X\3\2\2\2\u0169\u016a\5\33\16\2\u016a\u016b\5\33\16\2\u016b"+
		"Z\3\2\2\2\u016c\u016e\7\60\2\2\u016d\u016f\5\33\16\2\u016e\u016d\3\2\2"+
		"\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\\"+
		"\3\2\2\2\u0172\u0173\t\13\2\2\u0173\u0174\5U+\2\u0174\u0175\7<\2\2\u0175"+
		"\u0176\5W,\2\u0176^\3\2\2\2\u0177\u017a\7\\\2\2\u0178\u017a\5]/\2\u0179"+
		"\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a`\3\2\2\2\u017b\u017c\5U+\2\u017c"+
		"\u017d\7<\2\2\u017d\u017e\5W,\2\u017e\u017f\7<\2\2\u017f\u0181\5Y-\2\u0180"+
		"\u0182\5[.\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182b\3\2\2\2\u0183"+
		"\u0184\5M\'\2\u0184\u0185\7/\2\2\u0185\u0186\5O(\2\u0186\u0187\7/\2\2"+
		"\u0187\u0188\5Q)\2\u0188d\3\2\2\2\u0189\u018a\5a\61\2\u018a\u018b\5_\60"+
		"\2\u018bf\3\2\2\2\u018c\u018d\5c\62\2\u018d\u018e\5S*\2\u018e\u018f\5"+
		"e\63\2\u018fh\3\2\2\2\u0190\u0191\5c\62\2\u0191\u0192\5S*\2\u0192\u0193"+
		"\5a\61\2\u0193j\3\2\2\2\u0194\u0195\5c\62\2\u0195l\3\2\2\2\u0196\u0197"+
		"\5a\61\2\u0197n\3\2\2\2\u0198\u019c\5\35\17\2\u0199\u019c\5\33\16\2\u019a"+
		"\u019c\t\21\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3"+
		"\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"p\3\2\2\2&\2\u0088\u008d\u0092\u0098\u00a8\u00ae\u00b2\u00b6\u00cb\u00cd"+
		"\u00d8\u00da\u00e5\u00f1\u00ff\u0101\u010b\u010d\u0110\u0117\u011f\u0128"+
		"\u012f\u0131\u0133\u013c\u013e\u0148\u0151\u0153\u0170\u0179\u0181\u019b"+
		"\u019d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}