package com.examly.springapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Team")
public class TeamModel{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name = "teamId")
int teamId;
@Column(name = "teamName")
String teamName;
@Column(name = "no_of_players")
int nofplayers;
@Column(name = "Captain")
String teamcaptain;
@Column(name = "ViceCaptain")
String teamvicecaptain;
@Column(name="Location")
String teamlocation;
public TeamModel() {
super();
// TODO Auto-generated constructor stub
}
public TeamModel(int teamId, String teamName, int nofplayers, String teamcaptain, String teamvicecaptain,
String teamlocation) {
super();
this.teamId = teamId;
this.teamName = teamName;
this.nofplayers = nofplayers;
this.teamcaptain = teamcaptain;
this.teamvicecaptain = teamvicecaptain;
this.teamlocation = teamlocation;
}
public int getTeamId() {
return teamId;
}
public void setTeamId(int teamId) {
this.teamId = teamId;
}
public String getTeamName() {
return teamName;
}
public void setTeamName(String teamName) {
this.teamName = teamName;
}
public int getNofplayers() {
return nofplayers;
}
public void setNofplayers(int nofplayers) {
this.nofplayers = nofplayers;
}
public String getTeamcaptain() {
return teamcaptain;
}
public void setTeamcaptain(String teamcaptain) {
this.teamcaptain = teamcaptain;
}
public String getTeamvicecaptain() {
return teamvicecaptain;
}
public void setTeamvicecaptain(String teamvicecaptain) {
this.teamvicecaptain = teamvicecaptain;
}
public String getTeamlocation() {
return teamlocation;
}
public void setTeamlocation(String teamlocation) {
this.teamlocation = teamlocation;
}
@Override
public String toString() {
return "TeamModel [teamId=" + teamId + ", teamName=" + teamName + ", nofplayers=" + nofplayers
+ ", teamcaptain=" + teamcaptain + ", teamvicecaptain=" + teamvicecaptain + ", teamlocation="
+ teamlocation + "]";
}

}
