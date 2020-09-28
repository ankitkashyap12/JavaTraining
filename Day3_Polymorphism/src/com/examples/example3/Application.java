package com.examples.example3;

import java.util.Scanner;

import com.examples.interfaces.Accomodities;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop shop=new Shop();
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter key:\n 1 for laptop and 2 for furniture \n");
		
		int key = sc.nextInt();
		
		Accomodities selected = shop.getProductType(key);
		int[] rentArray= new int[12];
		int done =1;
		while(done==1)
		{
			System.out.println("Enter the no of days: ");
			int days= sc.nextInt();
			System.out.println("Enter  the quantity: ");
			int quantity=sc.nextInt();
		if (selected!=null)
		
			{
			
			System.out.println("Rental Shop !!");
//			selected.
			
			System.out.println("Rent is: "+ selected.calculateRent());

			}
		else
			{
				System.out.println("Wrong Arguements");
			}
		}
		sc.close();
	}

}
