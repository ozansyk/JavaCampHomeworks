package javaCampHw4_3.business.abstracts;

import javaCampHw4_3.entities.concretes.Game;

public interface GameSaleService {
	void saleGame(Game game);
	void giveBackGame(Game game);
}
