package ir;

import java.util.ArrayList;

import irclasses.Entries;
import irclasses.IPV4ADR;
import recognizer.network_part2Parser.Ipv4adrContext;

public class Analyzer {
	private String addressOne;
	private String addressTwo;
	private int packetCount = 0;

	public Analyzer(Entries n){

	}
	
	public void packetCount(Entries e){
		
		ArrayList<String> ipIdentifier = new ArrayList<String>();
		
		for (int i = 0; i < e.getAllEntries().size(); i++) {
			
			packetCount = 0;
			IPV4ADR firstIPAdress = e.getAllEntries().get(i).getPacket().getContent().getAddress();
			addressOne = ""+firstIPAdress.getOne()+"."+firstIPAdress.getTwo()+"."
								+firstIPAdress.getThree()+"."+firstIPAdress.getFour()+"."+firstIPAdress.getFive();
			
			IPV4ADR secondIPAdress = e.getAllEntries().get(i).getPacket().getContent().getSecondAddress();
			addressTwo = ""+secondIPAdress.getOne()+"."+secondIPAdress.getTwo()+"."
								+secondIPAdress.getThree()+"."+secondIPAdress.getFour()+"."+secondIPAdress.getFive();
			
			if(ipIdentifier.contains(addressOne +">"+ addressTwo)){
				//Already printed this, exit for-loop
				break;
			}
			
			else{
				ipIdentifier.add(addressOne + ">" + addressTwo);
			}
			
			for (int j = 0; j < e.getAllEntries().size(); j++) {
				
				IPV4ADR adrOne = e.getAllEntries().get(j).getPacket().getContent().getAddress();
				
				IPV4ADR adrTwo = e.getAllEntries().get(j).getPacket().getContent().getSecondAddress();
				
				String ipOne = ""+adrOne.getOne()+"."+adrOne.getTwo()+"."
						+adrOne.getThree()+"."+adrOne.getFour()+"."+adrOne.getFive();
				
				String ipTwo = ""+adrTwo.getOne()+"."+adrTwo.getTwo()+"."
						+adrTwo.getThree()+"."+adrTwo.getFour()+"."+adrTwo.getFive();
				
				if(addressOne.equals(ipOne) && addressTwo.equals(ipTwo)){
					
					packetCount++;
				}
				
		}
			System.out.println(addressOne+ " > " + addressTwo + ": " + packetCount);
		}
		
	}
}
