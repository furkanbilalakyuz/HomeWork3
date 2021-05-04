package Concrete;

import Abstract.GamerService;
import Abstract.ValidationCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService {
private ValidationCheckService validationCheckService;

	public GamerManager(ValidationCheckService validationCheckService) {
	super();
	this.validationCheckService = validationCheckService;
}

	@Override
	public void registration(Gamer gamer) {
		
		if (validationCheckService.check�fValidate(gamer)) {
System.out.println("Ba�ar�l� kay�t. Ho�geldiniz:  " + gamer.getNickName());
System.out.println("------------------------------");

		}else {
		System.out.println("Ba�ar�s�z Kay�t");	
		}
		
		
	}

	@Override
	public void updateInfo(Gamer gamer) {
		if (validationCheckService.check�fValidate(gamer)) {
			System.out.println("Ba�ar�l� g�ncelleme. Tekrar Ho�geldiniz:  " + gamer.getNickName());
			
			
		}
		else {System.out.println("Ba�ar�s�z g�ncelleme.Tekrar deneyiniz");	
			
		}
	}

	@Override
	public void deleteInfo(Gamer gamer) {
		 System.out.println("Hesab�n�z Silindi. G�r��mek �zere");
		
	}

}
