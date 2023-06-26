package in.vigneshramachandran.srcatering.dao;

import in.vigneshramachandran.srcatering.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	public void create() {
		User newUser = new User();
		newUser.setId(12223);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("Ramachandran");
		newUser.setEmail("vigneshramachandran@fssa.freshworks.com");
		newUser.setPassword("123asd");
		newUser.setActive(true);
		
		UserList.listOfUsers[0] = newUser;
	}
	
	public void update() {
		
	}
	

}
