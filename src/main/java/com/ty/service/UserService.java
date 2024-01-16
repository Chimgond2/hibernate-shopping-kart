package com.ty.service;

import java.util.List;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class UserService {
	UserDao userDao = new UserDao();

	public User saveUser(User user) {

		return userDao.saveUser(user);
	}

	public User getUserById(int id) {

		return userDao.getUserById(id);
	}

	public List<User> getAllUser() {
		return userDao.getAllUser();

	}

	public User validateUser(String email, String password) {

		return userDao.validateUser(email, password);

	}

	public boolean deleteUserById(int id) {

		return userDao.deleteUserById(id);

	}

	public User updateUserById(User user) {

		return userDao.updateUserById(user);

	}

}
