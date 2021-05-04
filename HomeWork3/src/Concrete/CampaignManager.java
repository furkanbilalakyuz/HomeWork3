package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Game game) {
System.out.println("%"+campaign.getIndirimOraný()+ " indirim eklendi");		
System.out.println("------------------------------");
	}

	@Override
	public void deleteCampaign(Campaign campaign, Game game) {
System.out.println("Ýndirim geçerli deðil");		
System.out.println("------------------------------");
	}

	@Override
	public void updateCampaign(Campaign campaign, Game game) {
System.out.println("%"+ campaign.getIndirimOraný()+"indirim oraný güncellendi");		
	}

}
