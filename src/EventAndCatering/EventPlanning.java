package EventAndCatering;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventPlanning {

	List<Invitee> invitees = new ArrayList<Invitee>();

	public void addInvitee(Invitee person) {

		invitees.add(person);
		
	}

	public int getAverageAge() {

		int total = 0;

		if (invitees.size() > 0) {

			for (Invitee i : invitees) {

				total += i.getAge();

			}

			return (total / invitees.size());

		}

		return 0; 
	
	}

	public int getTotalMoneyCollected() {
		
		int total = 0; 
		
		for(Invitee i : invitees){
			
			total += i.getAmountPaid(); 
			
		}
		
		return total;
	}

	public int getTotalNumberOfExpectedPeople() {
		
		int total = 0; 
		
		for(Invitee i : invitees){
			
			total += i.getAdditionalPeople(); 
			
		}
		
		return (total + invitees.size());
	}

	public void removeMinors() {
		
		for(int i = 0; i < invitees.size(); i++){
			
			if(invitees.get(i).getAge() < 18){
				
				invitees.remove(i); 
				
				i--; 
				
			}
		}
	}

	public Map<String, Integer> groupByNames() {
		return null;
	}
}
