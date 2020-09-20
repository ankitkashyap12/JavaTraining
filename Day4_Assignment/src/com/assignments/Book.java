package com.assignments;

import com.CustomExceptions.MyCustomException;
import com.CustomExceptions.RangeCheckExceptions;

public class Book {
	
	private String bookName;
	private int bookPrice;
	private int bookId;
	private String authorName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookPrice, int bookId, String authorName) throws MyCustomException, RangeCheckExceptions {
		super();
		try {
			if(bookName==null)
			{
				throw new NullPointerException();
				
			}
		} catch (NullPointerException e) {
			throw new MyCustomException("No null name here ", e);
			// TODO: handle exception
		}
		this.bookName = bookName;
		if(bookPrice<100 || bookPrice> 500)
		{
			throw new RangeCheckExceptions("Out of range1");
		}
		this.bookPrice = bookPrice;
		this.bookId = bookId;
		this.authorName = authorName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) throws MyCustomException {
		
		try {
			if(this.bookName==null)
			{
				throw new NullPointerException();
			}
		} 
		
		catch (NullPointerException e) {
			throw new MyCustomException("No Null name please ",e);
			// TODO: handle exception
		}
		this.bookName=bookName;
		

		
		
		//		try {
//			
//			this.bookName = bookName;
//		} 
//		catch (NullPointerException e) {
//			throw new MyCustomException("No Null name",e);
//			// TODO: handle exception
//		}
		
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(int bookPrice)  {
		
		try {
			if(bookPrice <100 || bookPrice>500) {
				throw new RangeCheckExceptions("out of range2");
			}
			
		} catch (RangeCheckExceptions e) {
			
			System.err.println(e.getMessage());
		}   
	
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookId=" + bookId + ", authorName="
				+ authorName + "]";
	}
	
	
	
	

}
