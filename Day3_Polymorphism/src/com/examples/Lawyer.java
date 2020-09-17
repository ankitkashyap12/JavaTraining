package com.examples;

public class Lawyer extends ServiceProviders {
	
	private String category;
	private String qualification;
	
	public Lawyer(long phoneNumber, String firstName, String category, String qualification) {
		super(phoneNumber, firstName);
		this.category = category;
		this.qualification = qualification;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		
		double fees=4500.00;
		if(this.category.equalsIgnoreCase("Supreme Court"))
		{
			fees=fees*2;
		}
		return fees;
	}
	
	
	

}
