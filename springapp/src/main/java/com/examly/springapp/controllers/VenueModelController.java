package com.examly.springapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.models.VenueModel;
import com.examly.springapp.services.VenueModelService;
 

 
@RestController
@RequestMapping("/venue")
@CrossOrigin(origins ="http://localhost:4200")
public class VenueModelController {
    @Autowired
    private VenueModelService venuemodelservice;
    @PostMapping("/addVenue")
    public VenueModel addVenue(@RequestBody VenueModel venuemodel) {
    return venuemodelservice.addVenue(venuemodel);
    }
    @GetMapping("/getVenue")
    public List<VenueModel> getVenue()
    {
    return venuemodelservice.getVenue();
    }
//    @PutMapping("/editVenue/{venueId} ")
//    public VenueModel editVenue(@RequestBody VenueModel venuemodel,@PathVariable int id)
//    {
//    	venuemodel.setVenueId(id);
//    return venuemodelservice.editVenue(venuemodel);
//    }
    @PutMapping("/editVenue/{venueId}")
    public VenueModel editVenue(@PathVariable("venueId") int venueId,@RequestBody VenueModel venuemodel) {
    	venuemodel.setVenueId(venueId);
    	return venuemodelservice.editVenue(venuemodel);
    }
    @DeleteMapping("/deleteVenue/{venueId}")
    public void deleteVenue(@PathVariable("venueId") int venueId) {
    	venuemodelservice.deleteVenue(venueId);
    }


}
