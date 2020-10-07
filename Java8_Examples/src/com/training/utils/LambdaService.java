package com.training.utils;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
class PrintNumbers implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
	
}

public class LambdaService {
	
	public void usingWithoutLambda()
	{
		Thread thread=new Thread(new PrintNumbers());
		thread.start();
		
	}

	
	
	
	
	public void usingWithLambda() {
		
		Runnable printTo10=()->{
			for(int i=0;i<10;i++) {
				
			System.out.println(i);
			}
		};

		Runnable print10To20=()->{
			for(int j=10;j<=20;j++)
			{
				System.out.println(j);
			}
		};
Thread thread1=new Thread(printTo10);
Thread thread2=new Thread(print10To20);
thread1.start();
thread2.start();

	Predicate<Integer> checkAge=(age)->age>45?true:false;
	List<Integer> ageList= Arrays.asList(50,60,30,20,70);
	for(Integer age: ageList)
	{
		if(checkAge.test(age))
		{
			System.out.println("Valid Age");
		}
	}
	
}
	
	
	public void rethrowException() throws IOException,NullPointerException {
		int[] marks= {45,56,78};
		String name=null;
		try {
			System.out.println(marks[5]);
			System.out.println(name.length());
			System.in.read();
		} catch (Exception e) {
			throw e;
		}
	}
}
	
	
	
	
	