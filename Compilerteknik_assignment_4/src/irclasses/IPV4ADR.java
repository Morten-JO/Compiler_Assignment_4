package irclasses;
import ir.IR;

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

public class IPV4ADR extends IR {
	
	
	
	private int one, two, three, four, five;
	
	

	public IPV4ADR(int number1, int number2, int number3, int number4, int number5) {
		
		one = number1;
		two = number2;
		three = number3;
		four = number4;
		five = number5;
		
		
	}



	public int getOne() {
		return one;
	}



	public void setOne(int one) {
		this.one = one;
	}



	public int getTwo() {
		return two;
	}



	public void setTwo(int two) {
		this.two = two;
	}



	public int getThree() {
		return three;
	}



	public void setThree(int three) {
		this.three = three;
	}



	public int getFour() {
		return four;
	}



	public void setFour(int four) {
		this.four = four;
	}



	public int getFive() {
		return five;
	}



	public void setFive(int five) {
		this.five = five;
	}
	
	public boolean compare(IPV4ADR adr){
		if(this.one == adr.one){
			if(this.two == adr.two){
				if(this.three == adr.three){
					if(this.four == adr.four){
						if(this.five == adr.five){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public String getAsString(){
		return one+"."+two+"."+three+"."+four+":"+five;
	}

}
