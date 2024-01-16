package com.ty.controller;

import com.ty.service.UserService;
import com.ty.shopping.dto.User;

public class TestUserUpdate {
	public static void main(String[] args) {
		User user=new User();
		user.setId(6);
		user.setName("anwesha");
		user.setEmail("anwesha@gmail.com");
		user.setPassword("anu1234");
		user.setPhone(9966333366l);
		UserService userService=new UserService();
		userService.updateUserById(user);
		if(user!=null) {
			System.out.println("updated");
		}
		else {
			System.out.println("there is no user to update");
		}
	}

}
