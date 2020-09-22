package com.assignment;

import java.io.Serializable;

public class CreditCard implements Serializable {
	
	
	private String cardHolderName;
	private int customerId;
	private int cardNumber;
	private transient int cardLimit;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(String cardHolderName, int customerId, int cardNumber, int cardLimit) {
		super();
		this.cardHolderName = cardHolderName;
		this.customerId = customerId;
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(int cardLimit) {
		this.cardLimit = cardLimit;
	}

	@Override
	public String toString() {
		return  cardHolderName + "," +customerId + ","
				+ cardNumber  ;
	}
	
	

}
