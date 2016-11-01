package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: Protname.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class Protname extends IR {
	
	private String protocol;
	
	public Protname(String proto){
		
		if (proto.equals("ICMP") | proto.equals("IGMP") | proto.equals("TCP") | proto.equals("UDP")){
			
			this.protocol = proto;
		}
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

}
