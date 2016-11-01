package irclasses;

import ir.IR;

public class HexaByte  extends IR {
	
	char[] bytes = new char[2];
	
	
	public HexaByte(char one, char two){
		
		bytes[0] = one;
		bytes[1] = two;
		
	}
	

}
