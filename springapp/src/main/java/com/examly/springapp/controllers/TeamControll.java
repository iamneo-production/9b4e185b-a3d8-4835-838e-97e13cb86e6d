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

import com.examly.springapp.models.TeamModel;
import com.examly.springapp.services.TeamService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/Team")
public class TeamControll{
@Autowired
private TeamService teamService;
@PostMapping("/addTeam")
public TeamModel addteam(@RequestBody TeamModel team)
{
return teamService.addTeamModel(team);
}
@GetMapping("/getTeam")
public List<TeamModel> getteam(){
return teamService.getteam(); 
}
@PutMapping("/editTeam/{teamId}")
public TeamModel setteamId(@RequestBody TeamModel team, @PathVariable("teamId")int teamId)
{
	team.setTeamId(teamId);
return teamService.editTeam(team);
}
@DeleteMapping("/deleteTeam/{teamId}")
public void deleteteam(@PathVariable("teamId")int teamId)
{
teamService.deleteTeam(teamId);
}


}
