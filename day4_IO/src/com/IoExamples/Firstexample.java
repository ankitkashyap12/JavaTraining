package com.IoExamples;
import java.io.*;
public class Firstexample {
//	public void writetoFile(File file, Customer cust)
//	{
//		PrintWriter writer= null;
//		try {
//			 writer=new PrintWriter(new FileWriter(file,true));
//			 writer.println(cust.toString());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally
//		{
//			writer.close();
//			
//		}
//	}
	
	public void readFromFile(File file)
	{
		BufferedReader reader= null;
		try {
			 reader=new BufferedReader(new FileReader(file));
//			 reader.println(cust.toString());
			 
			 
			 String line=null;
			 while((line=reader.readLine())!=null )
			 {
				 System.out.println(line);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	

}
