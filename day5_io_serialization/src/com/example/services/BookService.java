package com.example.services;

//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.io.*;

import com.example.model.Book;

public class BookService {
	
	public boolean writeObject(Book book) 
	{
		boolean persisted=false;
		ObjectOutputStream outStream=null;
		try {
			
			
			outStream= new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
			outStream.writeObject(book);
			persisted=true;
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			
		}
		
		finally
		{
			try {
				outStream.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return persisted;
	}
	
	
	public Book readObject()
	
	{
		Book book =null;
		ObjectInputStream in=null;
		try {
			FileInputStream file = new FileInputStream("book.ser"); 
	         in = new ObjectInputStream(file);
	         book=(Book) in.readObject();
	         
		} catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}
//		catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			}
			catch(Exception e) {
				
				
			}
		}
		
        
        
        
        return book;
	}
	
	public boolean writeWithDataStream( Book book, File file ) {
		
		DataOutputStream outStream=null;
		boolean written=false;
		try {
			
			outStream= new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			outStream.writeInt(book.getBooknumber());
			outStream.writeUTF(book.getAuthor());
			outStream.writeUTF(book.getBookName());
			outStream.writeDouble(book.getPrice());
			written=true;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();		}
		return written;
	}
	
	
	public Book readWithDataStream(File file) {
		
		DataInputStream inStream= null;
		Book book =new Book(123, "headFirst", "someone", 123);
	try {
		inStream= new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		book.setBooknumber(inStream.readInt());
		book.setAuthor(inStream.readUTF());
		book.setBookName(inStream.readUTF()); 
		book.setPrice(inStream.readDouble());
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			inStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		return book;
	}
	
	
	
	
	
	
	
	
	

}
