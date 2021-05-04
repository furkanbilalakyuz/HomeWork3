package Concrete;

import Abstract.ValidationCheckService;
import Entities.Gamer;

public class ValidationCheckManager implements ValidationCheckService{

	@Override
	public boolean check�fValidate(Gamer gamer) {
		int nationalityIdLength = gamer.getNationalityId().length();
		
		if(nationalityIdLength ==11   ) {
			System.out.println("Kay�t Ba�ar�l� ");
			return true;
		}
		else
		{
			System.out.println("L�tfen bilgileri kontrol ediniz ");
			
		}
		return false;
		
		
	}
	

}
