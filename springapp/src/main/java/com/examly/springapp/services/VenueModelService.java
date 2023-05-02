package com.examly.springapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.VenueModel;
import com.examly.springapp.repositories.VenueModelRepo;

@Service
public class VenueModelService {
@Autowired
private VenueModelRepo venuemodelrepo;
/*Function to add new venues to the system*/
public VenueModel addVenue(VenueModel venuemodel) {
// TODO Auto-generated method stub
return venuemodelrepo.save(venuemodel);
}

/*Function to display the list of all the venues available in the system*/
public List<VenueModel> getVenue() {
// TODO Auto-generated method stub
return venuemodelrepo.findAll();
}

/*Function to update a particular venue based on it's venue id*/
public VenueModel editVenue(VenueModel venuemodel) {

return venuemodelrepo.save(venuemodel);
}
//public void ViewVenue(int venueId) {
//// TODO Auto-generated method stub
//venuemodelrepo.deleteById(venueId);
//}

/*Function to delete a particular venue based on it's venue id*/
public void deleteVenue(int venueId) {
	venuemodelrepo.deleteById(venueId);
}


}
