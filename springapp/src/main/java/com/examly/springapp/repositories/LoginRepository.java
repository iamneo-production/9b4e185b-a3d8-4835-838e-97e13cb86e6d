package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.examly.springapp.models.Login;
import com.examly.springapp.models.User;

@Repository
public interface LoginRepository extends JpaRepository<User,Integer> {
	
	User findByEmailAndPassword(String email, String password);
//	Login findByEmail(String email,String password);
}
