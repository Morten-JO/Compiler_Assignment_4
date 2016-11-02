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

public interface IRElementVisitor<T> {

	public T visitIR(IR e);
	public T visitEntries(Entries e);
	public T visitEntry(Entry e);
	public T visitPacket(Packet e);
	public T visitDate(Date e);
	public T visitTime(Time e);
	public T visitMac(Mac e);
	public T visitIPType(IPType e);
	public T visitLength(Length e);
	public T visitIpV4Content(IpV4Content e);
	public T visitIpV4(IpV4 e);
	public T visitTag(Tag e);
	public T visitIpV4Fields(IpV4Fields e);
	public T visitIPV4ADR(IPV4ADR e);
	public T visitProtinfo(Protinfo e);
	public T visitDumpline(Dumpline e);
	public T visitProtname(Protname e);
	public T visitHexnumber(HexNumber e);
	public T visitIpV4Tos(IpV4Tos e);
	public T visitIpV4Ttl(IpV4Ttl e);
	public T visitIpV4Id(IpV4Id e);
	public T visitIpV4Offset(IpV4Offset e);
	public T visitIpV4Flags(IpV4Flags e);
	public T visitIpV4Proto(IpV4Proto e);
	public T visitFlagValues(Flagvalues e);
}
