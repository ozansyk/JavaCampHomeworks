package javaCampHw4_3.business.concretes;

import javaCampHw4_3.business.abstracts.CampaignService;
import javaCampHw4_3.entities.concretes.Campaign;
import javaCampHw4_3.entities.concretes.Game;

public class CampaignManager implements CampaignService {
	
	private Campaign campaign;
	private Game game;

	public CampaignManager(Campaign campaign, Game game) {
		super();
		this.campaign = campaign;
		this.game = game;
	}

	@Override
	public void updateCampaign(String campaingName, int discountRate) {
		this.campaign.setCampaignName(campaingName);
		this.campaign.setDiscountRate(discountRate);
		System.out.println("Updated. New Campaign name is: " + this.campaign.getCampaignName());
		System.out.println("Updated. New Campaign dþscount rate is: " + this.campaign.getDiscountRate());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign is deleted: " + this.campaign.getCampaignName());
		
	}
	
	@Override
	public void doCampaign(Game game) {
		int x = game.getGamePrice() - (game.getGamePrice()*this.campaign.getDiscountRate()/100);
		game.setGamePrice(x);
		System.out.println("Campaign done for: " + game.getGameName());
		System.out.println("New price for " + game.getGameName() + " is " + game.getGamePrice());
		
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
}
