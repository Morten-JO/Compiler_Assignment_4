package recognizer;// Generated from C:\Users\Tobias\network_part2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class network_part2Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, NUMBER=28, MAC=29, BYTE=30, WORD=31, HEX=32, 
		HEXNUMBER=33, FOO=34, WHITESPACE=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ttl'", "'length'", "'PROTO'", "'id'", "'MF'", "'ICMP'", "'offset'", 
		"'tos'", "'IPv4'", "'none'", "'flags'", "'('", "','", "'TCP'", "'.'", 
		"':'", "'['", "']'", "'>'", "'IGMP'", "'DF'", "'proto'", "'e'", "'ethertype'", 
		"')'", "'-'", "'UDP'", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", 
		"FOO", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "DIGIT", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", 
		"FOO", "WHITESPACE"
	};


	public network_part2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "network_part2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2%\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\6\36\u00ba\n\36\r\36\16\36\u00bb"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\6#\u00d8\n#\r#\16#\u00d9\3$\3$\3%"+
		"\3%\3%\3%\2&\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\2\1;\36\1"+
		"=\37\1? \1A!\1C\"\1E#\1G$\1I%\2\3\2\6\3\2\62;\5\2\62;CHch\3\2#\u0080\5"+
		"\2\13\f\17\17\"\"\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5O\3\2\2\2\7V\3\2\2\2\t\\\3\2\2\2"+
		"\13_\3\2\2\2\rb\3\2\2\2\17g\3\2\2\2\21n\3\2\2\2\23r\3\2\2\2\25w\3\2\2"+
		"\2\27|\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u008a"+
		"\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2"+
		")\u0094\3\2\2\2+\u0099\3\2\2\2-\u009c\3\2\2\2/\u00a2\3\2\2\2\61\u00a4"+
		"\3\2\2\2\63\u00ae\3\2\2\2\65\u00b0\3\2\2\2\67\u00b2\3\2\2\29\u00b6\3\2"+
		"\2\2;\u00b9\3\2\2\2=\u00bd\3\2\2\2?\u00c9\3\2\2\2A\u00cc\3\2\2\2C\u00d1"+
		"\3\2\2\2E\u00d3\3\2\2\2G\u00db\3\2\2\2I\u00dd\3\2\2\2KL\7v\2\2LM\7v\2"+
		"\2MN\7n\2\2N\4\3\2\2\2OP\7n\2\2PQ\7g\2\2QR\7p\2\2RS\7i\2\2ST\7v\2\2TU"+
		"\7j\2\2U\6\3\2\2\2VW\7R\2\2WX\7T\2\2XY\7Q\2\2YZ\7V\2\2Z[\7Q\2\2[\b\3\2"+
		"\2\2\\]\7k\2\2]^\7f\2\2^\n\3\2\2\2_`\7O\2\2`a\7H\2\2a\f\3\2\2\2bc\7K\2"+
		"\2cd\7E\2\2de\7O\2\2ef\7R\2\2f\16\3\2\2\2gh\7q\2\2hi\7h\2\2ij\7h\2\2j"+
		"k\7u\2\2kl\7g\2\2lm\7v\2\2m\20\3\2\2\2no\7v\2\2op\7q\2\2pq\7u\2\2q\22"+
		"\3\2\2\2rs\7K\2\2st\7R\2\2tu\7x\2\2uv\7\66\2\2v\24\3\2\2\2wx\7p\2\2xy"+
		"\7q\2\2yz\7p\2\2z{\7g\2\2{\26\3\2\2\2|}\7h\2\2}~\7n\2\2~\177\7c\2\2\177"+
		"\u0080\7i\2\2\u0080\u0081\7u\2\2\u0081\30\3\2\2\2\u0082\u0083\7*\2\2\u0083"+
		"\32\3\2\2\2\u0084\u0085\7.\2\2\u0085\34\3\2\2\2\u0086\u0087\7V\2\2\u0087"+
		"\u0088\7E\2\2\u0088\u0089\7R\2\2\u0089\36\3\2\2\2\u008a\u008b\7\60\2\2"+
		"\u008b \3\2\2\2\u008c\u008d\7<\2\2\u008d\"\3\2\2\2\u008e\u008f\7]\2\2"+
		"\u008f$\3\2\2\2\u0090\u0091\7_\2\2\u0091&\3\2\2\2\u0092\u0093\7@\2\2\u0093"+
		"(\3\2\2\2\u0094\u0095\7K\2\2\u0095\u0096\7I\2\2\u0096\u0097\7O\2\2\u0097"+
		"\u0098\7R\2\2\u0098*\3\2\2\2\u0099\u009a\7F\2\2\u009a\u009b\7H\2\2\u009b"+
		",\3\2\2\2\u009c\u009d\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7q\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\60\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7j\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7{\2\2"+
		"\u00ab\u00ac\7r\2\2\u00ac\u00ad\7g\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7"+
		"+\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\66\3\2\2\2\u00b2\u00b3"+
		"\7W\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7R\2\2\u00b58\3\2\2\2\u00b6\u00b7"+
		"\t\2\2\2\u00b7:\3\2\2\2\u00b8\u00ba\59\35\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc<\3\2\2\2"+
		"\u00bd\u00be\5? \2\u00be\u00bf\7<\2\2\u00bf\u00c0\5? \2\u00c0\u00c1\7"+
		"<\2\2\u00c1\u00c2\5? \2\u00c2\u00c3\7<\2\2\u00c3\u00c4\5? \2\u00c4\u00c5"+
		"\7<\2\2\u00c5\u00c6\5? \2\u00c6\u00c7\7<\2\2\u00c7\u00c8\5? \2\u00c8>"+
		"\3\2\2\2\u00c9\u00ca\5C\"\2\u00ca\u00cb\5C\"\2\u00cb@\3\2\2\2\u00cc\u00cd"+
		"\5C\"\2\u00cd\u00ce\5C\"\2\u00ce\u00cf\5C\"\2\u00cf\u00d0\5C\"\2\u00d0"+
		"B\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7\62\2\2\u00d4"+
		"\u00d5\7z\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5C\"\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00daF"+
		"\3\2\2\2\u00db\u00dc\t\4\2\2\u00dcH\3\2\2\2\u00dd\u00de\t\5\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\b%\2\2\u00e0J\3\2\2\2\5\2\u00bb\u00d9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}