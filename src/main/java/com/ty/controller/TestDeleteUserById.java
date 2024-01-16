package com.ty.controller;

import com.ty.service.UserService;
import com.ty.shopping.dto.User;

public class TestDeleteUserById {
	public static void main(String[] args) {
		UserService userService=new UserService();
		boolean user=userService.deleteUserById(10);
		if(user!=false) {
			System.out.println("yes user deleted");
		}
		else {
			System.out.println("user is not there to delete");
		}
	}

}
