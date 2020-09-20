package com.assignments;

import java.util.NoSuchElementException;

public class BookService {
	
	Book[] book =new Book[3];
	int i=0;
	
	public Book[] addBook(Book bk)
	{
		book[i++]=bk;
		return book;
	}
	
	public Book getOne(int id) throws NoSuchElementException

	{
		
		for(int j=0;j<book.length;j++)
		{
		
//			Book temp_book;
			if(book[j].getBookId()==id)
			{
				return book[j];
			}
		}
		throw new NoSuchElementException(); 
	}
	
	
	
	
	public Book[] getAll()
	{
		return book;
	}

}
