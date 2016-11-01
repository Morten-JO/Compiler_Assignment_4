package irclasses;

import ir.IR;

public class Entry extends IR {
	
	private Date date;
	private Time time;
	private Packet packet;
	
	
	public Entry(Date date, Time time, Packet packet) {
		
		this.date = date;
		this.time = time;
		this.packet = packet;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public Packet getPacket() {
		return packet;
	}


	public void setPacket(Packet packet) {
		this.packet = packet;
	}
	

}
