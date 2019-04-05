package com.bridgelabz.dao;

import com.bridgelabz.model.User;

public interface UserDao {

	public User login(String userName,String password);
	public int registerUser(User user);
	public int resetPassword(String userName,String  emailId,String password, String newPassword);
	
}
