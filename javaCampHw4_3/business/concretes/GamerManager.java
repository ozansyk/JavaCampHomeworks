package javaCampHw4_3.business.concretes;

import javaCampHw4_3.business.abstracts.CheckService;
import javaCampHw4_3.business.abstracts.GamerService;
import javaCampHw4_3.entities.concretes.Gamer;

public class GamerManager implements GamerService {
	
	CheckService checkService;

	public GamerManager(javaCampHw4_3.business.abstracts.CheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void register(Gamer gamer) {
		if(checkService.check(gamer)) {
			System.out.println("Kayýt olundu: " + gamer.getFirstName());
		} else {
			System.out.println("Not a valid User: " + gamer.getFirstName());
		}
	}

	@Override
	public void updateInfo() {
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println("User deleted: " + gamer.getFirstName());
	}
	
}
