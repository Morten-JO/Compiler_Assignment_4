package irclasses;



public class Length {

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
