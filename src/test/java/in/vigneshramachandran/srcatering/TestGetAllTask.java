package in.vigneshramachandran.srcatering;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import in.vigneshramachandran.srcatering.service.TaskService;
import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.Task;

public class TestGetAllTask {

	@Test
	public void testGetAllTasks() {
		TaskService taskservice = new TaskService();
		List<Task> taskList = new ArrayList<Task>(taskservice.getAll());
		System.out.println(taskList);
	}

	@Test
	public void testUpdateTask() throws ValidationException {
		TaskService taskservice = new TaskService();
		Task newTask = new Task();

		newTask.setTaskName("Dance");
		newTask.setDueDate(LocalDate.of(2023, 11, 28));

		taskservice.update(3, newTask);
	}

	@Test
	public void testDeleteTask() {
		TaskService taskservice = new TaskService();
		taskservice.delete(3);
	}

	@Test
	public void testFindById() {
		TaskService taskservice = new TaskService();

		Task task = taskservice.findById(2);
		System.out.println(task);
	}

	@Test
	public void testFindByDuedate() {
		TaskService taskservice = new TaskService();
		List<Task> task = taskservice.findByDuedate(LocalDate.parse("2023-11-06"));
		
		System.out.println(task);

	}
}
