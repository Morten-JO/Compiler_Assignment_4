package irclasses;
import ir.IR;

public class IPType extends IR {
	
	private IpV4 ip;

	public IPType(IpV4 ip) {
		
		this.ip = ip;
	}

	public IpV4 getIp() {
		return ip;
	}

	public void setIp(IpV4 ip) {
		this.ip = ip;
	}
}
