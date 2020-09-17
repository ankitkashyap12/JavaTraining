package com.examples.example3;

import java.util.Scanner;

import com.examples.interfaces.Accomodities;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop compShop=new Shop();
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter key:\n 1 for laptop and 2 for furniture \n");
		
		int key = sc.nextInt();
		
		Accomodities selected = compShop.getProductType(key);
		
		if (selected!=null)
		
			{
			compShop.printRent(selected);
			}
		else
			{
				System.out.println("Wrong Arguements");
			}
		sc.close();
	}

}
