package in.vigneshramachandran.srcatering.validation;

import java.time.LocalDate;

import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.Task;
import in.vigneshramachandran.srcatering.util.StringUtil;

public class TaskValidator {

	public static void validate(Task newTask) throws Exception {
		
		if(newTask == null) {
			throw new ValidationException("Invalid task input");
		}
		
		StringUtil.rejectIfInvalidDate(newTask.getDueDate(), "due date");
		
		StringUtil.rejectIfInvalidString(newTask.getName(), "name");
		
	}
	


}
