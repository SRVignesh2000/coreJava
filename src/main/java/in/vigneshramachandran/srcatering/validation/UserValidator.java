package in.vigneshramachandran.srcatering.validation;

import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {
		
		if(user == null) {
			throw new ValidationException("Invalid user input");
		}
		
		// validate email
//		if(user.getEmail() == null || ("").equals(user.getEmail().trim())) {
//			throw new ValidationException("Email cannot be null");
//		}
		StringUtil.rejectIfInvalidString(user.getEmail(), "email");
		
		// validate password
//		if(user.getPassword() == null || ("").equals(user.getPassword().trim())) {
//			throw new ValidationException("Password cannot be null");
//		}
		StringUtil.rejectIfInvalidString(user.getPassword(), "password");
		
		// validate firstname
//		if(user.getFirstName() == null || ("").equals(user.getFirstName().trim())) {
//			throw new ValidationException("Firstname cannot be null");
//		}
		StringUtil.rejectIfInvalidString(user.getFirstName(), "firstName");
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
		


}
