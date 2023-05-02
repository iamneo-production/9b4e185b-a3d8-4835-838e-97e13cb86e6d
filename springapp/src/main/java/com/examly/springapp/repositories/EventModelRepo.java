package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.EventModel;
 
 
@Repository
public interface EventModelRepo extends JpaRepository<EventModel,Integer> {


}
