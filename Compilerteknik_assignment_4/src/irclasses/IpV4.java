package irclasses;

import ir.IR;

public class IpV4 extends IR {
	
	
	private final String ipDescription = "IPv4";
	private Tag tag;

	public IpV4(Tag tag) {
		
		this.tag = tag;
	}

	public String getIpDescription() {
		return ipDescription;
	}



	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

}
