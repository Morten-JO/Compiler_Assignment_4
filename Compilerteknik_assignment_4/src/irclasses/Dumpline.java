package irclasses;

import java.util.ArrayList;
import java.util.List;

import ir.IR;

public class Dumpline  extends IR{
	
	private List<String> strings;

	public Dumpline(String... strs){
		strings = new ArrayList<String>();
		for(int i = 0; i < strs.length; i++){
			strings.add(strs[i]);
		}
	}

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}	
}
