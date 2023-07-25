package in.vigneshramachandran.srcatering.service;

import java.util.List;

import in.vigneshramachandran.srcatering.dao.UserDAO;
import in.vigneshramachandran.srcatering.exception.ValidationException;
import in.vigneshramachandran.srcatering.model.User;
import in.vigneshramachandran.srcatering.validation.UserValidator;

public class UserService {
	UserDAO userdao = new UserDAO();

	public void create(User user) throws ValidationException, RuntimeException {
		UserValidator.validate(user);
		userdao.create(user);
	}

	public int count() {
		
		return userdao.count();

	}

	public void update(int newId, User newUser) throws ValidationException {

		UserValidator.validate(newUser);

		userdao.update(newId, newUser);

	}

	public void delete(int Id) {

		userdao.delete(Id);

	}

	public User findById(int newId) {

		return userdao.findById(newId);
		

	}

	public User findByEmail(String Email) {

		return userdao.findByEmail(Email);

	}

	public List<User> getAll() {

		return userdao.findAll();

	}

}