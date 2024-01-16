package com.ty.controller;

import com.ty.service.UserService;
import com.ty.shopping.dto.User;

public class TestValidateUser {
	public static void main(String[] args) {
		UserService userService=new UserService();
		User user=userService.validateUser("shruthi@gmail.com", "shru123");
		if(user!=null) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println(user.getPhone());

		}
		else {
			System.out.println("email are password is wrong");
		}
	}

}
