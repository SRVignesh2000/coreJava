package in.vigneshramachandran.srcatering;

import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.service.UserService;

public class App {

	public static void main(String[] args) {

		UserService userservice;
		try {
			userservice = new UserService();

			// user 1
			User newUser = new User();

			newUser.setId(12223);
			newUser.setFirstName("Vignesh");
			newUser.setLastName("Ramachandran");
			newUser.setEmail("vigneshramachandran@fssa.freshworks.com");
			newUser.setPassword("123asd");
			newUser.setActive(true);
			newUser.toString();

			userservice.create(newUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		userservice.update();
//		userservice.delete();
//		userservice.findById();
//		userservice.getAll();

	}

}
