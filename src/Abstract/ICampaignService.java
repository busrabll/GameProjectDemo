package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	
	 void add(Campaign campaign);
	 
	 void updateCampaign(Campaign campaign);
	 
	 void deleteCampaign(Campaign campaign);
	 
	 void applyCampaign(Campaign campaign);

}
