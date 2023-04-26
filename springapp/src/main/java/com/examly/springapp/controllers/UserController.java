package com.examly.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.models.UserModel;
import com.examly.springapp.services.LoginService;
import com.examly.springapp.services.UserService;

@RestController
// @ComponentScan("{com.examly.springapp}")
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public UserModel createUser(@RequestBody UserModel user) {
		UserModel newUser=userService.createUser(user);
		
//		Login login=new Login();
//		login.setEmail(user.getEmail());
//		login.setPassword(user.getPassword());
//		loginService.createLogin(login);
		
		return newUser;
	}
}
