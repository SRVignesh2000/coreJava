package in.vigneshramachandran.srcatering;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.service.UserService;

public class TestGetAllUser {
	
	
	@Test
	public void testGetAllUsers() {
		UserService userservice = new UserService();
		List<User> userList = new ArrayList<User>(userservice.getAll());
		System.out.println(userList);
		
	}
	
	
	@Test
	public void testUpdate() throws ValidationException {
		UserService userservice = new UserService();
		User newUser = new User();
		
		newUser.setFirstname("Varun");
		newUser.setLastname("Ramachandran");
		newUser.setEmail("vignesh@gmail.com");
		newUser.setPassword("asdf123");
		userservice.update(1, newUser);	
	}
	
	@Test
	public void testDeleteUser() {
		UserService userservice = new UserService();
		
		userservice.delete(3);
	}
	
	@Test
	public void testFindById() {
		UserService userservice = new UserService();
		
		User user = userservice.findById(1);
		System.out.println(user);
	}
	
	@Test
	public void testFindByEmail() {
		UserService userservice = new UserService();
		
		User user = userservice.findByEmail("vignesh@gmail.com");
		System.out.println(user);
	}
		

}
