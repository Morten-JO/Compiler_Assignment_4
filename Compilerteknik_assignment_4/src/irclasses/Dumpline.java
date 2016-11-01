package irclasses;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: Dumpline.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class Dumpline {
	
	private HexNumber number;
	
	

	public Dumpline(HexNumber number){
		
		this.number = number;
	}
	
	public HexNumber getNumber() {
		return number;
	}

	public void setNumber(HexNumber number) {
		this.number = number;
	}

}
