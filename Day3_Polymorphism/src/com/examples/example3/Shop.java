package com.examples.example3;

import com.examples.interfaces.Accomodities;


public class Shop {
	
	public Accomodities getProductType(int key ) {
		switch(key) {
		
		case 1:
			Computers comp= new Computers();
			comp.setItemName("Laptop");
			comp.setRate(21);
		case 2:
			Furniture furniture= new Furniture();
			furniture.setItemType("chair");
			furniture.setRate(234);
		default:
			return null;
		
		}
	}
	
	
	


}
