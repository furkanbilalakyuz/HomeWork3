package GameProject;

import Entities.Game;
import Entities.Gamer;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.ValidationCheckManager;
import Entities.Campaign;
import Concrete.GameManager;


public class Main {

	public static void main(String[] args) {

		Game game1 = new Game(1, "Asphalt 8", 108);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		gameManager.updateGame(game1);

		Gamer gamer1 = new Gamer();
		gamer1.setBirthYear(2000);
		gamer1.setGamerId(3);
		gamer1.setNationalityId("1345678901");
		gamer1.setNickName("ehmettrkmnglu");
		
		GamerManager gamerManager = new GamerManager(new ValidationCheckManager());
		gamerManager.registration(gamer1);
        gamerManager.updateInfo(gamer1);
        
        
        Campaign campaign1= new Campaign(30,1000);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign1, game1);

        SaleManager saleManager = new SaleManager();
        saleManager.saleWithCampaign(game1, gamer1, campaign1);
        
	}

}
