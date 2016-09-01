package EventAndCatering;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EventPlanningBis {

	List<Invitee> invitees = new ArrayList<Invitee>();

	public void addInvitee(Invitee person) {

		invitees.add(person);

	}

	public int getAverageAge() {

		AtomicInteger totalAge = new AtomicInteger(0);

		if (invitees.size() == 0) {

			return 0;

		}

		invitees.forEach(i -> totalAge.set(totalAge.get() + i.getAge()));

		return totalAge.get() / invitees.size();
	}

	public int getTotalMoneyCollected() {

		AtomicInteger totalMoney = new AtomicInteger(0);

		invitees.forEach(i -> totalMoney.set(totalMoney.get() + i.getAmountPaid()));

		return totalMoney.get();
	}

	public int getTotalNumberOfExpectedPeople() {

		AtomicInteger totalPeople = new AtomicInteger(0);

		invitees.forEach(i -> totalPeople.set(totalPeople.get() + i.getAdditionalPeople()));

		return totalPeople.get() + invitees.size();
	}

	public void removeMinors() {

		
		
		invitees.removeIf(i -> (i.getAge() < 18) );
		
	}

	public Map<String, Integer> groupByNames() {
		return null;
	}
}
