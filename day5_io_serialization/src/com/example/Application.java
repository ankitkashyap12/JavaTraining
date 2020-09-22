package com.example;

import java.io.File;

import com.example.model.Book;
import com.example.services.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book headFirst= new Book(113, "HeadFirst java", "someone", 220);
		BookService service= new BookService();
//		boolean result=service.writeObject(headFirst);
//		if(result) {
//			System.out.println("Book persisted");
//		}
//		else {
//			System.out.println("Error !!");
//		}
		System.out.println("de serializing:  "+ service.readObject());
		boolean written= service.writeWithDataStream(headFirst, new File ("book1.ser"));
		if (written)
		{
			System.out.println("File written");
		}
		
//		headFirst.readObject()
		

	}

}
