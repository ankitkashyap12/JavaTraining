package com.models;

import java.io.*;

public class FileServices {
	
	public synchronized boolean writetoFile( String text) throws InterruptedException
	{
		boolean written =false;
		PrintWriter writer= null;
		String fileName = "file1.txt";
		
		
	try {
	File f = new File(fileName);
	writer=new PrintWriter(new FileWriter(f,true));
	 
//	while (f.length()==87)
//	{
//		 wait();
//	}
	System.out.println("Starting to write ");
	writer.println(text);
	System.out.println("Written on file and length of the file is: "+f.length());
	written=true;
	 
	notify();
	
//	Thread.sleep(1000);
	
	} catch (FileNotFoundException e) {
	
	e.printStackTrace();
	
	} catch (IOException e) {
	
		e.printStackTrace();
	}finally
	{
		writer.close();
		
	}
	return written;
	}
	
	
	
	
	
	public synchronized void readFromFile(File file) throws InterruptedException
	{
		BufferedReader reader= null;
		try {
			reader=new BufferedReader(new FileReader(file));
			 String line=null;
			 
			 while(file.length()==0) {
				 
				 wait();
				 
			 }
			 System.out.println("starting to read ");
			 
			 
			 while((line=reader.readLine())!=null )
			 {
				 System.out.println("reading :"+ line);
				 
			 }
			 System.out.println("Reading completed ");
			
			
			 notify(); //notify other thread;
			 
			 
//			 Thread.sleep(1000);
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	

}
	
	
	
	
	
}
