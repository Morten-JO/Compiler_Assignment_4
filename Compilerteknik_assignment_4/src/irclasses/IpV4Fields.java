package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Fields.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Fields extends IR {

	private IpV4Tos tos;
	private IpV4Ttl ttl;
	private IpV4Id id;
	private IpV4Offset offset;
	private IpV4Flags flags;
	private IpV4Proto proto;
	private Length length;
	
	public IpV4Fields(IpV4Tos tos, IpV4Ttl ttl, IpV4Id id, IpV4Offset offset, IpV4Flags flags, IpV4Proto proto,
			Length length) {
		this.tos = tos;
		this.ttl = ttl;
		this.id = id;
		this.offset = offset;
		this.flags = flags;
		this.proto = proto;
		this.length = length;
	}

	public IpV4Tos getTos() {
		return tos;
	}

	public void setTos(IpV4Tos tos) {
		this.tos = tos;
	}

	public IpV4Ttl getTtl() {
		return ttl;
	}

	public void setTtl(IpV4Ttl ttl) {
		this.ttl = ttl;
	}

	public IpV4Id getId() {
		return id;
	}

	public void setId(IpV4Id id) {
		this.id = id;
	}

	public IpV4Offset getOffset() {
		return offset;
	}

	public void setOffset(IpV4Offset offset) {
		this.offset = offset;
	}

	public IpV4Flags getFlags() {
		return flags;
	}

	public void setFlags(IpV4Flags flags) {
		this.flags = flags;
	}

	public IpV4Proto getProto() {
		return proto;
	}

	public void setProto(IpV4Proto proto) {
		this.proto = proto;
	}

	public Length getLength() {
		return length;
	}

	public void setLength(Length length) {
		this.length = length;
	}
}