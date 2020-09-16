package com.examples;

public class Application {

	public static void main(String[] args) {
		
		Insurance person=new Insurance(1234, "Ankit", 21, 3500.0);
		System.out.println("Total premium is : "+person.calculatePremium()+"\n");
		
		
	VehicleInsurance bike= new VehicleInsurance(322, "Ankit", 21, 15500, "Two Wheeler", 2016, 75000);
	System.out.println("your vehicle model is : "+bike.getVehicleModel()+ " premium is : "+ bike.calculatePremium()+" year of manufacture : "+bike.getYearOfManufacture()+"\n");
	
	VehicleInsurance hyundai= new VehicleInsurance(675, "Ekant", 34, 79000, "Four wheeler", 2019, 105000);
	System.out.println("your vehicle model is : "+hyundai.getVehicleModel()+ " premium is : "+ hyundai.calculatePremium()+" Year of manufacture : "+hyundai.getYearOfManufacture()+"\n");
	
	
	}
	
}
