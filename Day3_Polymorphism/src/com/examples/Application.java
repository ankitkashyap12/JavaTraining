package com.examples;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lawyer bhushan=new Lawyer(23345,"Prashant Bhushan", "Supreme Court", "LLB");
		
		Musician prateek= new Musician(98766, "Prateek", "tabla", "Bihar");
		
		Billing bill= new Billing();
		bill.printFees(bhushan);
		bill.printFees(prateek);
		
		
		WrappersAndStatic obj= new WrappersAndStatic();
		System.out.println(obj.parse("1234"));
		System.out.println(obj.useToString(123).length());
//		System.out.println(obj.toString(345));

	}

}