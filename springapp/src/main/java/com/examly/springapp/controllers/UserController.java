package com.examly.springapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.examly.springapp.models.Login;
import com.examly.springapp.models.User;
import com.examly.springapp.services.LoginService;
import com.examly.springapp.services.UserService;

@RestController
//@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) throws Exception {
		User newUser=userService.createUser(user);
		
//		Login login=new Login();
//		login.setEmail(user.getEmail());
//		login.setPassword(user.getPassword());
//		loginService.createLogin(login);
		
		return newUser;
	}
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id")int id)throws Exception {
		userService.deleteUser(id);
	}
	
	@PutMapping("/user/editUser/{id}")
	public User updateUser(@RequestBody User user, @PathVariable("id") int id)throws Exception {
		user.setUserId(id);
		return userService.updateUser(user);
	}
}
