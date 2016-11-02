package irclasses;

import java.util.List;

import ir.IR;

public class Dumpline  extends IR{
	
	private List<String> strings;

	public Dumpline(List<String> strs){
		strings = strs;
	}

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}	
}
