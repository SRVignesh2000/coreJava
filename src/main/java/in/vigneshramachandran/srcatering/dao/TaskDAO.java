package in.vigneshramachandran.srcatering.dao;

import in.vigneshramachandran.srcatering.model.Task;
import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.service.TaskService;

public class TaskDAO {

	/**
	 * 
	 * @return
	 */
	public Task[] findAll() {
		Task[] taskLists = TaskList.listOfTasks;
		return taskLists;
	}

	/**
	 * 
	 * @param newTask
	 */
	public void create(Task newTask) {
		Task[] arr = TaskList.listOfTasks;

		for (int i = 0; i < arr.length; i++) {
			Task task = arr[i];
			if (task == null) {
				arr[i] = newTask;
				break;
			}
		}
	}

	/**
	 * 
	 * @param newTask
	 */
	public void update(Task newTask) {

		Task[] arr = TaskList.listOfTasks;

		for (int i = 0; i < arr.length; i++) {
			Task task = arr[i];
			if (task == null) {
				continue;
			}
			if (task.getId() == newTask.getId()) {
				task.setName(newTask.getName());
				break;
			}

		}
	}

	/**
	 * 
	 * @param newTask
	 */
	public void delete(Task newTask) {
		Task[] arr = TaskList.listOfTasks;

		for (int i = 0; i < arr.length; i++) {
			Task task = arr[i];
			if (task == null) {
				continue;
			}
			if (task.getId() == newTask.getId()) {
				task.setActive(false);
				break;
			}

		}
	}

	
	public Task findById(int taskId) {

		Task[] arr = TaskList.listOfTasks;
		Task taskMatch = null;

		for (int i = 0; i < arr.length; i++) {

			Task task = arr[i];

			if (task.getId() == taskId) {
				taskMatch = task;
				break;
			}
		}
		System.out.println("taskMatch" + taskMatch);
		return taskMatch;

	}

}
