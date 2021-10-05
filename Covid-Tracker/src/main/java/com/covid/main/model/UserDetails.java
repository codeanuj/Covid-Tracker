package com.covid.main.model;

public class UserDetails {

	private String name;
	private String mobileNumber;
	private String pincode;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", mobileNumber=" + mobileNumber + ", pincode=" + pincode + "]";
	}
	
	
}
