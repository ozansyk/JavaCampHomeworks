package javaCampHw4_3.business.concretes;

import javaCampHw4_3.business.abstracts.GameSaleService;
import javaCampHw4_3.entities.concretes.Game;
import javaCampHw4_3.entities.concretes.Gamer;

public class GameSaleManager implements GameSaleService {
	
	Gamer gamer;

	public GameSaleManager(Gamer gamer) {
		super();
		this.gamer = gamer;
	}

	@Override
	public void saleGame(Game game) {
		System.out.println(game.getGameName() +" has sold to " + gamer.getFirstName() );
		System.out.println("Game price is: " + game.getGamePrice());
		
	}

	@Override
	public void giveBackGame(Game game) {
		System.out.println(game.getGameName() +" game had given back from : " + gamer.getFirstName() );
		
	}

}
