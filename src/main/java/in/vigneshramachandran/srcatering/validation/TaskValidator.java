package in.vigneshramachandran.srcatering.validation;

import in.vigneshramachandran.srcatering.model.Task;

public class TaskValidator {

	public static void validate(Task task) throws Exception {
		
		if(task == null) {
			throw new Exception("Invalid task input");
		}
		
		// validate firstname
		if(task.getName() == null || ("").equals(task.getName().trim())) {
			throw new Exception("Name cannot be null");
		}
		
		
		
	}

}
