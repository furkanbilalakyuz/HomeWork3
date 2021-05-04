package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
System.out.println("Sayýn:  " + gamer.getNickName() + game.getGameName() + "  oyununu satýn aldýnýz" +"indirim oranýnýz: " + campaign.getIndirimOraný() );		
	}

	@Override
	public void saleWithoutCampaign(Game game, Gamer gamer) {
		System.out.println("Sayýn:  " + gamer.getNickName() + game.getGameName() + "  oyununu satýn aldýnýz"  );		
	}

}
