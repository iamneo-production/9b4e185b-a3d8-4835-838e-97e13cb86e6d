package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.VenueModel;

@Repository
public interface VenueModelRepo extends JpaRepository<VenueModel,Integer>{

	Object findByVenueName(String venueName);


}
