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

import com.examly.springapp.models.EventModel;
import com.examly.springapp.services.EventModelService;
 

 

@RestController
@RequestMapping("/event")
@CrossOrigin(origins = "http://localhost:4200")
public class EventModelController {

    @Autowired
    private EventModelService eventmodelservice;
 
//    @PostMapping("/user/bookEvent")
//    public EventModel bookEvent(@RequestBody EventModel eventmodel) {
//        return eventmodelservice.bookEvent(eventmodel);
//    }
    @PostMapping("/user/bookEvent")
    public EventModel bookevent(@RequestBody EventModel eventmodel) {
    	return eventmodelservice.bookEvent(eventmodel);
    }
    @GetMapping("/user/getSchedule")
    public List<EventModel> viewAllEventModel(){
        return eventmodelservice.viewAllEventModel();
    }

//    @PutMapping("/user/editEvent/{eventId}")
//    public EventModel editEvent(@RequestBody EventModel eventmodel,@PathVariable int eventId)
//    {
//    	eventmodel.setEventId(eventId);
//    return eventmodelservice.editevent(eventmodel);
//    }
    	@PutMapping("/user/editEvent/{eventId}")
    	public EventModel editEvent(@PathVariable("eventId") int eventId,@RequestBody EventModel eventmodel) {
    		eventmodel.setEventId(eventId);
    		return eventmodelservice.editevent(eventmodel);
    	}

    @DeleteMapping("/user/deleteEvent/{eventId}")
    public void  deleteEvent(@PathVariable("eventId") int id) {
        eventmodelservice.deleteEvent(id);
    }


}
