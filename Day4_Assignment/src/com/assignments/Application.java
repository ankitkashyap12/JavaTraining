package com.assignments;

import com.CustomExceptions.MyCustomException;
import com.CustomExceptions.RangeCheckExceptions;

public class Application {
	
	public static void main(String[] args) {
		Book[] bookarr=new Book[12];
		int i=0;
		
		try {
			Book javaBook=new Book();
			javaBook.setBookId(1);
			javaBook.setBookName("Head First");
			javaBook.setAuthorName("Srivatsan");
			javaBook.setBookPrice(800);
			
			BookService cart= new BookService();
			
			
			cart.addBook(javaBook);
			cart.getOne(1);
			
			Book cBook=new Book();
			cBook.setBookId(321);
			cBook.setAuthorName("Abhishek");
			cBook.setBookName("");
			cBook.setBookPrice(432);
			 int key =1;
			cart.addBook(cBook);
//			cart.addBook(javaBook);
			for(int iter=0;iter<cart.book.length;iter++)
			{
			System.out.println(cart.book[iter]);
			}
			System.out.println(cart.getOne(1));
			 
			 
			
		}
		
		catch (MyCustomException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			System.out.println("ERROR !!");
			
		}
		
		
		
		
	}

}
