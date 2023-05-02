package com.examly.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.User;
import com.examly.springapp.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/*Function to register a new user into our system.
	 * First it verifies whether the email and password which is being used is already present in the system or not*/
	public User createUser(User user) throws Exception {
		User foundRegister=userRepository.findByEmailAndUsername(user.getEmail(), user.getUsername());
		if(foundRegister==null)
		return userRepository.save(user);
		else
			return null;
	}
	
	/*Function to show all the user details(Future prospect for admins only)*/
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	/*Function to delete a particular user details on the basis of user id(Future prospect for admins only)*/
	public void deleteUser(int id)throws Exception {
		userRepository.deleteById(id);
	}
	
	/*Function to update a particular user details of the basis of user id(Future prospect for individual user only)*/
	public User updateUser(User user)throws Exception {
		return userRepository.save(user);
	}
}
