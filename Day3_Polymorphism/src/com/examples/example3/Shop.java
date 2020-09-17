package com.examples.example3;

import com.examples.example2.Bike;
import com.examples.example2.Car;
import com.examples.interfaces.Accomodities;
import com.examples.interfaces.Automobile;

public class Shop {
	
	public Accomodities getProductType(int key ) {
		switch(key) {
		
		case 1:
			return new Computers("Dell");
		case 2:
			return new Furniture("Chair");
		default:
			return null;
		
		}
	}
	
	
	public void printRent(Accomodities accomodities) {
		
		System.out.println(accomodities.APPNAME);
		System.out.println("No of days rented  :"+ accomodities.getNoOfDaysRented());
		System.out.println("Quantity :"+ accomodities.getQuantity());
		System.out.println("Rate: "+ accomodities.getPrice());
		System.out.println("Rent is : "+ accomodities.getNoOfDaysRented()*accomodities.getQuantity()*accomodities.getPrice());
	}


}
