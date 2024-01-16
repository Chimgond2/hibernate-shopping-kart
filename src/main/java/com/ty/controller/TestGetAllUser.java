package com.ty.controller;

import java.util.List;

import com.ty.service.UserService;
import com.ty.shopping.dto.User;

public class TestGetAllUser {
	public static void main(String[] args) {
		UserService userService=new UserService();
		List<User> user=userService.getAllUser();
		for(User users:user){
			System.out.println(users.getId());
			System.out.println(users.getEmail());
			System.out.println(users.getName());
			System.out.println(users.getPassword());
			System.out.println(users.getPhone());
			System.out.println("====================");
		}
	}

}
