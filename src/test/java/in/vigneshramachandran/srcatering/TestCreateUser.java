package in.vigneshramachandran.srcatering;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.service.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidInput() {
		UserService userservice = new UserService();
		
		// user 1
		User newUser = new User();
		
		newUser.setId(12223);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("Ramachandran");
		newUser.setEmail("vigneshramachandran@fssa.freshworks.com");
		newUser.setPassword("123asd");
		newUser.setActive(true);
		newUser.toString();
		
		assertDoesNotThrow(() ->{
			userservice.create(newUser);
		} );
		
	}
	@Test
	public void testCreateUserWithInvalidInput() {
		UserService userservice = new UserService();
		
		Exception exception = assertThrows(Exception.class, () -> {
			userservice.create(null);
		});
		String expectedMessage = "Invalid user input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	
	// email test case
	@Test
	public void testCreateUserWithEmailNull() {
		UserService userservice = new UserService();
		
		// user 1
		User newUser = new User();
		
		newUser.setId(12223);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("Ramachandran");
		newUser.setEmail(null);
		newUser.setPassword("123asd");
		newUser.setActive(true);
		newUser.toString();
		
		Exception exception = assertThrows(Exception.class, () -> {
			userservice.create(newUser);
		});
		String expectedMessage = "Email cannot be null";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithEmailEmpty() {
		UserService userservice = new UserService();
		
		// user 1
		User newUser = new User();
		
		newUser.setId(12223);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("Ramachandran");
		newUser.setEmail("");
		newUser.setPassword("123asd");
		newUser.setActive(true);
		newUser.toString();
		
		Exception exception = assertThrows(Exception.class, () -> {
			userservice.create(newUser);
		});
		String expectedMessage = "Email cannot be null";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	


}
