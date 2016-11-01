package irclasses;
import ir.IR;

public class Mac extends IR {
	
	
	/*
	private HexaByte one;
	private HexaByte two;
	private HexaByte three;
	private HexaByte four;
	private HexaByte five;
	private HexaByte six;
	*/
	
	private String macAddress;
	
//	public Mac(HexaByte one, HexaByte two, HexaByte three, HexaByte four, HexaByte five, HexaByte six) {
//		
//		this.one = one;
//		this.two = two;
//		this.three = three;
//		this.four = four;
//		this.five = five;
//		this.six = six;
//	}

	
	public Mac(String address){
		
		macAddress = address;
		
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
//	public HexaByte getOne() {
//		return one;
//	}
//
//
//	public void setOne(HexaByte one) {
//		this.one = one;
//	}
//
//
//	public HexaByte getTwo() {
//		return two;
//	}
//
//
//	public void setTwo(HexaByte two) {
//		this.two = two;
//	}
//
//
//	public HexaByte getThree() {
//		return three;	}
//
//
//	public void setThree(HexaByte three) {
//		this.three = three;
//	}
//
//
//	public HexaByte getFour() {
//		return four;
//	}
//
//
//	public void setFour(HexaByte four) {
//		this.four = four;
//	}
//
//
//	public HexaByte getFive() {
//		return five;
//	}
//
//
//	public void setFive(HexaByte five) {
//		this.five = five;
//	}
//
//
//	public HexaByte getSix() {
//		return six;
//	}
//
//
//	public void setSix(HexaByte six) {
//		this.six = six;
//	}
}
