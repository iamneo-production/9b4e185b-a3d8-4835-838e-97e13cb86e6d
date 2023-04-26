package com.examly.springapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {


}
