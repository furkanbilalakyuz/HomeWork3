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
		
		if (validationCheckService.checkÝfValidate(gamer)) {
System.out.println("Baþarýlý kayýt. Hoþgeldiniz:  " + gamer.getNickName());
System.out.println("------------------------------");

		}else {
		System.out.println("Baþarýsýz Kayýt");	
		}
		
		
	}

	@Override
	public void updateInfo(Gamer gamer) {
		if (validationCheckService.checkÝfValidate(gamer)) {
			System.out.println("Baþarýlý güncelleme. Tekrar Hoþgeldiniz:  " + gamer.getNickName());
			
			
		}
		else {System.out.println("Baþarýsýz güncelleme.Tekrar deneyiniz");	
			
		}
	}

	@Override
	public void deleteInfo(Gamer gamer) {
		 System.out.println("Hesabýnýz Silindi. Görüþmek üzere");
		
	}

}
