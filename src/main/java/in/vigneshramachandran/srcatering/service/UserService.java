package in.vigneshramachandran.srcatering.service;

import java.util.Arrays;

import in.vigneshramachandran.srcatering.dao.UserDAO;
import in.vigneshramachandran.srcatering.model.User;

public class UserService {
	
	public User[] getAll() {
	
		UserDAO userdao = new UserDAO();
		
		User[] userList =  userdao.findAll();
		
//		for(int i=0; i<userList.length; i++) {
//			System.out.println(userList[i]);
//		}
		
		System.out.println(Arrays.toString(userList));
		
		return userList;
		
	}
	


}
