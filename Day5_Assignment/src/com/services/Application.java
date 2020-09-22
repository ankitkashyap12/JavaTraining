package com.services;

import java.io.File;
import java.util.ArrayList;

import com.assignment.CreditCard;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard visa= new CreditCard("Ankit", 171, 98516, 300);
		CreditCard master= new CreditCard("jshjha", 111, 45116, 2000);
		CreditCard rupay= new CreditCard("xyz", 191, 655436, 9000);
		Services service= new Services();
		
		CreditCard[] cardList= {visa,master,rupay};
		
		
		boolean result=service.storeDetails(cardList); // writeToObject
		if(result) {
			System.out.println("Stored Sucessfully  ");
		}
		else {
			System.out.println("Error !!  ");
		}
		System.out.println(service.storeDetails(new File("card.txt"), cardList)); //writeToFile
		
		System.out.println("de serialize  "+ service.read());
		
		CreditCard[] cards = service.readFromFile(new File("card.txt"));
		System.out.println(cards.length);
		
//		for(CreditCard c:cards) {
//			System.out.println("to string   "+ c.toString());
//		}
		service.delete(cards, "Ankit");
		

		
		

	}

}
