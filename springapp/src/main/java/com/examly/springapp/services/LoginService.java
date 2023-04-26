package com.examly.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.UserModel;
import com.examly.springapp.repositories.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	
	public boolean checkLogin(UserModel user){
		UserModel foundLogin=loginRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(foundLogin!=null) {
		if(foundLogin.getUserRole().equals("Organizer")) {
			return true;
		}
		else {
			return false;
		}
	}
		else
		{
			return false;
		}
	}
	public boolean isAdminPresent(UserModel user) {
		UserModel foundLogin=loginRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(foundLogin!=null) {
		if(foundLogin.getUserRole().equals("Admin")) {
			return true;
		}
		else
			return false;
	}
		else
			return false;
	}
	
}

