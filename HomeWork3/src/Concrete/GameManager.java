package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println("Oyun eklendi   "+ game.getGameName()+ "  Oyun ücreti " + game.getGamePrice() +"Tl");
		System.out.println("------------------------------");
	}

	@Override
	public void updateGame(Game game) {
System.out.println("oyun güncellendi");	
System.out.println("------------------------------");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Oyun silindi ");
		System.out.println("------------------------------");
		
	}

}
