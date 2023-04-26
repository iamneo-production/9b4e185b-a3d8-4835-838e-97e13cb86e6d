package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.UserModel;

@Repository
public interface LoginRepository extends JpaRepository<UserModel,Integer> {
	
	UserModel findByEmailAndPassword(String email, String password);
}