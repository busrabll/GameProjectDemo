package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private String campaignCode;
	private int discountRate;
	private String validityDate;
	
	public Campaign(int id, String campaignName, String campaignCode, int discountRate, String validityDate) {
		
		this.id = id;
		this.campaignName = campaignName;
		this.campaignCode = campaignCode;
		this.discountRate = discountRate;
		this.validityDate = validityDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public String getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	
}
