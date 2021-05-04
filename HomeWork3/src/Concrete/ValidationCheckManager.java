package Concrete;

import Abstract.ValidationCheckService;
import Entities.Gamer;

public class ValidationCheckManager implements ValidationCheckService{

	@Override
	public boolean checkÝfValidate(Gamer gamer) {
		int nationalityIdLength = gamer.getNationalityId().length();
		
		if(nationalityIdLength ==11   ) {
			System.out.println("Kayýt Baþarýlý ");
			return true;
		}
		else
		{
			System.out.println("Lütfen bilgileri kontrol ediniz ");
			
		}
		return false;
		
		
	}
	

}
