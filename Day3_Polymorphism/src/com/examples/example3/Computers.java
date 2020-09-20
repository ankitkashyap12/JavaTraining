package com.examples.example3;

import com.examples.interfaces.Accomodities;

public class Computers implements Accomodities {
	private String itemName;
	private int quantity;
	private int rate;
	private int noOfDays;
	
	


	public Computers(String itemName, int quantity, int rate, int noOfDays) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.rate = rate;
		this.noOfDays = noOfDays;
	}
	
	








	public Computers() {
		super();
		// TODO Auto-generated constructor stub
	}










	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
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
		return this.noOfDays*this.quantity*this.rate;
	}

}
