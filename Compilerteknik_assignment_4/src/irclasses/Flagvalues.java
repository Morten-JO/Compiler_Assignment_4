package irclasses;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: Flagvalues.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class Flagvalues {

	private String value;
	
	public Flagvalues(String value){
		
		if (value.equals("NONE") | value.equals("DF") | value.equals("MF")){
			
			this.value = value;
				
		}
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
