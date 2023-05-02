package com.examly.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.User;
import com.examly.springapp.repositories.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	/*Function to verify whether the credentials entered by the user is present or not.
	 * If the credentials are present then it verifies whether the credentials matches with an organizer or not*/
	public boolean checkLogin(User user)throws Exception{
		User foundLogin=loginRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
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
	
	/*Function to verify whether the credentials entered by the user is present or not.
	 * If the credentials are present then it verifies whether the credentials matches with that of an admin or not */
	public boolean isAdminPresent(User user)throws Exception {
		User foundLogin=loginRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
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
