package com.covid.main.model;

import java.util.ArrayList;

public class UserCovidInfo {

	private int userId;
	private ArrayList<String> symptoms;
	private boolean travelHistory;
	private boolean contactWithCovidPatient;
	
		
	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public ArrayList<String> getSymptoms() {
		return symptoms;
	}




	public void setSymptoms(ArrayList<String> symptoms) {
		this.symptoms = symptoms;
	}




	public boolean isTravelHistory() {
		return travelHistory;
	}




	public void setTravelHistory(boolean travelHistory) {
		this.travelHistory = travelHistory;
	}




	public boolean isContactWithCovidPatient() {
		return contactWithCovidPatient;
	}




	public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}




	@Override
	public String toString() {
		return "UserCovidInfo [userId=" + userId + ", symptoms=" + symptoms + ", travelHistory=" + travelHistory
				+ ", contactWithCovidPatient=" + contactWithCovidPatient + "]";
	}
	
	
}
