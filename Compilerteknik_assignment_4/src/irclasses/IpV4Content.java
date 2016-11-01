package irclasses;



public class IpV4Content {
	
	private String fields = "";
	
	public IpV4Content(IpV4Fields field, IPV4ADR first, IPV4ADR second, Protinfo info, Dumpline line){
		fields = field.getFields() + first.getAddress() + ">" + second.getAddress() + ":" + info.getInfo() + line.getNumber();
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	
	
}
