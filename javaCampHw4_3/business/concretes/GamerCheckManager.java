package javaCampHw4_3.business.concretes;

import javaCampHw4_3.business.abstracts.CheckService;
import javaCampHw4_3.entities.abstracts.Entity;
import javaCampHw4_3.entities.concretes.Gamer;

public class GamerCheckManager implements CheckService {
	@Override
	public boolean check(Gamer gamer) {
		System.out.println("Identity verified: " + gamer.getFirstName());
		return true;
	}
}
