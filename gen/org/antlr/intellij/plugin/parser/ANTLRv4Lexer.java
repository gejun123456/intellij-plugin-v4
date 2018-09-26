// Generated from D:/code/github/intellij-plugin-v4/src/grammars/org/antlr/intellij/plugin/parser\ANTLRv4Lexer.g4 by ANTLR 4.7
package org.antlr.intellij.plugin.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, BEGIN_ARG_ACTION=7, OPTIONS=8, TOKENS=9, CHANNELS=10, 
		IMPORT=11, FRAGMENT=12, LEXER=13, PARSER=14, GRAMMAR=15, PROTECTED=16, 
		PUBLIC=17, PRIVATE=18, RETURNS=19, LOCALS=20, THROWS=21, CATCH=22, FINALLY=23, 
		MODE=24, COLON=25, COLONCOLON=26, COMMA=27, SEMI=28, LPAREN=29, RPAREN=30, 
		RARROW=31, LT=32, GT=33, ASSIGN=34, QUESTION=35, STAR=36, PLUS=37, PLUS_ASSIGN=38, 
		OR=39, DOLLAR=40, DOT=41, RANGE=42, AT=43, POUND=44, NOT=45, RBRACE=46, 
		ID=47, INT=48, STRING_LITERAL=49, UNTERMINATED_STRING_LITERAL=50, WS=51, 
		ACTION=52, ERRCHAR=53, ARG_ACTION=54, UNTERMINATED_ARG_ACTION=55, UNTERMINATED_CHAR_SET=56;
	public static final int
		ArgAction=1, LexerCharSet=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ArgAction", "LexerCharSet"
	};

	public static final String[] ruleNames = {
		"DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", 
		"TOKENS", "CHANNELS", "IMPORT", "FRAGMENT", "LEXER", "PARSER", "GRAMMAR", 
		"PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", 
		"FINALLY", "MODE", "COLON", "COLONCOLON", "COMMA", "SEMI", "LPAREN", "RPAREN", 
		"RARROW", "LT", "GT", "ASSIGN", "QUESTION", "STAR", "PLUS", "PLUS_ASSIGN", 
		"OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", "NOT", "RBRACE", "ID", 
		"NameChar", "NameStartChar", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"ESC_SEQ", "UNICODE_ESC", "UNICODE_EXTENDED_ESC", "HEX_DIGIT", "WS", "ACTION", 
		"ACTION_ESCAPE", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "ERRCHAR", 
		"NESTED_ARG_ACTION", "ARG_ACTION_ESCAPE", "ARG_ACTION_STRING_LITERAL", 
		"ARG_ACTION_CHAR_LITERAL", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "ARG_ACTION_CHAR", 
		"LEXER_CHAR_SET_BODY", "LEXER_CHAR_SET", "UNTERMINATED_CHAR_SET"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'import'", 
		"'fragment'", "'lexer'", "'parser'", "'grammar'", "'protected'", "'public'", 
		"'private'", "'returns'", "'locals'", "'throws'", "'catch'", "'finally'", 
		"'mode'", "':'", "'::'", "','", "';'", "'('", "')'", "'->'", "'<'", "'>'", 
		"'='", "'?'", "'*'", "'+'", "'+='", "'|'", "'$'", "'.'", "'..'", "'@'", 
		"'#'", "'~'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
		"LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", "TOKENS", "CHANNELS", "IMPORT", 
		"FRAGMENT", "LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", 
		"RETURNS", "LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", "LT", "GT", "ASSIGN", "QUESTION", 
		"STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", 
		"NOT", "RBRACE", "ID", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"WS", "ACTION", "ERRCHAR", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "UNTERMINATED_CHAR_SET"
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


		/** Track whether we are inside of a rule and whether it is lexical parser.
		 *  _currentRuleType==Token.INVALID_TYPE means that we are outside of a rule.
		 *  At the first sign of a rule name reference and _currentRuleType==invalid,
		 *  we can assume that we are starting a parser rule. Similarly, seeing
		 *  a token reference when not already in rule means starting a token
		 *  rule. The terminating ';' of a rule, flips this back to invalid type.
		 *
		 *  This is not perfect logic but works. For example, "grammar T;" means
		 *  that we start and stop a lexical rule for the "T;". Dangerous but works.
		 *
		 *  The whole point of this state information is to distinguish
		 *  between [..arg actions..] and [charsets]. Char sets can only occur in
		 *  lexical rules and arg actions cannot occur.
		 */
		private int _currentRuleType = Token.INVALID_TYPE;

		public int getCurrentRuleType() {
			return _currentRuleType;
		}

		public void setCurrentRuleType(int ruleType) {
			this._currentRuleType = ruleType;
		}

		protected void handleBeginArgAction() {
			if (inLexerRule()) {
				pushMode(LexerCharSet);
				more();
			}
			else {
				pushMode(ArgAction);
				more();
			}
		}

		@Override
		public Token emit() {
			if (_type == ID) {
				String firstChar = _input.getText(Interval.of(_tokenStartCharIndex, _tokenStartCharIndex));
				if (Character.isUpperCase(firstChar.charAt(0))) {
					_type = TOKEN_REF;
				} else {
					_type = RULE_REF;
				}

				if (_currentRuleType == Token.INVALID_TYPE) { // if outside of rule def
					_currentRuleType = _type;                 // set to inside lexer or parser rule
				}
			}
			else if (_type == SEMI) {                  // exit rule def
				_currentRuleType = Token.INVALID_TYPE;
			}

			return super.emit();
		}

		private boolean inLexerRule() {
			return _currentRuleType == TOKEN_REF;
		}
		private boolean inParserRule() { // not used, but added for clarity
			return _currentRuleType == RULE_REF;
		}

		/** Override nextToken so we can alter how it handles token errors.
		 *  Instead of looking for a new (valid) token, it should return an
		 *  invalid token. Changed "if ( _type ==SKIP )" part only from 4.7.
		 */
		@Override
		public Token nextToken() {
			if (_input == null) {
				throw new IllegalStateException("nextToken requires a non-null input stream.");
			}

			// Mark start location in char stream so unbuffered streams are
			// guaranteed at least have text of current token
			int tokenStartMarker = _input.mark();
			try{
				outer:
				while (true) {
					if (_hitEOF) {
						emitEOF();
						return _token;
					}

					_token = null;
					_channel = Token.DEFAULT_CHANNEL;
					_tokenStartCharIndex = _input.index();
					_tokenStartCharPositionInLine = getInterpreter().getCharPositionInLine();
					_tokenStartLine = getInterpreter().getLine();
					_text = null;
					do {
						_type = Token.INVALID_TYPE;
	//				System.out.println("nextToken line "+tokenStartLine+" at "+((char)input.LA(1))+
	//								   " in mode "+mode+
	//								   " at index "+input.index());
						int ttype;
						try {
							ttype = getInterpreter().match(_input, _mode);
						}
						catch (LexerNoViableAltException e) {
							notifyListeners(e);		// report error
							recover(e);
							ttype = SKIP;
						}
						if ( _input.LA(1)==IntStream.EOF ) {
							_hitEOF = true;
						}
						if ( _type == Token.INVALID_TYPE ) _type = ttype;
						if ( _type ==SKIP ) {
							_type = Token.INVALID_TYPE;
							emit();
							return _token; // return a single bad token for this unmatched input
	//						continue outer;
						}
					} while ( _type ==MORE );
					if ( _token == null ) emit();
					return _token;
				}
			}
			finally {
				// make sure we release marker after match or
				// unbuffered char stream will keep buffering
				_input.release(tokenStartMarker);
			}
		}


	public ANTLRv4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLRv4Lexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			BEGIN_ARG_ACTION_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BEGIN_ARG_ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			handleBeginArgAction();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u024c\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\u0095\n\2\f\2\16\2\u0098\13\2\3\2\3\2\3\2\5\2\u009d\n"+
		"\2\3\3\3\3\3\3\3\3\7\3\u00a3\n\3\f\3\16\3\u00a6\13\3\3\3\3\3\3\3\5\3\u00ab"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00b3\n\4\f\4\16\4\u00b6\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c6\n\6\f\6\16"+
		"\6\u00c9\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d5\n\7\f"+
		"\7\16\7\u00d8\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00e6\n\b\f\b\16\b\u00e9\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\7-\u0186\n-\f-\16-\u0189\13-\3.\3.\5.\u018d\n.\3/"+
		"\3/\3\60\6\60\u0192\n\60\r\60\16\60\u0193\3\61\3\61\3\61\7\61\u0199\n"+
		"\61\f\61\16\61\u019c\13\61\3\61\3\61\3\62\3\62\3\62\7\62\u01a3\n\62\f"+
		"\62\16\62\u01a6\13\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01ae\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u01bf\n\65\5\65\u01c1\n\65\5\65\u01c3\n\65\5\65\u01c5\n\65\5"+
		"\65\u01c7\n\65\3\65\3\65\3\66\3\66\3\67\6\67\u01ce\n\67\r\67\16\67\u01cf"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\78\u01dd\n8\f8\168\u01e0\138\38"+
		"\38\38\38\38\38\78\u01e8\n8\f8\168\u01eb\138\38\78\u01ee\n8\f8\168\u01f1"+
		"\138\38\58\u01f4\n8\39\39\39\3:\3:\3:\7:\u01fc\n:\f:\16:\u01ff\13:\3:"+
		"\3:\3;\3;\3;\7;\u0206\n;\f;\16;\u0209\13;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\7?\u021f\n?\f?\16?\u0222\13?\3?\3?\3?"+
		"\3?\3@\3@\3@\3@\5@\u022c\n@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C"+
		"\3C\3C\3D\3D\3D\5D\u0241\nD\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\6\u0096\u00a4"+
		"\u01de\u01ef\2G\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r\25\16\27\17\31\20"+
		"\33\21\35\22\37\23!\24#\25%\26\'\27)\30+\31-\32/\33\61\34\63\35\65\36"+
		"\67\379 ;!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W/Y\60[\61]\2_\2a\62c\63e\64g\2"+
		"i\2k\2m\2o\65q\66s\2u\2w\2y\67{\2}\2\177\2\u0081\2\u00838\u00859\u0087"+
		"\2\u0089\2\u008b\5\u008d:\5\2\3\4\16\4\2\f\f\17\17\5\2\13\f\16\17\"\""+
		"\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\3\2\62;\6\2\f\f\17\17))^^\t"+
		"\2))^^ddhhppttvv\5\2\62;CHch\3\3\177\177\4\2$$^^\4\2))^^\3\2^_\2\u026a"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2o\3\2"+
		"\2\2\2q\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\3}\3\2\2\2\3\177\3\2\2\2\3\u0081"+
		"\3\2\2\2\3\u0083\3\2\2\2\3\u0085\3\2\2\2\3\u0087\3\2\2\2\4\u0089\3\2\2"+
		"\2\4\u008b\3\2\2\2\4\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u009e\3\2\2\2\t\u00ae"+
		"\3\2\2\2\13\u00b9\3\2\2\2\r\u00bc\3\2\2\2\17\u00cc\3\2\2\2\21\u00db\3"+
		"\2\2\2\23\u00ec\3\2\2\2\25\u00f3\3\2\2\2\27\u00fc\3\2\2\2\31\u0102\3\2"+
		"\2\2\33\u0109\3\2\2\2\35\u0111\3\2\2\2\37\u011b\3\2\2\2!\u0122\3\2\2\2"+
		"#\u012a\3\2\2\2%\u0132\3\2\2\2\'\u0139\3\2\2\2)\u0140\3\2\2\2+\u0146\3"+
		"\2\2\2-\u014e\3\2\2\2/\u0153\3\2\2\2\61\u0155\3\2\2\2\63\u0158\3\2\2\2"+
		"\65\u015a\3\2\2\2\67\u015c\3\2\2\29\u015e\3\2\2\2;\u0160\3\2\2\2=\u0163"+
		"\3\2\2\2?\u0165\3\2\2\2A\u0167\3\2\2\2C\u0169\3\2\2\2E\u016b\3\2\2\2G"+
		"\u016d\3\2\2\2I\u016f\3\2\2\2K\u0172\3\2\2\2M\u0174\3\2\2\2O\u0176\3\2"+
		"\2\2Q\u0178\3\2\2\2S\u017b\3\2\2\2U\u017d\3\2\2\2W\u017f\3\2\2\2Y\u0181"+
		"\3\2\2\2[\u0183\3\2\2\2]\u018c\3\2\2\2_\u018e\3\2\2\2a\u0191\3\2\2\2c"+
		"\u0195\3\2\2\2e\u019f\3\2\2\2g\u01a7\3\2\2\2i\u01af\3\2\2\2k\u01b5\3\2"+
		"\2\2m\u01ca\3\2\2\2o\u01cd\3\2\2\2q\u01d3\3\2\2\2s\u01f5\3\2\2\2u\u01f8"+
		"\3\2\2\2w\u0202\3\2\2\2y\u020c\3\2\2\2{\u0210\3\2\2\2}\u0215\3\2\2\2\177"+
		"\u021a\3\2\2\2\u0081\u0227\3\2\2\2\u0083\u0231\3\2\2\2\u0085\u0235\3\2"+
		"\2\2\u0087\u0239\3\2\2\2\u0089\u0240\3\2\2\2\u008b\u0244\3\2\2\2\u008d"+
		"\u0248\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0092\7,"+
		"\2\2\u0092\u0096\3\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009c\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7,\2\2\u009a\u009d\7\61\2\2\u009b"+
		"\u009d\7\2\2\3\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d\6\3\2\2\2"+
		"\u009e\u009f\7\61\2\2\u009f\u00a0\7,\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3"+
		"\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8"+
		"\7,\2\2\u00a8\u00ab\7\61\2\2\u00a9\u00ab\7\2\2\3\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\3\2\2\u00ad\b\3\2\2\2"+
		"\u00ae\u00af\7\61\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3"+
		"\n\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\4"+
		"\2\2\u00b8\n\3\2\2\2\u00b9\u00ba\7]\2\2\u00ba\u00bb\b\5\3\2\u00bb\f\3"+
		"\2\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2"+
		"\u00c3\u00c7\3\2\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7}\2\2\u00cb\16\3\2\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd\u00ce\7q\2\2\u00ce\u00cf\7m\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\t\3\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7}\2\2\u00da"+
		"\20\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7c\2\2\u00de"+
		"\u00df\7p\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7n\2\2"+
		"\u00e2\u00e3\7u\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\t\3\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7}\2\2\u00eb\22\3\2\2\2"+
		"\u00ec\u00ed\7k\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7v\2\2\u00f2\24\3\2\2\2\u00f3\u00f4"+
		"\7h\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7i\2\2\u00f7"+
		"\u00f8\7o\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7v\2\2"+
		"\u00fb\26\3\2\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7"+
		"z\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101\30\3\2\2\2\u0102\u0103"+
		"\7r\2\2\u0103\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105\u0106\7u\2\2\u0106"+
		"\u0107\7g\2\2\u0107\u0108\7t\2\2\u0108\32\3\2\2\2\u0109\u010a\7i\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d\7o\2\2\u010d\u010e\7o\2\2"+
		"\u010e\u010f\7c\2\2\u010f\u0110\7t\2\2\u0110\34\3\2\2\2\u0111\u0112\7"+
		"r\2\2\u0112\u0113\7t\2\2\u0113\u0114\7q\2\2\u0114\u0115\7v\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7e\2\2\u0117\u0118\7v\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7f\2\2\u011a\36\3\2\2\2\u011b\u011c\7r\2\2\u011c\u011d\7w\2\2\u011d"+
		"\u011e\7d\2\2\u011e\u011f\7n\2\2\u011f\u0120\7k\2\2\u0120\u0121\7e\2\2"+
		"\u0121 \3\2\2\2\u0122\u0123\7r\2\2\u0123\u0124\7t\2\2\u0124\u0125\7k\2"+
		"\2\u0125\u0126\7x\2\2\u0126\u0127\7c\2\2\u0127\u0128\7v\2\2\u0128\u0129"+
		"\7g\2\2\u0129\"\3\2\2\2\u012a\u012b\7t\2\2\u012b\u012c\7g\2\2\u012c\u012d"+
		"\7v\2\2\u012d\u012e\7w\2\2\u012e\u012f\7t\2\2\u012f\u0130\7p\2\2\u0130"+
		"\u0131\7u\2\2\u0131$\3\2\2\2\u0132\u0133\7n\2\2\u0133\u0134\7q\2\2\u0134"+
		"\u0135\7e\2\2\u0135\u0136\7c\2\2\u0136\u0137\7n\2\2\u0137\u0138\7u\2\2"+
		"\u0138&\3\2\2\2\u0139\u013a\7v\2\2\u013a\u013b\7j\2\2\u013b\u013c\7t\2"+
		"\2\u013c\u013d\7q\2\2\u013d\u013e\7y\2\2\u013e\u013f\7u\2\2\u013f(\3\2"+
		"\2\2\u0140\u0141\7e\2\2\u0141\u0142\7c\2\2\u0142\u0143\7v\2\2\u0143\u0144"+
		"\7e\2\2\u0144\u0145\7j\2\2\u0145*\3\2\2\2\u0146\u0147\7h\2\2\u0147\u0148"+
		"\7k\2\2\u0148\u0149\7p\2\2\u0149\u014a\7c\2\2\u014a\u014b\7n\2\2\u014b"+
		"\u014c\7n\2\2\u014c\u014d\7{\2\2\u014d,\3\2\2\2\u014e\u014f\7o\2\2\u014f"+
		"\u0150\7q\2\2\u0150\u0151\7f\2\2\u0151\u0152\7g\2\2\u0152.\3\2\2\2\u0153"+
		"\u0154\7<\2\2\u0154\60\3\2\2\2\u0155\u0156\7<\2\2\u0156\u0157\7<\2\2\u0157"+
		"\62\3\2\2\2\u0158\u0159\7.\2\2\u0159\64\3\2\2\2\u015a\u015b\7=\2\2\u015b"+
		"\66\3\2\2\2\u015c\u015d\7*\2\2\u015d8\3\2\2\2\u015e\u015f\7+\2\2\u015f"+
		":\3\2\2\2\u0160\u0161\7/\2\2\u0161\u0162\7@\2\2\u0162<\3\2\2\2\u0163\u0164"+
		"\7>\2\2\u0164>\3\2\2\2\u0165\u0166\7@\2\2\u0166@\3\2\2\2\u0167\u0168\7"+
		"?\2\2\u0168B\3\2\2\2\u0169\u016a\7A\2\2\u016aD\3\2\2\2\u016b\u016c\7,"+
		"\2\2\u016cF\3\2\2\2\u016d\u016e\7-\2\2\u016eH\3\2\2\2\u016f\u0170\7-\2"+
		"\2\u0170\u0171\7?\2\2\u0171J\3\2\2\2\u0172\u0173\7~\2\2\u0173L\3\2\2\2"+
		"\u0174\u0175\7&\2\2\u0175N\3\2\2\2\u0176\u0177\7\60\2\2\u0177P\3\2\2\2"+
		"\u0178\u0179\7\60\2\2\u0179\u017a\7\60\2\2\u017aR\3\2\2\2\u017b\u017c"+
		"\7B\2\2\u017cT\3\2\2\2\u017d\u017e\7%\2\2\u017eV\3\2\2\2\u017f\u0180\7"+
		"\u0080\2\2\u0180X\3\2\2\2\u0181\u0182\7\177\2\2\u0182Z\3\2\2\2\u0183\u0187"+
		"\5_/\2\u0184\u0186\5].\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\\\3\2\2\2\u0189\u0187\3\2\2\2"+
		"\u018a\u018d\5_/\2\u018b\u018d\t\4\2\2\u018c\u018a\3\2\2\2\u018c\u018b"+
		"\3\2\2\2\u018d^\3\2\2\2\u018e\u018f\t\5\2\2\u018f`\3\2\2\2\u0190\u0192"+
		"\t\6\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194b\3\2\2\2\u0195\u019a\7)\2\2\u0196\u0199\5g\63\2\u0197"+
		"\u0199\n\7\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\7)\2\2\u019ed\3\2\2\2\u019f\u01a4\7)\2\2\u01a0"+
		"\u01a3\5g\63\2\u01a1\u01a3\n\7\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2"+
		"\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"f\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01ad\7^\2\2\u01a8\u01ae\t\b\2\2\u01a9"+
		"\u01ae\5i\64\2\u01aa\u01ae\5k\65\2\u01ab\u01ae\13\2\2\2\u01ac\u01ae\7"+
		"\2\2\3\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeh\3\2\2\2\u01af\u01b0\7w\2\2\u01b0"+
		"\u01b1\5m\66\2\u01b1\u01b2\5m\66\2\u01b2\u01b3\5m\66\2\u01b3\u01b4\5m"+
		"\66\2\u01b4j\3\2\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7\7}\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01c6\5m\66\2\u01b9\u01c4\5m\66\2\u01ba\u01c2\5m\66\2\u01bb"+
		"\u01c0\5m\66\2\u01bc\u01be\5m\66\2\u01bd\u01bf\5m\66\2\u01be\u01bd\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01ba\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01b9\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c9\7\177\2\2\u01c9l\3\2\2\2\u01ca\u01cb\t\t\2\2\u01cbn\3"+
		"\2\2\2\u01cc\u01ce\t\3\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\b\67"+
		"\2\2\u01d2p\3\2\2\2\u01d3\u01ef\7}\2\2\u01d4\u01ee\5q8\2\u01d5\u01ee\5"+
		"s9\2\u01d6\u01ee\5u:\2\u01d7\u01ee\5w;\2\u01d8\u01d9\7\61\2\2\u01d9\u01da"+
		"\7,\2\2\u01da\u01de\3\2\2\2\u01db\u01dd\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7,\2\2\u01e2\u01ee\7\61\2\2\u01e3"+
		"\u01e4\7\61\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e9\3\2\2\2\u01e6\u01e8\n"+
		"\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\13"+
		"\2\2\2\u01ed\u01d4\3\2\2\2\u01ed\u01d5\3\2\2\2\u01ed\u01d6\3\2\2\2\u01ed"+
		"\u01d7\3\2\2\2\u01ed\u01d8\3\2\2\2\u01ed\u01e3\3\2\2\2\u01ed\u01ec\3\2"+
		"\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f4\t\n\2\2\u01f3\u01f2\3\2"+
		"\2\2\u01f4r\3\2\2\2\u01f5\u01f6\7^\2\2\u01f6\u01f7\13\2\2\2\u01f7t\3\2"+
		"\2\2\u01f8\u01fd\7$\2\2\u01f9\u01fc\5s9\2\u01fa\u01fc\n\13\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7$"+
		"\2\2\u0201v\3\2\2\2\u0202\u0207\7)\2\2\u0203\u0206\5s9\2\u0204\u0206\n"+
		"\f\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020b\7)\2\2\u020bx\3\2\2\2\u020c\u020d\13\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u020f\b<\2\2\u020fz\3\2\2\2\u0210\u0211\7]\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\b=\4\2\u0213\u0214\b=\5\2\u0214|\3\2\2\2\u0215\u0216"+
		"\7^\2\2\u0216\u0217\13\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\b>\4\2\u0219"+
		"~\3\2\2\2\u021a\u0220\7$\2\2\u021b\u021c\7^\2\2\u021c\u021f\13\2\2\2\u021d"+
		"\u021f\n\13\2\2\u021e\u021b\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3"+
		"\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0224\7$\2\2\u0224\u0225\3\2\2\2\u0225\u0226\b?\4"+
		"\2\u0226\u0080\3\2\2\2\u0227\u022b\7)\2\2\u0228\u0229\7^\2\2\u0229\u022c"+
		"\13\2\2\2\u022a\u022c\n\f\2\2\u022b\u0228\3\2\2\2\u022b\u022a\3\2\2\2"+
		"\u022c\u022d\3\2\2\2\u022d\u022e\7)\2\2\u022e\u022f\3\2\2\2\u022f\u0230"+
		"\b@\4\2\u0230\u0082\3\2\2\2\u0231\u0232\7_\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\bA\6\2\u0234\u0084\3\2\2\2\u0235\u0236\7\2\2\3\u0236\u0237\3\2"+
		"\2\2\u0237\u0238\bB\6\2\u0238\u0086\3\2\2\2\u0239\u023a\13\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\bC\4\2\u023c\u0088\3\2\2\2\u023d\u0241\n\r"+
		"\2\2\u023e\u023f\7^\2\2\u023f\u0241\13\2\2\2\u0240\u023d\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\bD\4\2\u0243\u008a\3\2"+
		"\2\2\u0244\u0245\7_\2\2\u0245\u0246\3\2\2\2\u0246\u0247\bE\6\2\u0247\u008c"+
		"\3\2\2\2\u0248\u0249\7\2\2\3\u0249\u024a\3\2\2\2\u024a\u024b\bF\6\2\u024b"+
		"\u008e\3\2\2\2(\2\3\4\u0096\u009c\u00a4\u00aa\u00b4\u00c7\u00d6\u00e7"+
		"\u0187\u018c\u0193\u0198\u019a\u01a2\u01a4\u01ad\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01cf\u01de\u01e9\u01ed\u01ef\u01f3\u01fb\u01fd\u0205\u0207\u021e"+
		"\u0220\u022b\u0240\7\2\3\2\3\5\2\5\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}