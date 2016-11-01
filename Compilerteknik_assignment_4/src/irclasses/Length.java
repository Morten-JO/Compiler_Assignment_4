package irclasses;

import ir.IR;


public class Length extends IR {

	private String length = "length";
	
	public Length(int length){
		
		this.length += " " + length;
		
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}
}
