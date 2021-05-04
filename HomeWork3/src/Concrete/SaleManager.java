package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
System.out.println("Say�n:  " + gamer.getNickName() + game.getGameName() + "  oyununu sat�n ald�n�z" +"indirim oran�n�z: " + campaign.getIndirimOran�() );		
	}

	@Override
	public void saleWithoutCampaign(Game game, Gamer gamer) {
		System.out.println("Say�n:  " + gamer.getNickName() + game.getGameName() + "  oyununu sat�n ald�n�z"  );		
	}

}
