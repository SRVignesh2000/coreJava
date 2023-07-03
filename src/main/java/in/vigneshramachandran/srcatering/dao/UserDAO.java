package in.vigneshramachandran.srcatering.dao;

import in.vigneshramachandran.srcatering.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	/**
	 * 
	 * @param newUser
	 */
	public void create(User newUser) {/**enter**/
		
		User[] arr = UserList.listOfUsers;
		for(int i=0; i<arr.length; i++) {
			User user = arr[i];
			if(user == null) {
				arr[i] = newUser;
				break;
			}
		}

	}
	
	/**
	 * 
	 * @param newUser1
	 */
	public void update(User newUser1) {
		
		User[] arr = UserList.listOfUsers;
		
		for (int i =0; i<arr.length; i++) {
			User user = arr[i];
			
			if(user == null) {
				continue;
			}
			if(user.getId() == newUser1.getId()) {
				user.setFirstName(newUser1.getFirstName());
				user.setLastName(newUser1.getLastName());
				break;
			}
		}
		
	}
	
	/**
	 * 
	 * @param newUser1
	 */
	public void delete(User newUser1) {
		User[] arr = UserList.listOfUsers;
		
		for(int i=0; i<arr.length; i++) {
			
			User user = arr[i];
			
			if(user == null) {
				continue;
			}
			if(user.getId() == newUser1.getId()) {
				user.setActive(false);
				break;
			}
		}
	}
	
//	public User findById(int userId) {
//		
//		User[] arr = UserList.listOfUsers;
//		User userMatch = null;
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			User user = arr[i];
//			
//			if(user.getId() == userId) {
//				userMatch = user;
//				break;
//			}
//		}
//		return userMatch;
//		
//	}
	
	
}
