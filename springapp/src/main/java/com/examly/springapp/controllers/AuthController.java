package com.examly.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.examly.springapp.models.Login;
import com.examly.springapp.models.User;
import com.examly.springapp.services.LoginService;

@RestController
//@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

	@Autowired
	private LoginService loginService;
	@PostMapping
	public boolean isUserPresent(@RequestBody User user)throws Exception {
		
		return loginService.checkLogin(user);
	}
	
//	@PostMapping
//	public ResponseEntity<String> isUserPresent(@RequestBody User user)throws Exception {
//		
//		
//		 if(loginService.checkLogin(user)) {
//			 return ResponseEntity.ok("Login successfull");
//		 }else {
//		 return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
//		 }
//	}
	
	@PostMapping("/admin")
	public boolean isAdminPresent(@RequestBody User user)throws Exception {
		return loginService.isAdminPresent(user);
	}
}
