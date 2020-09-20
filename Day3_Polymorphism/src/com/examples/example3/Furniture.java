package com.examples.example3;

import com.examples.interfaces.Accomodities;

public class Furniture implements Accomodities {
	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}




	private String itemType;
	private int quantity;
	private int rate;
	private int noOfDays;
	
	


	public Furniture(String itemType, int quantity, int rate, int noOfDays) {
		super();
		this.itemType = itemType;
		this.quantity = quantity;
		this.rate = rate;
		this.noOfDays = noOfDays;
	}




	public String getItemType() {
		return itemType;
	}




	public void setItemType(String itemType) {
		this.itemType = itemType;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public int getRate() {
		return rate;
	}




	public void setRate(int rate) {
		this.rate = rate;
	}




	public int getNoOfDays() {
		return noOfDays;
	}




	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}




	@Override
	public int calculateRent() {
		// TODO Auto-generated method stub
		return this.getNoOfDays()*this.getQuantity()*this.getRate();
	}

}
