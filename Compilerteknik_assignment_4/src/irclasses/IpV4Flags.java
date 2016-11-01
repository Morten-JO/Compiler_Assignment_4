package irclasses;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Flags.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Flags {
	
	private Flagvalues values;
	
	private String flags = "flags";
	
	public IpV4Flags(Flagvalues values){
		
		this.flags += " [" + values.getValue() + "]";
		
	}

	public Flagvalues getValues() {
		return values;
	}

	public void setValues(Flagvalues values) {
		this.values = values;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

}
