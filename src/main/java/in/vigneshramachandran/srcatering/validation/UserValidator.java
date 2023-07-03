package in.vigneshramachandran.srcatering.validation;

import in.vigneshramachandran.srcatering.model.User;

public class UserValidator {

	public static void validate(User user) throws Exception {
		
		if(user == null) {
			throw new Exception("Invalid user input");
		}
		
		// validate email
		if(user.getEmail() == null || ("").equals(user.getEmail().trim())) {
			throw new Exception("Email cannot be null");
		}
		
		// validate password
		if(user.getPassword() == null || ("").equals(user.getPassword().trim())) {
			throw new Exception("Password cannot be null");
		}
		
		// validate firstname
		if(user.getFirstName() == null || ("").equals(user.getFirstName().trim())) {
			throw new Exception("Firstname cannot be null");
		}
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
		


}
