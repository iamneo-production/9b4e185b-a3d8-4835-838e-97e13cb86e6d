package com.examly.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.EventModel;
import com.examly.springapp.models.User;
import com.examly.springapp.repositories.EventModelRepo;
import com.examly.springapp.repositories.RefereeModelRepo;
import com.examly.springapp.repositories.VenueModelRepo;
 

@Service
public class EventModelService {
    @Autowired
    private EventModelRepo eventmodelrepo;
    
    @Autowired
    private RefereeModelRepo refereeModelRepo;
    
    @Autowired
    private VenueModelRepo venueModelRepo;
    
    /*Function is to verify whether the referee name and venue name entered by the user
     * is present in the database or not.*/
    public EventModel bookEvent(EventModel eventmodel) {
    	if(venueModelRepo.findByVenueName(eventmodel.getVenueName())!=null) {
    		if(refereeModelRepo.findByRefereeName(eventmodel.getRefereeName())!=null) {
    			return eventmodelrepo.save(eventmodel);
    		}
    		else {
    			return null;
    		}
    	}
		else
			return null;
	}
    
    /*Function to display the list of all the events created*/
    public List<EventModel> viewAllEventModel() {
        return eventmodelrepo.findAll();
    }
 
    /*Function to update any particular event present based on it's event id*/
    public EventModel editevent(EventModel eventmodel) {
        // TODO Auto-generated method stub
        return eventmodelrepo.save(eventmodel);
    }
 
    /*Function to delete a particular event based on it's event id*/
    public void deleteEvent(int id) {
        eventmodelrepo.deleteById(id);

    }
 

//    public EventModel editevent(EventModel eventmodel) {
//        // TODO Auto-generated method stub
//        return eventmodelrepo.save(eventmodel);
//    }

}
