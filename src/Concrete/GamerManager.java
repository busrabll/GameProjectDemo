package Concrete;

import Abstract.IGamerService;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerManager implements IGamerService{
	
	private IGamerCheckService iGamerCheckService;
	
	public GamerManager(IGamerCheckService iGamerCheckService) {
		
		this.iGamerCheckService = iGamerCheckService;
		
	}

	@Override
	public void register(Gamer gamer) {
		
		if (iGamerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println( gamer.getFirstName() + " registered in the system. ");
		}
		else {
			
			System.out.println("Gamer don't register because the information is not correct");
		}
	}

	@Override
	public void updateInformation(Gamer gamer) {
		
		System.out.println("Gamer updated: " + gamer.getFirstName());
	
	}

	@Override
	public void registerDelete(Gamer gamer) {
		
		System.out.println("Record deleted: " + gamer.getFirstName());
	
	}	
}
