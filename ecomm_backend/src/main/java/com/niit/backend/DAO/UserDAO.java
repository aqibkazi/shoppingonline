package com.niit.backend.DAO;

import java.util.List;

public interface UserDAO {
	
	List<UserDAO> list();
	UserDAO getUser(int id);
	UserDAO getByUserName(String userName);
	boolean addUser(UserDAO user);
	boolean deleteUser(UserDAO user);
	boolean updateUser(UserDAO user);
	boolean isValidate(String userName, String password);
}


