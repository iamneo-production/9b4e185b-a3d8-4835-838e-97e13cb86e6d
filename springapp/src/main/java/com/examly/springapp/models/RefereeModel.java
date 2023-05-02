package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Referee")
public class RefereeModel {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int refereeId;
String refereeName;
int noOfMatches;
public int getRefereeID() {
return refereeId;
}
public void setRefereeID(int refereeID) {
this.refereeId = refereeID;
}
public String getRefereeName() {
return refereeName;
}
public void setRefereeName(String refereeName) {
this.refereeName = refereeName;
}
public int getNoOfMatches() {
return noOfMatches;
}
public void setNoOfMatches(int noOfMatches) {
this.noOfMatches = noOfMatches;
}
public RefereeModel() {
super();
// TODO Auto-generated constructor stub
}
public RefereeModel(int refereeID, String refereeName, int noOfMatches) {
super();
this.refereeId = refereeID;
this.refereeName = refereeName;
this.noOfMatches = noOfMatches;
}
@Override
public String toString() {
return "RefereeModel [refereeID=" + refereeId + ", refereeName=" + refereeName + ", noOfMatches=" + noOfMatches
+ "]";
}


}
