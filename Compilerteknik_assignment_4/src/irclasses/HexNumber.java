package irclasses;
import ir.IR;

public class HexNumber extends IR {

	private String hex;
	
	public HexNumber(String hex){
		this.hex = hex;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}
}
