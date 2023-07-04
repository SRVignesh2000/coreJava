package in.vigneshramachandran.srcatering.util;

import java.time.LocalDate;

import in.vigneshramachandran.srcatering.exception.ValidationException;

public class StringUtil {
	
	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
		
		if(input == null || ("").equals(input.trim())) {
			throw new ValidationException(inputName.concat(" cannot be null or empty"));
		}
		
	}
	
	public static boolean isValid(String input) {
		
		if(input == null || ("").equals(input.trim())) {
			return false;
		}
		return true;
	}
	
	public static boolean isInValid(String input) {
		
		if(input == null || ("").equals(input.trim())) {
			return true;
		}
		return false;
		
	}
	
	
	
	public static void rejectIfInvalidDate(LocalDate input, String inputName) throws Exception {
		
		LocalDate date = LocalDate.now();
		
		if(input.isBefore(date)) {
			throw new ValidationException(inputName.concat(" Invalid"));
		}
		
	}
	
	
}
