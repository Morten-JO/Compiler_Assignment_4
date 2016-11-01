package irclasses;

import java.util.LinkedList;

import ir.IR;

public class Entries extends IR {
	
	private LinkedList<Entry> entries;
	
	
	public Entries(LinkedList<Entry> entries){
		
		this.entries = entries;
		
		
	}


	public LinkedList<Entry> getAllEntries() {
		return this.entries;
	}


	public void setEntries(LinkedList<Entry> entries) {
		this.entries = entries;
	}

}
