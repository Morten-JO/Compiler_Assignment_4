package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: Protinfo.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class Protinfo extends IR {
	
	private Protname name;
	private Length length;

	public Protinfo (Protname name, Length length){
		
		this.name = name;
		this.length = length;
	}
	
	public Protname getName() {
		return name;
	}

	public void setName(Protname name) {
		this.name = name;
	}

	public Length getLength() {
		return length;
	}

	public void setLength(Length length) {
		this.length = length;
	}
}
