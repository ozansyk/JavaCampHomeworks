package javaCampHw4_3.Mernis.concretes;

import javaCampHw4_3.business.abstracts.CheckService;
import javaCampHw4_3.entities.abstracts.Entity;

public class MernisCheckManager implements CheckService {

	@Override
	public void check(Entity entity) {
		System.out.println("Kimlik doðrulandý.");
	}
	
}
