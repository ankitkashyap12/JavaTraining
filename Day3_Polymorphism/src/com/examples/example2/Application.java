package com.examples.example2;

import com.examples.interfaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowRoom carShop= new NewShowRoom();
//		NewShowRoom tractorShop = new NewShowRoom();
		
		Scanner sc= new Scanner(System.in);
		int done=1;
		
		while(done==1) {
			
			System.out.println("Please enter key:\n ");
			
			int key = sc.nextInt();
			
			Automobile selected = carShop.getProduct(key);
			
			if (selected!=null)
			
				{
				carShop.printQuotations(selected);
				}
			else
				{
					System.out.println("Wrong Arguements");
				}
			
			System.out.println("please enter : 0 or 1 \n");
			
			int option =sc.nextInt();
			done=option;
		}
		
	}
		

}
