package com.examples;

public class Billing {
	
	public void printFees(ServiceProviders provider) {
		
		System.out.println(provider.calculateFees()+ "\n\n");
	}

}
