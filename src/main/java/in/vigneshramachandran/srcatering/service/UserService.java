package in.vigneshramachandran.srcatering.service;

import java.util.Arrays;

import in.vigneshramachandran.srcatering.dao.UserDAO;
import in.vigneshramachandran.srcatering.dao.UserList;
import in.vigneshramachandran.srcatering.model.User;

public class UserService {
	
	public User[] getAll() {
	
		UserDAO userdao = new UserDAO();
		
		User[] userList =  userdao.findAll();
		
//		for(int i=0; i<userList.length; i++) {
//			System.out.println(userList[i]);
//		}
		
//		System.out.println(Arrays.toString(userList));
		System.out.println(userList[0]);
		
		return userList;
		
	}
	
	public void create() {
		
		UserDAO userdao = new UserDAO();
		User newUser = new User();
		
		newUser.setId(12223);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("Ramachandran");
		newUser.setEmail("vigneshramachandran@fssa.freshworks.com");
		newUser.setPassword("123asd");
		newUser.setActive(true);
		newUser.toString();
		

		userdao.create(newUser);
		
	}
	


}
