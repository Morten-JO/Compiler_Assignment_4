package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Tos.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Tos extends IR {
	
	private HexNumber number;
	
	public IpV4Tos(HexNumber number){
		this.number = number;
	}

	public HexNumber getNumber() {
		return number;
	}

	public void setNumber(HexNumber number) {
		this.number = number;
	}
	
	


}
