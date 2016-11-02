package ir;

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

public class PrettyPrinter implements IRElementVisitor<Integer>{

	
	public void println(String e){
		System.out.println(e);
	}
	
	public void print(String e){
		System.out.print(e);
	}
	
	
	public static void print(IR ir){
		new PrettyPrinter().visitIR(ir);
	}

	@Override
	public Integer visitIR(IR e) {
		visitEntries(e.getEntries());
		return null;
	}
	
	@Override
	public Integer visitEntries(Entries e) {
		for(Entry ent : e.getAllEntries()){
			println("----------------------------------------------------");
			visitEntry(ent);
		}
		return null;
	}

	@Override
	public Integer visitEntry(Entry e) {
		visitDate(e.getDate());
		visitTime(e.getTime());
		visitPacket(e.getPacket());
		return null;
	}

	@Override
	public Integer visitPacket(Packet e) {
		print("Senders ");
		visitMac(e.getAddress1());
		print("Receivers ");
		visitMac(e.getAddress2());
		visitIPType(e.getType());
		visitLength(e.getLength());
		visitIpV4Content(e.getContent());
		return null;
	}

	@Override
	public Integer visitDate(Date e) {
		println("Date: " + e.getDay() + "-" + e.getMonth() + "-" + e.getYear());
		return null;
	}

	@Override
	public Integer visitTime(Time e) {
		println("Time: " + e.getHour() + ":" + e.getMinute() + ":" + e.getSecond() +"." +e.getMillisecond());
		return null;
	}

	@Override
	public Integer visitMac(Mac e) {
		println("Mac adress: " + e.getMacAddress());
		return null;
	}

	@Override
	public Integer visitIPType(IPType e) {
		visitIpV4(e.getIp());
		return null;
	}

	@Override
	public Integer visitLength(Length e) {
		println("Data length: " + e.getLength());
		return null;
	}

	@Override
	public Integer visitIpV4Content(IpV4Content e) {
		visitIpV4Fields(e.getFields());
		print("Senders ");
		visitIPV4ADR(e.getAddress());
		print("Receivers ");
		visitIPV4ADR(e.getSecondAddress());
		visitProtinfo(e.getProt());
		for(int i = 0; i < e.getDumpline().size(); i++){
			visitDumpline(e.getDumpline().get(i));
		}
		return null;
	}

	@Override
	public Integer visitIpV4(IpV4 e) {
		print("IPType: "+e.getIpDescription());
		visitTag(e.getTag());
		return null;
	}
	
	@Override
	public Integer visitTag(Tag e) {
		print(" with tag: ");
		visitHexnumber(e.getHex());
		return null;
	}
	
	@Override
	public Integer visitHexnumber(HexNumber e) {
		println(e.getHex());
		return null;
	}

	@Override
	public Integer visitIpV4Fields(IpV4Fields e) {
		visitIpV4Tos(e.getTos());
		visitIpV4Ttl(e.getTtl());
		visitIpV4Id(e.getId());
		visitIpV4Offset(e.getOffset());
		visitIpV4Flags(e.getFlags());
		visitIpV4Proto(e.getProto());
		visitLength(e.getLength());
		return null;
	}

	@Override
	public Integer visitIPV4ADR(IPV4ADR e) {
		println("IP: "+e.getOne()+"."+e.getTwo()+"."+e.getThree()+"."+e.getFour()+":"+e.getFive());
		return null;
	}

	@Override
	public Integer visitProtinfo(Protinfo e) {
		visitProtname(e.getName());
		visitLength(e.getLength());
		return null;
	}

	@Override
	public Integer visitDumpline(Dumpline e) {
		print("Dump line: ");
		for(int i = 0; i < e.getStrings().size(); i++){
			print(e.getStrings().get(i)+" ");
		}
		println("");
		return null;
	}

	@Override
	public Integer visitProtname(Protname e) {
		print("Protocol: ");
		println(e.getProtocol());
		return null;
	}

	@Override
	public Integer visitIpV4Tos(IpV4Tos e) {
		print("Type of service: ");
		visitHexnumber(e.getNumber());
		return null;
	}

	@Override
	public Integer visitIpV4Ttl(IpV4Ttl e) {
		println("Time to live: "+e.getTtl());
		return null;
	}

	@Override
	public Integer visitIpV4Id(IpV4Id e) {
		println("Id: "+e.getId());
		return null;
	}

	@Override
	public Integer visitIpV4Offset(IpV4Offset e) {
		println("Offset: "+e.getOffset());
		return null;
	}
	
	@Override
	public Integer visitIpV4Flags(IpV4Flags e) {
		print("Flags: [");
		visitFlagValues(e.getValues());
		println("]");
		return null;
	}

	@Override
	public Integer visitFlagValues(Flagvalues e) {
		print(e.getValue());
		return null;
	}

	@Override
	public Integer visitIpV4Proto(IpV4Proto e) {
		visitProtname(e.getName());
		println("Protocol number: "+e.getNumber());
		return null;
	}
}
