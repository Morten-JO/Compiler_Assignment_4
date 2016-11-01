package irclasses;

import ir.IR;

public class Tag extends IR {
	
	private HexNumber hex;
	
	public Tag(HexNumber number){
		
		hex = number;
	}

	public HexNumber getHex() {
		return hex;
	}

	public void setHex(HexNumber hex) {
		this.hex = hex;
	}

}
