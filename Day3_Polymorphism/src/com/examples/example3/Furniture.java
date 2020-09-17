package com.examples.example3;

import com.examples.interfaces.Accomodities;

public class Furniture implements Accomodities {
	String itemType;
	
	
	
	public Furniture(String itemType) {
		super();
		this.itemType = itemType;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getNoOfDaysRented() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (this.itemType.equalsIgnoreCase("chair"))
		{
			return 340;
		}
		else
		{
		return 450;
		}
	}

}
