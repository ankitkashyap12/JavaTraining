package com.training;

public class NumberService {
	
	public void sumNumber(int countTo) {
		
		int count=0;
		for(int i=0;i<countTo;i++)
		{
			count=count+i;
		}
		System.out.println("Sum upto: "+countTo+ " is= "+ count+"\ncalled by"+Thread.currentThread().getName());
	}

}
