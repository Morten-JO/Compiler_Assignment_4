package ir;

import irclasses.IPV4ADR;
import irclasses.Mac;

public class ChangedUser extends User{

	private Mac changedMac;
	private IPV4ADR changedIP;
	
	public ChangedUser(Mac mac, IPV4ADR ip, Mac mac2, IPV4ADR ip2){
		super(mac, ip);
		this.changedIP = ip2;
		this.changedMac = mac2;
	}
	
	public Mac getChangedMac(){
		return changedMac;
	}
	
	public IPV4ADR getChangedIP(){
		return changedIP;
	}
	
	public void setChangedMac(Mac mac){
		this.changedMac = mac;
	}
	
	public void setChangedIp(IPV4ADR ip){
		this.changedIP = ip;
	}
	
}
