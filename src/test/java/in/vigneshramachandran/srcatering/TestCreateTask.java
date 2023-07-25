package in.vigneshramachandran.srcatering;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.Task;
import in.vigneshramachandran.srcatering.service.TaskService;

public class TestCreateTask {

	@Test
	public void testCreateTaskWithValidInput() {
		
		TaskService taskservice = new TaskService();

		Task newTask = new Task();

		newTask.setTaskName("Write");
		String date = "06-11-2023";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);

		assertDoesNotThrow(() -> {
			taskservice.create(newTask);
		});
	}

	@Test
	public void testCreateTaskWithInValidInput() {
		TaskService taskservice = new TaskService();

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskservice.create(null);
		});

		String expectedMessage = "Invalid Task Input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	// dueDate test case
	@Test
	public void testCreateUserWithNameNull() {
		TaskService taskservice = new TaskService();

		Task newTask = new Task();

		newTask.setTaskName(null);
		String date = "06-07-2023";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);

		
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskservice.create(newTask);
		});
		String expectedMessage = "Taskname cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));

	}
	
	
	@Test
	public void testCreateUserWithNameEmpty() {
		TaskService taskservice = new TaskService();

		Task newTask = new Task();

		newTask.setTaskName("");
		String date = "06-07-2023";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);
		
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskservice.create(newTask);
		});
		String expectedMessage = "Taskname cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));

	}
	
	@Test
	public void testCreateUserWithInvalidDueDate() {
		TaskService taskservice = new TaskService();

		Task newTask = new Task();

		newTask.setTaskName("Write");
		String date = "06-08-2022";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);
		
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskservice.create(newTask);
		});
		String expectedMessage = "Duedate Invalid";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));

	}
	

}
