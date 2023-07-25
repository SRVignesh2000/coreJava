package in.vigneshramachandran.srcatering;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

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
	public void testFindById() {
		UserService userservice = new UserService();
		
		User user = userservice.findById(1);
		System.out.println(user);
	}

}
