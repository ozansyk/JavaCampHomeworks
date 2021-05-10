package javaCampHw4_3;

import javaCampHw4_3.business.abstracts.CampaignService;
import javaCampHw4_3.business.abstracts.CheckService;
import javaCampHw4_3.business.abstracts.GameSaleService;
import javaCampHw4_3.business.concretes.CampaignManager;
import javaCampHw4_3.business.concretes.GameSaleManager;
import javaCampHw4_3.business.concretes.GamerCheckManager;
import javaCampHw4_3.entities.concretes.Campaign;
import javaCampHw4_3.entities.concretes.Game;
import javaCampHw4_3.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Ozan", "Soyak", 1992, "54424563452");
		CheckService gamerCheckManager = new GamerCheckManager();
		gamerCheckManager.check(gamer);
		
		System.out.println("----------------");
		
		Game game = new Game(1, "Gta 5", 150);
		GameSaleService gameSaleManager = new GameSaleManager(gamer);
		gameSaleManager.saleGame(game);
		gameSaleManager.giveBackGame(game);
		
		System.out.println("----------------");
		
		Campaign campaign = new Campaign(1, "Spring discount", 30);
		System.out.println("Campaign name: " + campaign.getCampaignName());
		System.out.println("Campaign discount rate: " +campaign.getDiscountRate());
		
		System.out.println("----------------");
		
		CampaignService campaignService = new CampaignManager(campaign, game);
		campaignService.doCampaign(game);
		campaignService.updateCampaign("Summer discount", 40);
		campaignService.deleteCampaign(campaign);
		campaignService.doCampaign(game);
		
	}
}
