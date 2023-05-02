package com.examly.springapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.RefereeModel;
import com.examly.springapp.repositories.RefereeModelRepo;

@Service
public class RefereeModelService {
@Autowired
private RefereeModelRepo refereerepo;

//public RefereeModel addReferees(RefereeModel refereemodel) {
//return refereerepo.save(refereemodel);
//}
/*Function to add new referee into the system. Only accessible by admin*/
public RefereeModel addReferee(RefereeModel refereeModel) {
	return refereerepo.save(refereeModel);
}

/*Function to display all the referees present in the system.*/
public List<RefereeModel> getReferee() {
// TODO Auto-generated method stub
return refereerepo.findAll();
}

/*Function to update a referee details based on the referee id*/
public RefereeModel editReferee(RefereeModel refereemodel) {
// TODO Auto-generated method stub
return refereerepo.save(refereemodel);
}

/*Function to delete a referee details based on the referee id */
public void deleteReferee(int refereeID) {
// TODO Auto-generated method stub
refereerepo.deleteById(refereeID);
}


}
