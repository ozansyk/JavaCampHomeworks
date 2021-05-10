package javaCampHw4_3.business.abstracts;

import javaCampHw4_3.entities.concretes.Campaign;
import javaCampHw4_3.entities.concretes.Game;

public interface CampaignService {
	void updateCampaign(String campaignName, int discountRate);
	void deleteCampaign(Campaign campaign);
	void doCampaign(Game game);
}
