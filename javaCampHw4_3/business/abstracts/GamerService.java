package javaCampHw4_3.business.abstracts;

import javaCampHw4_3.entities.concretes.Gamer;

public interface GamerService {
	void register(Gamer gamer);
	void updateInfo();
	void deleteAccount(Gamer gamer);
}
