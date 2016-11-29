package ir;

import irclasses.IPV4ADR;
import irclasses.Mac;

public class User {

	private Mac mac;
	private IPV4ADR adr;
	
	public User(Mac mac, IPV4ADR adr){
		this.mac = mac;
		this.adr = adr;
	}
	
	public Mac getMac(){
		return mac;
	}
	
	public void setMac(Mac mac){
		this.mac = mac;
	}
	
	public IPV4ADR getIPV4ADR(){
		return adr;
	}
	
	public void setIPV4ADR(IPV4ADR adr){
		this.adr = adr;
	}
	
}
