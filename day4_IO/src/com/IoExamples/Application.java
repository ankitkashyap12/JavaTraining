package com.IoExamples;

import java.io.File;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Customer Suresh= new Customer("12", "suresh", 989087, "ui");
//		
		Firstexample service = new Firstexample();
//		service.writetoFile(new File ("customer.txt"), Suresh);
//		System.out.println("done");
		
		
		service.readFromFile(new File ("customer.txt"));

	}

}
