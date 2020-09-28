package com.models;

import java.io.*;


public class Application {
	public static void main(String[] args) {
		
//		TextToWrite text1=new TextToWrite("This is Text1");
//		TextToWrite text2=new TextToWrite("This is Text2");
		FileServices service=new FileServices();
		String[] text= {"ank","ram","aash"};
		Thread threadWrite=new Thread() {

			@Override
			public void run() {
//					System.out.println("ThreadWrite");
					try {
						
						service.writetoFile(text);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
			};
			
		Thread threadRead=new Thread() {

			@Override
			public void run() {
//				System.out.println("ThreadRead");
				
				try {
					service.readFromFile(new File("file1.txt"));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		};
		
		threadWrite.start();
		threadRead.start();
		
//		
//		try {
//			threadWrite.join();
//			threadRead.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		boolean written=service.writetoFile(text1);
//		if (written) {
//			System.out.println("Written on file");
//		}
//		
//		service.readFromFile(new File("file1.txt"));
	}
	
	

}
