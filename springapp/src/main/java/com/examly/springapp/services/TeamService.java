package com.examly.springapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.TeamModel;
import com.examly.springapp.repositories.TeamRepo;

@Service
public class TeamService{
@Autowired
private TeamRepo teamRepo;

/*Function to add new team into the system*/
public TeamModel addTeamModel(TeamModel team) {
return teamRepo.save(team);
}
/*Function to display all the teams available in the system*/
public List<TeamModel> getteam() {
return teamRepo.findAll();
}
/*Function to edit a particular team on the basis of it's team id*/
public TeamModel editTeam(TeamModel team) {
return teamRepo.save(team);
}
/*Function to delete a particular team on the basis of it's team id*/
public void deleteTeam(int teamId) {
teamRepo.deleteById(teamId);
}


}
