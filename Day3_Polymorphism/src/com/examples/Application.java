package com.examples;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lawyer bhushan=new Lawyer(23345,"Prashant Bhushan", "Supreme Court", "LLB");
		
		Musician prateek= new Musician(98766, "Prateek", "tabla", "Bihar");
		
		Billing bill= new Billing();
		bill.printFees(bhushan);
		bill.printFees(prateek);

	}

}