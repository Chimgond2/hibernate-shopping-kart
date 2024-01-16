package com.ty.controller;

import com.ty.service.UserService;
import com.ty.shopping.dto.User;

public class TestSaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("shruthi");
		user.setEmail("shruthi@gmail.com");
		user.setPassword("shru123");
		user.setPhone(9988776655l);
		UserService userService = new UserService();
		userService.saveUser(user);
		if (user != null) {
			System.out.println("user saved successfully");
		} else {
			System.out.println("user data is not inserted");
		}
	}

}
