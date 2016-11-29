package ir;

import java.util.ArrayList;
import java.util.List;

import irclasses.Entries;
import irclasses.IPV4ADR;
import irclasses.Mac;
import irclasses.Packet;

public class AttackPreventer {

	public void findAttack(Entries entries) throws AttackException {
		List<User> users = new ArrayList<User>();
		for(int i = 0; i < entries.getAllEntries().size(); i++){
			boolean firstExists = false;
			boolean secondExists = false;
			Packet packet = entries.getAllEntries().get(i).getPacket();
			for(int j = 0; j < users.size(); j++){
				//check if senders ip/mac exists in list
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
					if(users.get(j).getIPV4ADR().compare(packet.getContent().getAddress())){
						firstExists = true;
						break;
					}
				}
				//check if receivers ip/mac exists in list
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
					if(users.get(j).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
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
		}
		for(int i = 0; i < entries.getAllEntries().size(); i++){
			Packet packet = entries.getAllEntries().get(i).getPacket();
			for(int j = 0; j < users.size(); j++){
				if(users.get(j).getIPV4ADR().compare(packet.getContent().getAddress())){
					if(!users.get(j).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
				if(users.get(j).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
					if(!users.get(j).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
					if(!users.get(j).getIPV4ADR().compare(packet.getContent().getAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
					if(!users.get(j).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
						throw new AttackException("Misuse in entry!");
					}
				}
			}
		}
	}
	
	public void findAttacks(Entries entries) {
		List<ChangedUser> changedUsers = new ArrayList<ChangedUser>();
		List<User> users = new ArrayList<User>();
		for(int i = 0; i < entries.getAllEntries().size(); i++){
			boolean firstExists = false;
			boolean secondExists = false;
			Packet packet = entries.getAllEntries().get(i).getPacket();
			for(int j = 0; j < users.size(); j++){
				//check if senders ip/mac exists in list
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
					if(users.get(j).getIPV4ADR().compare(packet.getContent().getAddress())){
						firstExists = true;
						break;
					}
				}
				//check if receivers ip/mac exists in list
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
					if(users.get(j).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
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
		}
		for(int i = 0; i < entries.getAllEntries().size(); i++){
			Packet packet = entries.getAllEntries().get(i).getPacket();
			for(int j = 0; j < users.size(); j++){
				if(users.get(j).getIPV4ADR().compare(packet.getContent().getAddress())){
					if(!users.get(j).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
						changedUsers.add(new ChangedUser(users.get(j).getMac(), packet.getContent().getAddress(), packet.getAddress1(), null));
					}
				}
				if(users.get(j).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
					if(!users.get(j).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
						changedUsers.add(new ChangedUser(users.get(j).getMac(), packet.getContent().getSecondAddress(), packet.getAddress2(), null));
					}
				}
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress1().getMacAddress())){
					if(!users.get(j).getIPV4ADR().compare(packet.getContent().getAddress())){
						changedUsers.add(new ChangedUser(users.get(j).getMac(), users.get(j).getIPV4ADR(), null, packet.getContent().getAddress()));
					}
				}
				if(users.get(j).getMac().getMacAddress().equals(packet.getAddress2().getMacAddress())){
					if(!users.get(j).getIPV4ADR().compare(packet.getContent().getSecondAddress())){
						changedUsers.add(new ChangedUser(users.get(j).getMac(), users.get(j).getIPV4ADR(), null, packet.getContent().getSecondAddress()));
					}
				}
			}
		}
		
		//remove duplicates
		for(int i = 0; i < changedUsers.size(); i++){
			for(int j = 0; j < changedUsers.size(); j++){
				if(j != i){
					if(changedUsers.get(i).getChangedIP() == null){
						Mac macOfI = changedUsers.get(i).getChangedMac();
						if(macOfI.getMacAddress().equals(changedUsers.get(j).getChangedMac()) || macOfI.getMacAddress().equals(changedUsers.get(j).getMac())){
							changedUsers.remove(j);
						}
					} else if(changedUsers.get(i).getChangedMac() == null){
						IPV4ADR adr = changedUsers.get(i).getChangedIP();
						if(adr.compare(changedUsers.get(j).getChangedIP()) || adr.compare(changedUsers.get(j).getIPV4ADR())){
							changedUsers.remove(j);
						}
					}
				}
			}
		}
		
		for(int i = 0; i < changedUsers.size(); i++){
			if(changedUsers.get(i).getChangedIP() == null){
				System.out.println(changedUsers.get(i).getIPV4ADR().getAsString()+" changed from "+changedUsers.get(i).getMac().getMacAddress() + " to "+changedUsers.get(i).getChangedMac().getMacAddress());
			} else if(changedUsers.get(i).getChangedMac() == null){
				System.out.println(changedUsers.get(i).getMac().getMacAddress()+" changed from "+changedUsers.get(i).getIPV4ADR().getAsString()+" to "+changedUsers.get(i).getChangedIP().getAsString());
			}
		}
	}
}
