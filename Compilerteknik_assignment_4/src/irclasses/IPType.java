package irclasses;

public class IPType {
	private String ipDescription = "IPv4";

	public IPType(HexNumber num) {
		
		this.ipDescription += "("+num.getHex()+")";
	}
}
