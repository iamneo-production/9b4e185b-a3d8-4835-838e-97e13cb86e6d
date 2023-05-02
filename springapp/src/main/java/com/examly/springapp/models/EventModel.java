package com.examly.springapp.models;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="event")
public class EventModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int eventId;
    private String eventName;
    private String applicantName;
    private String applicantAddress;
    private String refereeName;
    private String venueName;
    private Date eventFromDate;
    private Date eventToDate;
    
	public EventModel() {
		super();
	}

	public EventModel(int eventId, String eventName, String applicantName, String applicantAddress, String refereeName,
			String venueName, Date eventFromDate, Date eventToDate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.refereeName = refereeName;
		this.venueName = venueName;
		this.eventFromDate = eventFromDate;
		this.eventToDate = eventToDate;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getRefereeName() {
		return refereeName;
	}

	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Date getEventFromDate() {
		return eventFromDate;
	}

	public void setEventFromDate(Date eventFromDate) {
		this.eventFromDate = eventFromDate;
	}

	public Date getEventToDate() {
		return eventToDate;
	}

	public void setEventToDate(Date eventToDate) {
		this.eventToDate = eventToDate;
	}

	@Override
	public String toString() {
		return "EventModel [eventId=" + eventId + ", eventName=" + eventName + ", applicantName=" + applicantName
				+ ", applicantAddress=" + applicantAddress + ", refereeName=" + refereeName + ", venueName=" + venueName
				+ ", eventFromDate=" + eventFromDate + ", eventToDate=" + eventToDate + "]";
	}
	
	

	}