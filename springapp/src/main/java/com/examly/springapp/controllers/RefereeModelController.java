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

import com.examly.springapp.models.RefereeModel;
import com.examly.springapp.services.RefereeModelService;

@RestController
//@RequestMapping("/referee")
@CrossOrigin(origins="http://localhost:4200")
public class RefereeModelController {
@Autowired
private RefereeModelService refereeservice;

//@PostMapping("/addReferee")
//public RefereeModel addReferee(@RequestBody RefereeModel refereemodel) {
//return refereeservice.addReferees(refereemodel);
//}
@PostMapping("/addReferee")
public RefereeModel addReferee(@RequestBody RefereeModel refereeModel) {
	return refereeservice.addReferee(refereeModel);
}

@GetMapping("/getReferee")
public List<RefereeModel> getReferee(){
return refereeservice.getReferee();
}
@PutMapping("/editReferee/{refereeID}")
public RefereeModel editReferee(@RequestBody RefereeModel refereemodel,@PathVariable int refereeID) {
	refereemodel.setRefereeID(refereeID);
return refereeservice.editReferee(refereemodel);
}
//@DeleteMapping("/deleteReferee/{refereeID}")
//public void deleteReferee(@PathVariable int refereeID)
//{
//refereeservice.deleteReferee(refereeID);
//}

@DeleteMapping("/deleteReferee/{refereeID}")
public void deleteReferee(@PathVariable("refereeID") int refereeID) {
	refereeservice.deleteReferee(refereeID);
}


}
