package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: Protinfo.java
 *
 * Created by: Morten J�rvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class Protinfo extends IR {
	
	private Protname name;
	private Length length;
	
	private String info;
	
	

	public Protinfo (Protname name, Length length){
		
		this.name = name;
		this.length = length;
		
		this.info = name.getProtocol() + " , " + length.getLength();
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
