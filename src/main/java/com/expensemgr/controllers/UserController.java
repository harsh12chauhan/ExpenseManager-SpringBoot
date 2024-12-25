package com.expensemgr.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensemgr.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	//authenticateuser
	
	//registeruser
	@PostMapping("/register")
	public User registerUser(@RequestBody User user){
		return user;
	}
	
	//getuserdetailbyid
}
