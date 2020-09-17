package com.examples;

public class Musician extends ServiceProviders {

	private String instrument;
	private String location;
	
	
	
	public Musician(long phoneNumber, String firstName, String instrument, String location) {
		super(phoneNumber, firstName);
		this.instrument = instrument;
		this.location = location;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		double fees=5000;
		
		if(this.instrument.equalsIgnoreCase("Tabla") || this.location.equalsIgnoreCase("Bihar")) {
			fees=10000;
		}
		return fees;
	}
	
	
}
