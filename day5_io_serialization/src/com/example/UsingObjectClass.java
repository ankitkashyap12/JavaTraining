package com.example;

import com.example.model.Book;

public class UsingObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book headFirst1=new Book(100,"HeadFirst","someone",450);
		Book headFirst2=new Book(100,"HeadFirst","someone",450);
		Book b=headFirst2;
		System.out.println(b.equals(headFirst1));

		
		System.out.println(headFirst1.equals(headFirst2));

	}

}
