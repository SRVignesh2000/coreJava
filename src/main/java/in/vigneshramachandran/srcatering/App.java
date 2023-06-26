package in.vigneshramachandran.srcatering;

import in.vigneshramachandran.srcatering.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userservice = new UserService();
		
		userservice.getAll();

	}

}
