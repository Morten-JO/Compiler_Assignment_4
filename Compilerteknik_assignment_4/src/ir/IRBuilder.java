package ir;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import irclasses.Date;
import irclasses.Dumpline;
import irclasses.Entries;
import irclasses.Entry;
import irclasses.Flagvalues;
import irclasses.HexNumber;
import irclasses.IPType;
import irclasses.IPV4ADR;
import irclasses.IpV4;
import irclasses.IpV4Content;
import irclasses.IpV4Fields;
import irclasses.IpV4Flags;
import irclasses.IpV4Id;
import irclasses.IpV4Offset;
import irclasses.IpV4Proto;
import irclasses.IpV4Tos;
import irclasses.IpV4Ttl;
import irclasses.Length;
import irclasses.Mac;
import irclasses.Packet;
import irclasses.Protinfo;
import irclasses.Protname;
import irclasses.Tag;
import irclasses.Time;
import recognizer.network_part2Parser.DateContext;
import recognizer.network_part2Parser.DumplineContext;
import recognizer.network_part2Parser.EntriesContext;
import recognizer.network_part2Parser.EntryContext;
import recognizer.network_part2Parser.FlagvaluesContext;
import recognizer.network_part2Parser.Ipv4Context;
import recognizer.network_part2Parser.Ipv4adrContext;
import recognizer.network_part2Parser.Ipv4contentContext;
import recognizer.network_part2Parser.Ipv4fieldsContext;
import recognizer.network_part2Parser.Ipv4flagsContext;
import recognizer.network_part2Parser.Ipv4idContext;
import recognizer.network_part2Parser.Ipv4offsetContext;
import recognizer.network_part2Parser.Ipv4protoContext;
import recognizer.network_part2Parser.Ipv4tosContext;
import recognizer.network_part2Parser.Ipv4ttlContext;
import recognizer.network_part2Parser.LengthContext;
import recognizer.network_part2Parser.MacContext;
import recognizer.network_part2Parser.PacketContext;
import recognizer.network_part2Parser.ProtinfoContext;
import recognizer.network_part2Parser.ProtnameContext;
import recognizer.network_part2Parser.TagContext;
import recognizer.network_part2Parser.TimeContext;
import recognizer.network_part2Parser.TypeContext;
import recognizer.network_part2Visitor;

public class IRBuilder extends AbstractParseTreeVisitor<IR> implements network_part2Visitor<IR> {

	public Date visitDate(DateContext ctx) {
		
		return new Date(Integer.parseInt(ctx.NUMBER().get(0).getText()),
			Integer.parseInt(ctx.NUMBER().get(1).getText()),Integer.parseInt(ctx.NUMBER().get(2).getText()));
	}

	@Override
	public IpV4Ttl visitIpv4ttl(Ipv4ttlContext ctx) {
		
		return new IpV4Ttl(Integer.parseInt(ctx.NUMBER().getText()));
	}

	@Override
	public IpV4Flags visitIpv4flags(Ipv4flagsContext ctx) {

		return new IpV4Flags(visitFlagvalues(ctx.flagvalues()));
	}

	@Override
	public Dumpline visitDumpline(DumplineContext ctx) {
		
		List<String> strings = new ArrayList<String>();
		
		for(int i = 0 ; i < ctx.getChildCount(); i++){
			strings.add(ctx.children.get(i).getText());
		}
		return new Dumpline(strings);
	}

	@Override
	public Length visitLength(LengthContext ctx) {
		
		return new Length(Integer.parseInt(ctx.NUMBER().getText()));
	}

	@Override
	public Packet visitPacket(PacketContext ctx) {
		
		return new Packet(visitMac(ctx.mac(0)), visitMac(ctx.mac(1)), visitType(ctx.type()), visitLength(ctx.length()),
				visitIpv4content(ctx.ipv4content()));
	}

	@Override
	public IPType visitType(TypeContext ctx) {
		
		return new IPType(visitIpv4(ctx.ipv4()));
	}

	@Override
	public IpV4Id visitIpv4id(Ipv4idContext ctx) {
		
		return new IpV4Id(Integer.parseInt(ctx.NUMBER().getText()));
	}

	@Override
	public Mac visitMac(MacContext ctx) {
		return new Mac(ctx.MAC().getText()); 
	}

	@Override
	public IpV4Offset visitIpv4offset(Ipv4offsetContext ctx) {
		
		return new IpV4Offset(Integer.parseInt(ctx.NUMBER().getText()));
	}

	@Override
	public Entry visitEntry(EntryContext ctx) {
		
		return new Entry(visitDate(ctx.date()), visitTime(ctx.time()), visitPacket(ctx.packet()));
	}

	@Override
	public Entries visitEntries(EntriesContext ctx) {
		
		LinkedList<Entry> entries = new LinkedList<>();
		
		for (int i = 0; i < ctx.entry().size(); i++) {
			entries.add(visitEntry(ctx.entry(i)));
		}
		
		return new Entries(entries);
	}

	@Override
	public Protinfo visitProtinfo(ProtinfoContext ctx) {
		
		
		return new Protinfo(visitProtname(ctx.protname()), visitLength(ctx.length()));
	}

	@Override
	public IpV4Proto visitIpv4proto(Ipv4protoContext ctx) {
		
		return new IpV4Proto(visitProtname(ctx.protname()), Integer.parseInt(ctx.NUMBER().getText()));
	}

	@Override
	public IpV4 visitIpv4(Ipv4Context ctx) {
		
		return new IpV4(visitTag(ctx.tag()));
	}

	@Override
	public Flagvalues visitFlagvalues(FlagvaluesContext ctx) {
		
		return new Flagvalues(ctx.getText());
	}

	@Override
	public IpV4Tos visitIpv4tos(Ipv4tosContext ctx) {
	
		return new IpV4Tos(new HexNumber(ctx.HEXNUMBER().getText()));
	}

	@Override
	public Protname visitProtname(ProtnameContext ctx) {
		
		return new Protname(ctx.getText());
	}

	@Override
	public IpV4Content visitIpv4content(Ipv4contentContext ctx) {
		IpV4Fields fields = visitIpv4fields(ctx.ipv4fields());
		IPV4ADR adrOne = visitIpv4adr(ctx.ipv4adr(0));
		IPV4ADR adrTwo = visitIpv4adr(ctx.ipv4adr(1));
		Protinfo protinfo = visitProtinfo(ctx.protinfo());
		List<Dumpline> lines = new ArrayList<Dumpline>();
		for(int i = 0; i < ctx.dumpline().size(); i++){
			lines.add(visitDumpline(ctx.dumpline(i)));
		}
		
		return new IpV4Content(fields, adrOne, adrTwo, protinfo, lines);
	}

	@Override
	public IpV4Fields visitIpv4fields(Ipv4fieldsContext ctx) {
		
		return new IpV4Fields(visitIpv4tos(ctx.ipv4tos()), visitIpv4ttl(ctx.ipv4ttl()),
				visitIpv4id(ctx.ipv4id()), visitIpv4offset(ctx.ipv4offset()), visitIpv4flags(ctx.ipv4flags()),
				visitIpv4proto(ctx.ipv4proto()), visitLength(ctx.length()));
	}

	@Override
	public Time visitTime(TimeContext ctx) {
		return new Time(Integer.parseInt(ctx.NUMBER().get(0).getText()),
			Integer.parseInt(ctx.NUMBER().get(1).getText()),
			Integer.parseInt(ctx.NUMBER().get(2).getText()),Integer.parseInt(ctx.NUMBER().get(3).getText()));
	}

	@Override
	public Tag visitTag(TagContext ctx) {
		
		return new Tag(new HexNumber(ctx.HEXNUMBER().getText()));
	}

	@Override
	public IPV4ADR visitIpv4adr(Ipv4adrContext ctx) {
		// TODO Auto-generated method stub
		return new IPV4ADR(Integer.parseInt(ctx.NUMBER(0).getText()),
				Integer.parseInt(ctx.NUMBER(1).getText()),
				Integer.parseInt(ctx.NUMBER(2).getText()),
				Integer.parseInt(ctx.NUMBER(3).getText()),
				Integer.parseInt(ctx.NUMBER(4).getText()));
	}

}
