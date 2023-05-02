package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="venues")
public class VenueModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int venueId;
    String venueName;
    String venueImageURL;
    String venueDescription;
    String venueLocation;
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getVenueImageURL() {
		return venueImageURL;
	}
	public void setVenueImageURL(String venueImageURL) {
		this.venueImageURL = venueImageURL;
	}
	public String getVenueDescription() {
		return venueDescription;
	}
	public void setVenueDescription(String venueDescription) {
		this.venueDescription = venueDescription;
	}
	public String getVenueLocation() {
		return venueLocation;
	}
	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}
	@Override
	public String toString() {
		return "VenueModel [venueId=" + venueId + ", venueName=" + venueName + ", venueImageURL=" + venueImageURL
				+ ", venueDescription=" + venueDescription + ", venueLocation=" + venueLocation + "]";
	}
	public VenueModel(int venueId, String venueName, String venueImageURL, String venueDescription,
			String venueLocation) {
		super();
		this.venueId = venueId;
		this.venueName = venueName;
		this.venueImageURL = venueImageURL;
		this.venueDescription = venueDescription;
		this.venueLocation = venueLocation;
	}
	public VenueModel() {
		super();
		// TODO Auto-generated constructor stub
	}
 
    
}