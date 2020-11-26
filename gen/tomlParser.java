// Generated from /home/andre/IdeaProjects/toml-to-c-struct/src/toml.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tomlParser extends Parser {
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
	public static final int
		RULE_document = 0, RULE_expression = 1, RULE_comment = 2, RULE_key_value = 3, 
		RULE_key = 4, RULE_simple_key = 5, RULE_unquoted_key = 6, RULE_quoted_key = 7, 
		RULE_dotted_key = 8, RULE_value = 9, RULE_string = 10, RULE_integer = 11, 
		RULE_floating_point = 12, RULE_bool = 13, RULE_date_time = 14, RULE_array = 15, 
		RULE_array_values = 16, RULE_comment_or_nl = 17, RULE_table = 18, RULE_standard_table = 19, 
		RULE_inline_table = 20, RULE_inline_table_keyvals = 21, RULE_inline_table_keyvals_non_empty = 22, 
		RULE_array_table = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "expression", "comment", "key_value", "key", "simple_key", 
			"unquoted_key", "quoted_key", "dotted_key", "value", "string", "integer", 
			"floating_point", "bool", "date_time", "array", "array_values", "comment_or_nl", 
			"table", "standard_table", "inline_table", "inline_table_keyvals", "inline_table_keyvals_non_empty", 
			"array_table"
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

	@Override
	public String getGrammarFileName() { return "toml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tomlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(tomlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(tomlParser.NL, i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			expression();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(49);
				match(NL);
				setState(50);
				expression();
				}
				}
				setState(55);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Key_valueContext key_value() {
			return getRuleContext(Key_valueContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_STRING:
			case LITERAL_STRING:
			case UNQUOTED_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				key_value();
				setState(57);
				comment();
				}
				break;
			case T__2:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				table();
				setState(60);
				comment();
				}
				break;
			case EOF:
			case NL:
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				comment();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(tomlParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(65);
				match(COMMENT);
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

	public static class Key_valueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterKey_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitKey_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitKey_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			key();
			setState(69);
			match(T__0);
			setState(70);
			value();
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

	public static class KeyContext extends ParserRuleContext {
		public Simple_keyContext simple_key() {
			return getRuleContext(Simple_keyContext.class,0);
		}
		public Dotted_keyContext dotted_key() {
			return getRuleContext(Dotted_keyContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				simple_key();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				dotted_key();
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

	public static class Simple_keyContext extends ParserRuleContext {
		public Quoted_keyContext quoted_key() {
			return getRuleContext(Quoted_keyContext.class,0);
		}
		public Unquoted_keyContext unquoted_key() {
			return getRuleContext(Unquoted_keyContext.class,0);
		}
		public Simple_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterSimple_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitSimple_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitSimple_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_keyContext simple_key() throws RecognitionException {
		Simple_keyContext _localctx = new Simple_keyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_key);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_STRING:
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				quoted_key();
				}
				break;
			case UNQUOTED_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				unquoted_key();
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

	public static class Unquoted_keyContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_KEY() { return getToken(tomlParser.UNQUOTED_KEY, 0); }
		public Unquoted_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquoted_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterUnquoted_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitUnquoted_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitUnquoted_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unquoted_keyContext unquoted_key() throws RecognitionException {
		Unquoted_keyContext _localctx = new Unquoted_keyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unquoted_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(UNQUOTED_KEY);
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

	public static class Quoted_keyContext extends ParserRuleContext {
		public TerminalNode BASIC_STRING() { return getToken(tomlParser.BASIC_STRING, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(tomlParser.LITERAL_STRING, 0); }
		public Quoted_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterQuoted_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitQuoted_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitQuoted_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quoted_keyContext quoted_key() throws RecognitionException {
		Quoted_keyContext _localctx = new Quoted_keyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_quoted_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==BASIC_STRING || _la==LITERAL_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Dotted_keyContext extends ParserRuleContext {
		public List<Simple_keyContext> simple_key() {
			return getRuleContexts(Simple_keyContext.class);
		}
		public Simple_keyContext simple_key(int i) {
			return getRuleContext(Simple_keyContext.class,i);
		}
		public Dotted_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterDotted_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitDotted_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitDotted_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_keyContext dotted_key() throws RecognitionException {
		Dotted_keyContext _localctx = new Dotted_keyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dotted_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			simple_key();
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				match(T__1);
				setState(86);
				simple_key();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class ValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Floating_pointContext floating_point() {
			return getRuleContext(Floating_pointContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Date_timeContext date_time() {
			return getRuleContext(Date_timeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Inline_tableContext inline_table() {
			return getRuleContext(Inline_tableContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_STRING:
			case ML_BASIC_STRING:
			case LITERAL_STRING:
			case ML_LITERAL_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				string();
				}
				break;
			case DEC_INT:
			case HEX_INT:
			case OCT_INT:
			case BIN_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				integer();
				}
				break;
			case FLOAT:
			case INF:
			case NAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				floating_point();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				bool();
				}
				break;
			case OFFSET_DATE_TIME:
			case LOCAL_DATE_TIME:
			case LOCAL_DATE:
			case LOCAL_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				date_time();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				array();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				inline_table();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode BASIC_STRING() { return getToken(tomlParser.BASIC_STRING, 0); }
		public TerminalNode ML_BASIC_STRING() { return getToken(tomlParser.ML_BASIC_STRING, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(tomlParser.LITERAL_STRING, 0); }
		public TerminalNode ML_LITERAL_STRING() { return getToken(tomlParser.ML_LITERAL_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASIC_STRING) | (1L << ML_BASIC_STRING) | (1L << LITERAL_STRING) | (1L << ML_LITERAL_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DEC_INT() { return getToken(tomlParser.DEC_INT, 0); }
		public TerminalNode HEX_INT() { return getToken(tomlParser.HEX_INT, 0); }
		public TerminalNode OCT_INT() { return getToken(tomlParser.OCT_INT, 0); }
		public TerminalNode BIN_INT() { return getToken(tomlParser.BIN_INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_INT) | (1L << HEX_INT) | (1L << OCT_INT) | (1L << BIN_INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Floating_pointContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(tomlParser.FLOAT, 0); }
		public TerminalNode INF() { return getToken(tomlParser.INF, 0); }
		public TerminalNode NAN() { return getToken(tomlParser.NAN, 0); }
		public Floating_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterFloating_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitFloating_point(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitFloating_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_pointContext floating_point() throws RecognitionException {
		Floating_pointContext _localctx = new Floating_pointContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_floating_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INF) | (1L << NAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(tomlParser.BOOLEAN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(BOOLEAN);
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

	public static class Date_timeContext extends ParserRuleContext {
		public TerminalNode OFFSET_DATE_TIME() { return getToken(tomlParser.OFFSET_DATE_TIME, 0); }
		public TerminalNode LOCAL_DATE_TIME() { return getToken(tomlParser.LOCAL_DATE_TIME, 0); }
		public TerminalNode LOCAL_DATE() { return getToken(tomlParser.LOCAL_DATE, 0); }
		public TerminalNode LOCAL_TIME() { return getToken(tomlParser.LOCAL_TIME, 0); }
		public Date_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterDate_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitDate_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitDate_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_timeContext date_time() throws RecognitionException {
		Date_timeContext _localctx = new Date_timeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OFFSET_DATE_TIME) | (1L << LOCAL_DATE_TIME) | (1L << LOCAL_DATE) | (1L << LOCAL_TIME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArrayContext extends ParserRuleContext {
		public Comment_or_nlContext comment_or_nl() {
			return getRuleContext(Comment_or_nlContext.class,0);
		}
		public Array_valuesContext array_values() {
			return getRuleContext(Array_valuesContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__2);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(111);
				array_values();
				}
				break;
			}
			setState(114);
			comment_or_nl();
			setState(115);
			match(T__3);
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

	public static class Array_valuesContext extends ParserRuleContext {
		public List<Comment_or_nlContext> comment_or_nl() {
			return getRuleContexts(Comment_or_nlContext.class);
		}
		public Comment_or_nlContext comment_or_nl(int i) {
			return getRuleContext(Comment_or_nlContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Array_valuesContext array_values() {
			return getRuleContext(Array_valuesContext.class,0);
		}
		public Array_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterArray_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitArray_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitArray_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_valuesContext array_values() throws RecognitionException {
		Array_valuesContext _localctx = new Array_valuesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_values);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(117);
				comment_or_nl();
				setState(118);
				value();
				setState(119);
				match(T__4);
				setState(120);
				array_values();
				setState(121);
				comment_or_nl();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				comment_or_nl();
				setState(124);
				value();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(125);
					match(T__4);
					}
				}

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

	public static class Comment_or_nlContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(tomlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(tomlParser.NL, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(tomlParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(tomlParser.COMMENT, i);
		}
		public Comment_or_nlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_or_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterComment_or_nl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitComment_or_nl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitComment_or_nl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_or_nlContext comment_or_nl() throws RecognitionException {
		Comment_or_nlContext _localctx = new Comment_or_nlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comment_or_nl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(130);
						match(COMMENT);
						}
					}

					setState(133);
					match(NL);
					}
					} 
				}
				setState(138);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public Standard_tableContext standard_table() {
			return getRuleContext(Standard_tableContext.class,0);
		}
		public Array_tableContext array_table() {
			return getRuleContext(Array_tableContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				standard_table();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				array_table();
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

	public static class Standard_tableContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Standard_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterStandard_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitStandard_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitStandard_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_tableContext standard_table() throws RecognitionException {
		Standard_tableContext _localctx = new Standard_tableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_standard_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__2);
			setState(144);
			key();
			setState(145);
			match(T__3);
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

	public static class Inline_tableContext extends ParserRuleContext {
		public Inline_table_keyvalsContext inline_table_keyvals() {
			return getRuleContext(Inline_table_keyvalsContext.class,0);
		}
		public Inline_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterInline_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitInline_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitInline_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_tableContext inline_table() throws RecognitionException {
		Inline_tableContext _localctx = new Inline_tableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inline_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__5);
			setState(148);
			inline_table_keyvals();
			setState(149);
			match(T__6);
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

	public static class Inline_table_keyvalsContext extends ParserRuleContext {
		public Inline_table_keyvals_non_emptyContext inline_table_keyvals_non_empty() {
			return getRuleContext(Inline_table_keyvals_non_emptyContext.class,0);
		}
		public Inline_table_keyvalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_table_keyvals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterInline_table_keyvals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitInline_table_keyvals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitInline_table_keyvals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_table_keyvalsContext inline_table_keyvals() throws RecognitionException {
		Inline_table_keyvalsContext _localctx = new Inline_table_keyvalsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inline_table_keyvals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASIC_STRING) | (1L << LITERAL_STRING) | (1L << UNQUOTED_KEY))) != 0)) {
				{
				setState(151);
				inline_table_keyvals_non_empty();
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

	public static class Inline_table_keyvals_non_emptyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Inline_table_keyvals_non_emptyContext inline_table_keyvals_non_empty() {
			return getRuleContext(Inline_table_keyvals_non_emptyContext.class,0);
		}
		public Inline_table_keyvals_non_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_table_keyvals_non_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterInline_table_keyvals_non_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitInline_table_keyvals_non_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitInline_table_keyvals_non_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_table_keyvals_non_emptyContext inline_table_keyvals_non_empty() throws RecognitionException {
		Inline_table_keyvals_non_emptyContext _localctx = new Inline_table_keyvals_non_emptyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inline_table_keyvals_non_empty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			key();
			setState(155);
			match(T__0);
			setState(156);
			value();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(157);
				match(T__4);
				setState(158);
				inline_table_keyvals_non_empty();
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

	public static class Array_tableContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Array_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).enterArray_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tomlListener ) ((tomlListener)listener).exitArray_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tomlVisitor ) return ((tomlVisitor<? extends T>)visitor).visitArray_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_tableContext array_table() throws RecognitionException {
		Array_tableContext _localctx = new Array_tableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__7);
			setState(162);
			key();
			setState(163);
			match(T__8);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6M\n\6\3\7\3\7\5\7Q\n\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\6\nZ\n\n\r\n\16\n[\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13e\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\5\21s\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0081\n\22\5\22\u0083\n\22\3\23\5\23\u0086\n\23\3\23\7"+
		"\23\u0089\n\23\f\23\16\23\u008c\13\23\3\24\3\24\5\24\u0090\n\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\5\27\u009b\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00a2\n\30\3\31\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7\4\2\20\20\22\22\3\2\20\23"+
		"\3\2\27\32\3\2\24\26\3\2\33\36\2\u00a4\2\62\3\2\2\2\4A\3\2\2\2\6D\3\2"+
		"\2\2\bF\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22V\3\2"+
		"\2\2\24d\3\2\2\2\26f\3\2\2\2\30h\3\2\2\2\32j\3\2\2\2\34l\3\2\2\2\36n\3"+
		"\2\2\2 p\3\2\2\2\"\u0082\3\2\2\2$\u008a\3\2\2\2&\u008f\3\2\2\2(\u0091"+
		"\3\2\2\2*\u0095\3\2\2\2,\u009a\3\2\2\2.\u009c\3\2\2\2\60\u00a3\3\2\2\2"+
		"\62\67\5\4\3\2\63\64\7\r\2\2\64\66\5\4\3\2\65\63\3\2\2\2\669\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:;\5\b\5\2;<\5\6\4\2<B\3"+
		"\2\2\2=>\5&\24\2>?\5\6\4\2?B\3\2\2\2@B\5\6\4\2A:\3\2\2\2A=\3\2\2\2A@\3"+
		"\2\2\2B\5\3\2\2\2CE\7\16\2\2DC\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FG\5\n\6\2"+
		"GH\7\3\2\2HI\5\24\13\2I\t\3\2\2\2JM\5\f\7\2KM\5\22\n\2LJ\3\2\2\2LK\3\2"+
		"\2\2M\13\3\2\2\2NQ\5\20\t\2OQ\5\16\b\2PN\3\2\2\2PO\3\2\2\2Q\r\3\2\2\2"+
		"RS\7\37\2\2S\17\3\2\2\2TU\t\2\2\2U\21\3\2\2\2VY\5\f\7\2WX\7\4\2\2XZ\5"+
		"\f\7\2YW\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\23\3\2\2\2]e\5\26\f"+
		"\2^e\5\30\r\2_e\5\32\16\2`e\5\34\17\2ae\5\36\20\2be\5 \21\2ce\5*\26\2"+
		"d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2"+
		"e\25\3\2\2\2fg\t\3\2\2g\27\3\2\2\2hi\t\4\2\2i\31\3\2\2\2jk\t\5\2\2k\33"+
		"\3\2\2\2lm\7\17\2\2m\35\3\2\2\2no\t\6\2\2o\37\3\2\2\2pr\7\5\2\2qs\5\""+
		"\22\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\5$\23\2uv\7\6\2\2v!\3\2\2\2wx\5"+
		"$\23\2xy\5\24\13\2yz\7\7\2\2z{\5\"\22\2{|\5$\23\2|\u0083\3\2\2\2}~\5$"+
		"\23\2~\u0080\5\24\13\2\177\u0081\7\7\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082w\3\2\2\2\u0082}\3\2\2\2\u0083#\3\2"+
		"\2\2\u0084\u0086\7\16\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\7\r\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b%\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0090\5(\25\2\u008e\u0090\5\60\31\2\u008f\u008d\3\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\'\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0093\5"+
		"\n\6\2\u0093\u0094\7\6\2\2\u0094)\3\2\2\2\u0095\u0096\7\b\2\2\u0096\u0097"+
		"\5,\27\2\u0097\u0098\7\t\2\2\u0098+\3\2\2\2\u0099\u009b\5.\30\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b-\3\2\2\2\u009c\u009d\5\n\6\2"+
		"\u009d\u009e\7\3\2\2\u009e\u00a1\5\24\13\2\u009f\u00a0\7\7\2\2\u00a0\u00a2"+
		"\5.\30\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2/\3\2\2\2\u00a3"+
		"\u00a4\7\n\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\7\13\2\2\u00a6\61\3\2\2"+
		"\2\21\67ADLP[dr\u0080\u0082\u0085\u008a\u008f\u009a\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}