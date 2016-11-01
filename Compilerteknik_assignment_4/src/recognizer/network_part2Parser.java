package recognizer;// Generated from C:\Users\Tobias\network_part2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class network_part2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, NUMBER=28, MAC=29, BYTE=30, WORD=31, HEX=32, 
		HEXNUMBER=33, FOO=34, WHITESPACE=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'ttl'", "'length'", "'PROTO'", "'id'", "'MF'", "'ICMP'", 
		"'offset'", "'tos'", "'IPv4'", "'none'", "'flags'", "'('", "','", "'TCP'", 
		"'.'", "':'", "'['", "']'", "'>'", "'IGMP'", "'DF'", "'proto'", "'e'", 
		"'ethertype'", "')'", "'-'", "'UDP'", "NUMBER", "MAC", "BYTE", "WORD", 
		"HEX", "HEXNUMBER", "FOO", "WHITESPACE"
	};
	public static final int
		RULE_entries = 0, RULE_entry = 1, RULE_date = 2, RULE_time = 3, RULE_packet = 4, 
		RULE_mac = 5, RULE_type = 6, RULE_ipv4 = 7, RULE_tag = 8, RULE_length = 9, 
		RULE_ipv4content = 10, RULE_ipv4fields = 11, RULE_ipv4adr = 12, RULE_ipv4tos = 13, 
		RULE_ipv4ttl = 14, RULE_ipv4id = 15, RULE_ipv4offset = 16, RULE_ipv4flags = 17, 
		RULE_flagvalues = 18, RULE_ipv4proto = 19, RULE_protname = 20, RULE_protinfo = 21, 
		RULE_dumpline = 22;
	public static final String[] ruleNames = {
		"entries", "entry", "date", "time", "packet", "mac", "type", "ipv4", "tag", 
		"length", "ipv4content", "ipv4fields", "ipv4adr", "ipv4tos", "ipv4ttl", 
		"ipv4id", "ipv4offset", "ipv4flags", "flagvalues", "ipv4proto", "protname", 
		"protinfo", "dumpline"
	};

	@Override
	public String getGrammarFileName() { return "network_part2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public network_part2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntriesContext extends ParserRuleContext {
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntriesContext entries() throws RecognitionException {
		EntriesContext _localctx = new EntriesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(46); entry();
				}
				}
				setState(51);
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

	public static class EntryContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PacketContext packet() {
			return getRuleContext(PacketContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); date();
			setState(53); time();
			setState(54); packet();
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(network_part2Parser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(network_part2Parser.NUMBER); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(NUMBER);
			setState(57); match(26);
			setState(58); match(NUMBER);
			setState(59); match(26);
			setState(60); match(NUMBER);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(network_part2Parser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(network_part2Parser.NUMBER); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(NUMBER);
			setState(63); match(16);
			setState(64); match(NUMBER);
			setState(65); match(16);
			setState(66); match(NUMBER);
			setState(67); match(15);
			setState(68); match(NUMBER);
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

	public static class PacketContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<MacContext> mac() {
			return getRuleContexts(MacContext.class);
		}
		public MacContext mac(int i) {
			return getRuleContext(MacContext.class,i);
		}
		public Ipv4contentContext ipv4content() {
			return getRuleContext(Ipv4contentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PacketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterPacket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitPacket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitPacket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacketContext packet() throws RecognitionException {
		PacketContext _localctx = new PacketContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); mac();
			setState(71); match(19);
			setState(72); mac();
			setState(73); match(13);
			setState(74); match(24);
			setState(75); type();
			setState(76); match(13);
			setState(77); length();
			setState(78); match(16);
			setState(79); ipv4content();
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

	public static class MacContext extends ParserRuleContext {
		public TerminalNode MAC() { return getToken(network_part2Parser.MAC, 0); }
		public MacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterMac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitMac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitMac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacContext mac() throws RecognitionException {
		MacContext _localctx = new MacContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(MAC);
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

	public static class TypeContext extends ParserRuleContext {
		public Ipv4Context ipv4() {
			return getRuleContext(Ipv4Context.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); ipv4();
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

	public static class Ipv4Context extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public Ipv4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4Context ipv4() throws RecognitionException {
		Ipv4Context _localctx = new Ipv4Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_ipv4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(9);
			setState(86); tag();
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode HEXNUMBER() { return getToken(network_part2Parser.HEXNUMBER, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(12);
			setState(89); match(HEXNUMBER);
			setState(90); match(25);
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(network_part2Parser.NUMBER, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(2);
			setState(93); match(NUMBER);
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

	public static class Ipv4contentContext extends ParserRuleContext {
		public DumplineContext dumpline(int i) {
			return getRuleContext(DumplineContext.class,i);
		}
		public Ipv4adrContext ipv4adr(int i) {
			return getRuleContext(Ipv4adrContext.class,i);
		}
		public List<Ipv4adrContext> ipv4adr() {
			return getRuleContexts(Ipv4adrContext.class);
		}
		public ProtinfoContext protinfo() {
			return getRuleContext(ProtinfoContext.class,0);
		}
		public Ipv4fieldsContext ipv4fields() {
			return getRuleContext(Ipv4fieldsContext.class,0);
		}
		public List<DumplineContext> dumpline() {
			return getRuleContexts(DumplineContext.class);
		}
		public Ipv4contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4contentContext ipv4content() throws RecognitionException {
		Ipv4contentContext _localctx = new Ipv4contentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ipv4content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); ipv4fields();
			setState(96); ipv4adr();
			setState(97); match(19);
			setState(98); ipv4adr();
			setState(99); match(16);
			setState(100); protinfo();
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101); dumpline();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEXNUMBER );
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

	public static class Ipv4fieldsContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Ipv4tosContext ipv4tos() {
			return getRuleContext(Ipv4tosContext.class,0);
		}
		public Ipv4offsetContext ipv4offset() {
			return getRuleContext(Ipv4offsetContext.class,0);
		}
		public Ipv4ttlContext ipv4ttl() {
			return getRuleContext(Ipv4ttlContext.class,0);
		}
		public Ipv4flagsContext ipv4flags() {
			return getRuleContext(Ipv4flagsContext.class,0);
		}
		public Ipv4idContext ipv4id() {
			return getRuleContext(Ipv4idContext.class,0);
		}
		public Ipv4protoContext ipv4proto() {
			return getRuleContext(Ipv4protoContext.class,0);
		}
		public Ipv4fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4fieldsContext ipv4fields() throws RecognitionException {
		Ipv4fieldsContext _localctx = new Ipv4fieldsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ipv4fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(12);
			setState(107); ipv4tos();
			setState(108); match(13);
			setState(109); ipv4ttl();
			setState(110); match(13);
			setState(111); ipv4id();
			setState(112); match(13);
			setState(113); ipv4offset();
			setState(114); match(13);
			setState(115); ipv4flags();
			setState(116); match(13);
			setState(117); ipv4proto();
			setState(118); match(13);
			setState(119); length();
			setState(120); match(25);
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

	public static class Ipv4adrContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(network_part2Parser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(network_part2Parser.NUMBER); }
		public Ipv4adrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4adr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4adr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4adr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4adr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4adrContext ipv4adr() throws RecognitionException {
		Ipv4adrContext _localctx = new Ipv4adrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ipv4adr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(NUMBER);
			setState(123); match(15);
			setState(124); match(NUMBER);
			setState(125); match(15);
			setState(126); match(NUMBER);
			setState(127); match(15);
			setState(128); match(NUMBER);
			setState(129); match(15);
			setState(130); match(NUMBER);
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

	public static class Ipv4tosContext extends ParserRuleContext {
		public TerminalNode HEXNUMBER() { return getToken(network_part2Parser.HEXNUMBER, 0); }
		public Ipv4tosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4tos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4tos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4tos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4tos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4tosContext ipv4tos() throws RecognitionException {
		Ipv4tosContext _localctx = new Ipv4tosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ipv4tos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(8);
			setState(133); match(HEXNUMBER);
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

	public static class Ipv4ttlContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(network_part2Parser.NUMBER, 0); }
		public Ipv4ttlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4ttl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4ttl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4ttl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4ttl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4ttlContext ipv4ttl() throws RecognitionException {
		Ipv4ttlContext _localctx = new Ipv4ttlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ipv4ttl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(1);
			setState(136); match(NUMBER);
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

	public static class Ipv4idContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(network_part2Parser.NUMBER, 0); }
		public Ipv4idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4idContext ipv4id() throws RecognitionException {
		Ipv4idContext _localctx = new Ipv4idContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ipv4id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(4);
			setState(139); match(NUMBER);
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

	public static class Ipv4offsetContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(network_part2Parser.NUMBER, 0); }
		public Ipv4offsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4offset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4offset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4offset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4offsetContext ipv4offset() throws RecognitionException {
		Ipv4offsetContext _localctx = new Ipv4offsetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ipv4offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(7);
			setState(142); match(NUMBER);
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

	public static class Ipv4flagsContext extends ParserRuleContext {
		public FlagvaluesContext flagvalues() {
			return getRuleContext(FlagvaluesContext.class,0);
		}
		public Ipv4flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4flagsContext ipv4flags() throws RecognitionException {
		Ipv4flagsContext _localctx = new Ipv4flagsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ipv4flags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(11);
			setState(145); match(17);
			setState(146); flagvalues();
			setState(147); match(18);
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

	public static class FlagvaluesContext extends ParserRuleContext {
		public FlagvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterFlagvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitFlagvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitFlagvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagvaluesContext flagvalues() throws RecognitionException {
		FlagvaluesContext _localctx = new FlagvaluesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_flagvalues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 10) | (1L << 21) | (1L << 23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Ipv4protoContext extends ParserRuleContext {
		public ProtnameContext protname() {
			return getRuleContext(ProtnameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(network_part2Parser.NUMBER, 0); }
		public Ipv4protoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterIpv4proto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitIpv4proto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitIpv4proto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4protoContext ipv4proto() throws RecognitionException {
		Ipv4protoContext _localctx = new Ipv4protoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ipv4proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(22);
			setState(152); protname();
			setState(153); match(12);
			setState(154); match(NUMBER);
			setState(155); match(25);
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

	public static class ProtnameContext extends ParserRuleContext {
		public ProtnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterProtname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitProtname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitProtname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtnameContext protname() throws RecognitionException {
		ProtnameContext _localctx = new ProtnameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_protname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 14) | (1L << 20) | (1L << 27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ProtinfoContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public ProtnameContext protname() {
			return getRuleContext(ProtnameContext.class,0);
		}
		public ProtinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterProtinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitProtinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitProtinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtinfoContext protinfo() throws RecognitionException {
		ProtinfoContext _localctx = new ProtinfoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_protinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); protname();
			setState(160); match(13);
			setState(161); length();
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

	public static class DumplineContext extends ParserRuleContext {
		public TerminalNode HEXNUMBER() { return getToken(network_part2Parser.HEXNUMBER, 0); }
		public DumplineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dumpline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).enterDumpline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof network_part2Listener ) ((network_part2Listener)listener).exitDumpline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof network_part2Visitor ) return ((network_part2Visitor<? extends T>)visitor).visitDumpline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DumplineContext dumpline() throws RecognitionException {
		DumplineContext _localctx = new DumplineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dumpline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(HEXNUMBER);
			setState(164); match(16);
			setState(166); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(165);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3%\u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\6\fi\n\f\r\f\16\fj\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\6\30\u00a9\n\30\r\30\16\30\u00aa"+
		"\3\30\3\u00aa\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\4\6"+
		"\2\7\7\f\f\27\27\31\31\7\2\5\5\b\b\20\20\26\26\35\35\u0098\2\63\3\2\2"+
		"\2\4\66\3\2\2\2\6:\3\2\2\2\b@\3\2\2\2\nH\3\2\2\2\fS\3\2\2\2\16U\3\2\2"+
		"\2\20W\3\2\2\2\22Z\3\2\2\2\24^\3\2\2\2\26a\3\2\2\2\30l\3\2\2\2\32|\3\2"+
		"\2\2\34\u0086\3\2\2\2\36\u0089\3\2\2\2 \u008c\3\2\2\2\"\u008f\3\2\2\2"+
		"$\u0092\3\2\2\2&\u0097\3\2\2\2(\u0099\3\2\2\2*\u009f\3\2\2\2,\u00a1\3"+
		"\2\2\2.\u00a5\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\5\6\4\2\678\5"+
		"\b\5\289\5\n\6\29\5\3\2\2\2:;\7\36\2\2;<\7\34\2\2<=\7\36\2\2=>\7\34\2"+
		"\2>?\7\36\2\2?\7\3\2\2\2@A\7\36\2\2AB\7\22\2\2BC\7\36\2\2CD\7\22\2\2D"+
		"E\7\36\2\2EF\7\21\2\2FG\7\36\2\2G\t\3\2\2\2HI\5\f\7\2IJ\7\25\2\2JK\5\f"+
		"\7\2KL\7\17\2\2LM\7\32\2\2MN\5\16\b\2NO\7\17\2\2OP\5\24\13\2PQ\7\22\2"+
		"\2QR\5\26\f\2R\13\3\2\2\2ST\7\37\2\2T\r\3\2\2\2UV\5\20\t\2V\17\3\2\2\2"+
		"WX\7\13\2\2XY\5\22\n\2Y\21\3\2\2\2Z[\7\16\2\2[\\\7#\2\2\\]\7\33\2\2]\23"+
		"\3\2\2\2^_\7\4\2\2_`\7\36\2\2`\25\3\2\2\2ab\5\30\r\2bc\5\32\16\2cd\7\25"+
		"\2\2de\5\32\16\2ef\7\22\2\2fh\5,\27\2gi\5.\30\2hg\3\2\2\2ij\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2k\27\3\2\2\2lm\7\16\2\2mn\5\34\17\2no\7\17\2\2op\5\36"+
		"\20\2pq\7\17\2\2qr\5 \21\2rs\7\17\2\2st\5\"\22\2tu\7\17\2\2uv\5$\23\2"+
		"vw\7\17\2\2wx\5(\25\2xy\7\17\2\2yz\5\24\13\2z{\7\33\2\2{\31\3\2\2\2|}"+
		"\7\36\2\2}~\7\21\2\2~\177\7\36\2\2\177\u0080\7\21\2\2\u0080\u0081\7\36"+
		"\2\2\u0081\u0082\7\21\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7\21\2\2\u0084"+
		"\u0085\7\36\2\2\u0085\33\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088\7#\2"+
		"\2\u0088\35\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b\7\36\2\2\u008b\37"+
		"\3\2\2\2\u008c\u008d\7\6\2\2\u008d\u008e\7\36\2\2\u008e!\3\2\2\2\u008f"+
		"\u0090\7\t\2\2\u0090\u0091\7\36\2\2\u0091#\3\2\2\2\u0092\u0093\7\r\2\2"+
		"\u0093\u0094\7\23\2\2\u0094\u0095\5&\24\2\u0095\u0096\7\24\2\2\u0096%"+
		"\3\2\2\2\u0097\u0098\t\2\2\2\u0098\'\3\2\2\2\u0099\u009a\7\30\2\2\u009a"+
		"\u009b\5*\26\2\u009b\u009c\7\16\2\2\u009c\u009d\7\36\2\2\u009d\u009e\7"+
		"\33\2\2\u009e)\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0+\3\2\2\2\u00a1\u00a2"+
		"\5*\26\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\5\24\13\2\u00a4-\3\2\2\2\u00a5"+
		"\u00a6\7#\2\2\u00a6\u00a8\7\22\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"/\3\2\2\2\5\63j\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}