package in.vigneshramachandran.srcatering;

import in.vigneshramachandran.srcatering.service.UserService;

public class App {

	public static void main(String[] args) {
	
		
		UserService userservice = new UserService();
		
		userservice.create();
		userservice.getAll();
		
	}

}
