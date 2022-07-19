import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer busra = new Gamer(1, "Busra", "BAL", "123456789", "2002");
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.register(busra);
		gamerManager.updateInformation(busra);
		gamerManager.registerDelete(busra);
		
		Game mario = new Game(2, "mario", 150);
		
		GameManager gameManager = new GameManager();
		gameManager.add(mario);
		gameManager.updateGame(mario);
		gameManager.buyGame(mario, busra);
		gameManager.deleteGame(mario);
		
		Campaign campaign = new Campaign(3, "Current Campaign", "XYT56S", 20, "Three October" );
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.updateCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		campaignManager.applyCampaign(campaign);
		
	}
}
