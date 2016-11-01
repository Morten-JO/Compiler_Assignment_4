package recognizer;
// Generated from C:\Users\Tobias\network_part2.g4 by ANTLR 4.1
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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, NUMBER=27, MAC=28, BYTE=29, WORD=30, HEX=31, HEXNUMBER=32, 
		IPV4ADR=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ttl'", "'length'", "'PROTO'", "'id'", "'MF'", "'ICMP'", "'offset'", 
		"'tos'", "'IPv4'", "'flags'", "'('", "','", "'TCP'", "'.'", "'NONE'", 
		"':'", "'['", "']'", "'>'", "'IGMP'", "'DF'", "'e'", "'ethertype'", "')'", 
		"'-'", "'UDP'", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", "IPV4ADR"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "DIGIT", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", 
		"IPV4ADR"
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u00db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\6\35\u00b0\n\35\r\35\16\35\u00b1\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3\"\6\"\u00ce\n\"\r\"\16\"\u00cf\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\2$\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\2\19\35\1;\36\1=\37\1? \1A!"+
		"\1C\"\1E#\1\3\2\4\3\2\62;\5\2\62;CHch\u00db\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7R\3\2\2\2\tX\3\2\2\2\13"+
		"[\3\2\2\2\r^\3\2\2\2\17c\3\2\2\2\21j\3\2\2\2\23n\3\2\2\2\25s\3\2\2\2\27"+
		"y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0088"+
		"\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2"+
		"+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61\u00a4\3\2\2\2\63\u00a6"+
		"\3\2\2\2\65\u00a8\3\2\2\2\67\u00ac\3\2\2\29\u00af\3\2\2\2;\u00b3\3\2\2"+
		"\2=\u00bf\3\2\2\2?\u00c2\3\2\2\2A\u00c7\3\2\2\2C\u00c9\3\2\2\2E\u00d1"+
		"\3\2\2\2GH\7v\2\2HI\7v\2\2IJ\7n\2\2J\4\3\2\2\2KL\7n\2\2LM\7g\2\2MN\7p"+
		"\2\2NO\7i\2\2OP\7v\2\2PQ\7j\2\2Q\6\3\2\2\2RS\7R\2\2ST\7T\2\2TU\7Q\2\2"+
		"UV\7V\2\2VW\7Q\2\2W\b\3\2\2\2XY\7k\2\2YZ\7f\2\2Z\n\3\2\2\2[\\\7O\2\2\\"+
		"]\7H\2\2]\f\3\2\2\2^_\7K\2\2_`\7E\2\2`a\7O\2\2ab\7R\2\2b\16\3\2\2\2cd"+
		"\7q\2\2de\7h\2\2ef\7h\2\2fg\7u\2\2gh\7g\2\2hi\7v\2\2i\20\3\2\2\2jk\7v"+
		"\2\2kl\7q\2\2lm\7u\2\2m\22\3\2\2\2no\7K\2\2op\7R\2\2pq\7x\2\2qr\7\66\2"+
		"\2r\24\3\2\2\2st\7h\2\2tu\7n\2\2uv\7c\2\2vw\7i\2\2wx\7u\2\2x\26\3\2\2"+
		"\2yz\7*\2\2z\30\3\2\2\2{|\7.\2\2|\32\3\2\2\2}~\7V\2\2~\177\7E\2\2\177"+
		"\u0080\7R\2\2\u0080\34\3\2\2\2\u0081\u0082\7\60\2\2\u0082\36\3\2\2\2\u0083"+
		"\u0084\7P\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7P\2\2\u0086\u0087\7G\2\2"+
		"\u0087 \3\2\2\2\u0088\u0089\7<\2\2\u0089\"\3\2\2\2\u008a\u008b\7]\2\2"+
		"\u008b$\3\2\2\2\u008c\u008d\7_\2\2\u008d&\3\2\2\2\u008e\u008f\7@\2\2\u008f"+
		"(\3\2\2\2\u0090\u0091\7K\2\2\u0091\u0092\7I\2\2\u0092\u0093\7O\2\2\u0093"+
		"\u0094\7R\2\2\u0094*\3\2\2\2\u0095\u0096\7F\2\2\u0096\u0097\7H\2\2\u0097"+
		",\3\2\2\2\u0098\u0099\7g\2\2\u0099.\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7{\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\60\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7/\2"+
		"\2\u00a7\64\3\2\2\2\u00a8\u00a9\7W\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ab"+
		"\7R\2\2\u00ab\66\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad8\3\2\2\2\u00ae\u00b0"+
		"\5\67\34\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2:\3\2\2\2\u00b3\u00b4\5=\37\2\u00b4\u00b5\7"+
		"<\2\2\u00b5\u00b6\5=\37\2\u00b6\u00b7\7<\2\2\u00b7\u00b8\5=\37\2\u00b8"+
		"\u00b9\7<\2\2\u00b9\u00ba\5=\37\2\u00ba\u00bb\7<\2\2\u00bb\u00bc\5=\37"+
		"\2\u00bc\u00bd\7<\2\2\u00bd\u00be\5=\37\2\u00be<\3\2\2\2\u00bf\u00c0\5"+
		"A!\2\u00c0\u00c1\5A!\2\u00c1>\3\2\2\2\u00c2\u00c3\5A!\2\u00c3\u00c4\5"+
		"A!\2\u00c4\u00c5\5A!\2\u00c5\u00c6\5A!\2\u00c6@\3\2\2\2\u00c7\u00c8\t"+
		"\3\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7\62\2\2\u00ca\u00cb\7z\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ce\5A!\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0D\3\2\2\2\u00d1\u00d2\59\35\2"+
		"\u00d2\u00d3\7\60\2\2\u00d3\u00d4\59\35\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6"+
		"\59\35\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\59\35\2\u00d8\u00d9\7\60\2\2"+
		"\u00d9\u00da\59\35\2\u00daF\3\2\2\2\5\2\u00b1\u00cf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}