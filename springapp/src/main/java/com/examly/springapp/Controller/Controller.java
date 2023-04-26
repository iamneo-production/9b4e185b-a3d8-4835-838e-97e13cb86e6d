package com.example.cricket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricket.Entites.RefereeModel;
import com.example.cricket.Service.RefereeModelService;

@RestController

public class RefereeModelController {
	@Autowired
	
	private RefereeModelService refereeservice;

	@PostMapping("/addReferee")
	public RefereeModel addReferee(@RequestBody RefereeModel refereemodel) {
		return refereeservice.addReferee(refereemodel);
	}
	@GetMapping("/getReferee")
	public List<RefereeModel> getReferee(){
		return refereeservice.getReferee();
	}
	@PutMapping("/editReferee/{refereeid}")
	public RefereeModel editReferee(@RequestBody RefereeModel refereemodel,@PathVariable("id") int id) {
		return refereeservice.editReferee(refereemodel,id);
	}
	
	@DeleteMapping("/deleteReferee/{refereeid}")
	public void deleteReferee(@PathVariable("id") int id)
	{
		refereeservice.deleteReferee(id);
	}
}
