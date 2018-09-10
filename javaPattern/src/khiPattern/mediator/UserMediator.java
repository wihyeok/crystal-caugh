package khiPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class UserMediator implements Mediator {

	
	private List<Colleague> colleagueList;
	
	
	
	
	public UserMediator() {
		 
		this.colleagueList = new ArrayList<Colleague>();
	}

	@Override
	public void addColleague(Colleague colleague) {
		// TODO Auto-generated method stub
		this.colleagueList.add(colleague);
	}

	@Override
	public void mediate(Colleague colleague) {
		// TODO Auto-generated method stub
		for(Colleague receiverColleague : colleagueList) {
			if(!colleague.getName().equals(receiverColleague.getName())) {
				System.out.println(colleague.getName()+" to "+receiverColleague.getName());
				receiverColleague.receive(colleague);
			}
		}
		
		
	}

	
	
}
