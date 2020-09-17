package com.examples.example3;

import com.examples.interfaces.Accomodities;

public class Computers implements Accomodities {
	String itemName;
	
	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Computers(String itemName) {
		super();
		this.itemName = itemName;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getNoOfDaysRented() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if(this.getItemName().equalsIgnoreCase("Laptop"))
		{
			return 500;
		}
		return 250;
	}

}
