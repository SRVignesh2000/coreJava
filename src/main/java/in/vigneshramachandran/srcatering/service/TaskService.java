package in.vigneshramachandran.srcatering.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.vigneshramachandran.srcatering.dao.TaskDAO;
import in.vigneshramachandran.srcatering.model.Task;
import in.vigneshramachandran.srcatering.validation.TaskValidator;

public class TaskService {

	/**
	 * 
	 * @return
	 */
	public Task[] getAll() {
		
		TaskDAO taskdao = new TaskDAO();
		
		Task[] tasklist = taskdao.findAll();
		
		for(int i=0; i<tasklist.length; i++) {
			System.out.println(tasklist[i]);
		}
		
		return tasklist;
	}
	
	/**
	 * 
	 * @param newTask
	 * @throws Exception 
	 */
	public void create(Task newTask) throws Exception {
		// validation
		TaskValidator.validate(newTask);
		
		TaskDAO taskdao = new TaskDAO();		
		taskdao.create(newTask);
		
	}
	
	public static LocalDate convertToDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		try {
			LocalDate localDate = LocalDate.parse(date, formatter);
			return localDate;
		} catch (Exception e) {
			System.out.println("Invalid date format!");
			return null;
		}
	}
	
	public void update() throws Exception {
		
		TaskDAO taskdao = new TaskDAO();
		
		Task newTask = new Task();

		newTask.setId(12345);
		newTask.setName("Walking");
		String date = "06-07-2023";
		convertToDate(date);
		newTask.setActive(true);
		
		TaskValidator.validate(newTask);
		
		taskdao.update(newTask);
	}
	
	/**
	 * 
	 */
	public void delete() {
		TaskDAO taskdao = new TaskDAO();
		
		Task newTask = new Task();
		
		newTask.setId(12345);
		
		taskdao.delete(newTask);
		
	}
	
	
	public void findById(int taskId) {
		
		TaskDAO taskdao = new TaskDAO();
		
		taskdao.findById(taskId);
	}
	
	
	
}
