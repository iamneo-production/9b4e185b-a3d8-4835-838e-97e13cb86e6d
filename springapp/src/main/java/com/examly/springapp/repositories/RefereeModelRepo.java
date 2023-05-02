package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.RefereeModel;

@Repository
public interface RefereeModelRepo extends JpaRepository<RefereeModel,Integer> {

	Object findByRefereeName(String refereeName);


}
