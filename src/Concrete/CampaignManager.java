package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added to system: " + campaign.getCampaignName());
	
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Campaign updated: " + campaign.getCampaignName());
	
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println("Campaign deleted to system: " + campaign.getCampaignName());
	
	}

	@Override
	public void applyCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignCode() + " Campaign applied.");

	}
}
