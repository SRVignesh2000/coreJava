package in.vigneshramachandran.srcatering.util;

import java.time.LocalDate;

import in.vigneshramachandran.srcatering.exception.ValidationException;

public class StringUtil {

	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
		if (input == null || "".equals(input.trim())) {
			throw new ValidationException(inputName.concat(" cannot be null or empty"));
		}
	}

	public static void rejectIfInvalidDate(LocalDate date, String inputName) throws ValidationException {
		LocalDate currentDate = LocalDate.now();
		if (date.isBefore(currentDate)) {
			throw new ValidationException(inputName.concat("Invalid"));
		}
	}

	public static boolean isValidString(String newString) {

		if (newString == null || "".equals(newString.trim())) {

			return false;
		}
		return true;

	}

	public static boolean isInvalidString(String newString) {

		if (!isValidString(newString)) {

			return true;
		}
		return false;

	}

}