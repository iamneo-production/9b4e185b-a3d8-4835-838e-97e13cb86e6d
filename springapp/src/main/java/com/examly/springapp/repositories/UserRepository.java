package com.examly.springapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findByEmailAndUsername(String email, String username);


}
