package ir;

import irclasses.Entries;
import irclasses.Entry;

public class IR {
	
	public Entries entries;

	public IR(){}
	
	public IR(Entries entry) {
		
		this.entries = entry;
	}

	public Entries getEntries() {
		return entries;
	}

	public void setEntries(Entries entries) {
		this.entries = entries;
	}
	
	

}
