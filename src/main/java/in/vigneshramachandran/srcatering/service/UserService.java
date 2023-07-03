package in.vigneshramachandran.srcatering.service;

import java.util.Arrays;

import in.vigneshramachandran.srcatering.dao.UserDAO;
import in.vigneshramachandran.srcatering.dao.UserList;
import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.validation.UserValidator;

public class UserService {

	public User[] getAll() {

		UserDAO userdao = new UserDAO();

		User[] userList = userdao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}

//		System.out.println(Arrays.toString(userList));

		return userList;

	}

	public void create(User newUser) throws Exception {
		UserValidator.validate(newUser);
		UserDAO userdao = new UserDAO();

		userdao.create(newUser);

//		userdao.create(newUser1);
	}

	public void update() {// args id, email and user

		UserDAO userdao = new UserDAO();

		User newUser1 = new User();

		newUser1.setId(334455);
		newUser1.setFirstName("SR");
		newUser1.setLastName("Vignesh");
		newUser1.setEmail("maruthanalagar@fssa.freshworks.com");

		userdao.update(newUser1);
	}

	public void delete() {
		UserDAO userdao = new UserDAO();

		User newUser1 = new User();

		newUser1.setId(334455);

		userdao.delete(newUser1);
	}
//
//	public void findById() {
//		UserDAO userdao = new UserDAO();
//
//		int userId = 334455;
//		User findUser = userdao.findById(userId);
//		System.out.println("findUser" + findUser);
//
//	}

}
