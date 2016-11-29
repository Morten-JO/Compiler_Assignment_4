package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Id.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Id extends IR{
	
	private int id;
	
	public IpV4Id(int number){
		
		this.id = number;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
