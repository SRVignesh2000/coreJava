package in.vigneshramachandran.srcatering.service;

import in.vigneshramachandran.srcatering.dao.TaskDAO;
import in.vigneshramachandran.srcatering.model.Task;

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
	 */
	public void create(Task newTask) {
		
		TaskDAO taskdao = new TaskDAO();
		taskdao.create(newTask);
		
	}
	
	public void update() {
		
		TaskDAO taskdao = new TaskDAO();
		
		Task newTask = new Task();

		newTask.setId(12345);
		newTask.setName("Walking");
		newTask.setDueDate("06-07-2023");
		newTask.setActive(true);
		
		taskdao.update(newTask);
	}
	
	/**
	 * 
	 */
	public void delete() {
		TaskDAO taskdao = new TaskDAO();
		
		Task newTask = new Task();
		
		newTask.setId(12345);
		newTask.setName("Walking");
		newTask.setDueDate("2023-07-06");
		newTask.setActive(true);
		
		taskdao.delete(newTask);
		
	}
	
	
	public void findById(int taskId) {
		
		TaskDAO taskdao = new TaskDAO();
		
		taskdao.findById(taskId);
		
	}
	
	
	
}
