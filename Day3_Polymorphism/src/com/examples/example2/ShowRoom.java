package com.examples.example2;
import com.examples.interfaces.Automobile;

public class ShowRoom {
	
	//Factory method- Bases on key passed
	//Returns the object of type Automobile
	
	public Automobile getProduct(int key ) {
		switch(key) {
		
		case 1:
			return new Bike();
		case 2:
			return new Car();
		default:
			return null;
		
		}
	}
	
	
	public void printQuotations(Automobile polyAuto) {
		
		System.out.println(polyAuto.APPNAME);
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getPrice());
	}

}
