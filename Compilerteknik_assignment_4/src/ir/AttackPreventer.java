package ir;

import java.util.ArrayList;
import java.util.List;

import irclasses.Entries;
import irclasses.Packet;

public class AttackPreventer {

	public void findAttack(Entries entries) throws AttackException {
		List<User> users = new ArrayList<User>();
		for(int i = 0; i < entries.getAllEntries().size(); i++){
			boolean firstExists = false;
			boolean secondExists = false;
			Packet packet = entries.getAllEntries().get(i).getPacket();
			for(int x = 0; x < users.size(); x++){
				if(users.get(x).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
					if(users.get(x).getIPV4ADR().compare(packet.getContent().getAddress())){
						firstExists = true;
						break;
					}
				}
				if(users.get(x).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
					if(users.get(x).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
						secondExists = true;
						break;
					}
				}
			}
			if(!firstExists){
				users.add(new User(packet.getAddress1(), packet.getContent().getAddress()));
			}
			if(!secondExists){
				users.add(new User(packet.getAddress2(), packet.getContent().getSecondAddress()));
			}
			for(int x = 0; x < users.size(); x++){
				if(users.get(i).getIPV4ADR().compare(packet.getContent().getAddress())){
					if(!users.get(i).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
				if(users.get(i).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
					if(!users.get(i).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
				if(users.get(i).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
					if(!users.get(i).getIPV4ADR().compare(packet.getContent().getAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
				if(users.get(i).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
					if(!users.get(i).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
			}
		}
	}
	
}
