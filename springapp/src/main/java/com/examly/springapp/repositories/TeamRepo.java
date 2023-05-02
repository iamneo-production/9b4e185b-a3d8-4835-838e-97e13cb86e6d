package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.TeamModel;

@Repository
public interface TeamRepo extends JpaRepository<TeamModel,Integer>{


}
