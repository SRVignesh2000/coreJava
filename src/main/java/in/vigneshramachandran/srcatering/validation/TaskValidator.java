package in.vigneshramachandran.srcatering.validation;

import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.Task;
import in.vigneshramachandran.srcatering.util.StringUtil;
public class TaskValidator {
public static void validate(Task newTask) throws ValidationException {

		if(newTask == null) {
			throw new ValidationException("Invalid Task Input");
		}

		StringUtil.rejectIfInvalidString(newTask.getTaskName(), "Taskname");
		StringUtil.rejectIfInvalidDate(newTask.getDueDate(), "Due Date");




	}

}