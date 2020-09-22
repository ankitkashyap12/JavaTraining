package com.training;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		new InvokeNumberService(100, " hundred count");
		new InvokeNumberService(1000, " Thousand count");
		new InvokeNumberService(10000, " ten Thoushand count");
		
		
		
		try {
			System.out.println(" enter a msg ");
		System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
