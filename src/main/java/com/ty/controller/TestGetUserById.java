package com.ty.controller;

import com.ty.service.UserService;
import com.ty.shopping.dto.User;

public class TestGetUserById {
	public static void main(String[] args) {

		UserService userService = new UserService();

		User users = userService.getUserById(3);
		if (users != null) {
			System.out.println(users.getId());
			System.out.println(users.getName());
			System.out.println(users.getEmail());
			System.out.println(users.getPassword());
			System.out.println(users.getPhone());

		} else {
			System.out.println("user not there to show man");
		}
	}

}
