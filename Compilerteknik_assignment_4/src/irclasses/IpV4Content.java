package irclasses;


import java.util.ArrayList;
import java.util.List;

import ir.IR;



public class IpV4Content extends IR {
	
	private IpV4Fields fields;
	private IPV4ADR address;
	private IPV4ADR secondAddress;
	private Protinfo prot;
	private List<Dumpline> dumplines;
	
	public IpV4Content(IpV4Fields field, IPV4ADR first, IPV4ADR second, Protinfo info, List<Dumpline> lines){
		fields = field; 
		this.address = first;
		this.secondAddress = second;
		this.prot = info;
		dumplines = lines;
	}

	public IpV4Fields getFields() {
		return fields;
	}

	public void setFields(IpV4Fields fields) {
		this.fields = fields;
	}

	public IPV4ADR getAddress() {
		return address;
	}

	public void setAddress(IPV4ADR address) {
		this.address = address;
	}

	public IPV4ADR getSecondAddress() {
		return secondAddress;
	}

	public void setSecondAddress(IPV4ADR secondAddress) {
		this.secondAddress = secondAddress;
	}

	public Protinfo getProt() {
		return prot;
	}

	public void setProt(Protinfo prot) {
		this.prot = prot;
	}

	public List<Dumpline> getDumpline() {
		return dumplines;
	}

	public void setDumpline(List<Dumpline> dumpline) {
		this.dumplines = dumpline;
	}


	
	
}
