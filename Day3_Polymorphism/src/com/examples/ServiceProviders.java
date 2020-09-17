package com.examples;

public abstract class ServiceProviders {
	
	private long phoneNumber;
	private String firstName;
	public ServiceProviders(long phoneNumber, String firstName) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public abstract double calculateFees();

}
