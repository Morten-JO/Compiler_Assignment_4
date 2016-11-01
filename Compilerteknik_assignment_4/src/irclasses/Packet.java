package irclasses;

import ir.IR;

public class Packet extends IR {
	
	private Mac address1;
	private Mac address2;
	private IPType type;
	private Length length;
	private IpV4Content content;
	
	public Packet(Mac address1, Mac address2, IPType type, Length length, IpV4Content content) {
		
		this.address1 = address1;
		this.address2 = address2;
		this.type = type;
		this.length = length;
		this.content = content;
	}

	public Mac getAddress1() {
		return address1;
	}

	public void setAddress1(Mac address1) {
		this.address1 = address1;
	}

	public Mac getAddress2() {
		return address2;
	}

	public void setAddress2(Mac address2) {
		this.address2 = address2;
	}

	public IPType getType() {
		return type;
	}

	public void setType(IPType type) {
		this.type = type;
	}

	public Length getLength() {
		return length;
	}

	public void setLength(Length length) {
		this.length = length;
	}

	public IpV4Content getContent() {
		return content;
	}

	public void setContent(IpV4Content content) {
		this.content = content;
	}
	
	

}
