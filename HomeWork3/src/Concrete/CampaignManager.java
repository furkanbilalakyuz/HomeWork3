package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Game game) {
System.out.println("%"+campaign.getIndirimOran�()+ " indirim eklendi");		
System.out.println("------------------------------");
	}

	@Override
	public void deleteCampaign(Campaign campaign, Game game) {
System.out.println("�ndirim ge�erli de�il");		
System.out.println("------------------------------");
	}

	@Override
	public void updateCampaign(Campaign campaign, Game game) {
System.out.println("%"+ campaign.getIndirimOran�()+"indirim oran� g�ncellendi");		
	}

}
