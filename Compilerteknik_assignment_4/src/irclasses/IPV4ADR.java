package irclasses;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IPV4ADR.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IPV4ADR {
	
	
	
	private String address = "";
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public IPV4ADR(int number1, int number2, int number3, int number4, int number5, int number6) {
		
		address += number1 + "." + number2 + "." +number3+"."+number4+"."+number5+"."+number6;
		
	}

}
