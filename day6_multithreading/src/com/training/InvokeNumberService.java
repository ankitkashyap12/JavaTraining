/**
 * 
 */
package com.training;

/**
 * @author Ankit Kashyap
 *
 */
public class InvokeNumberService implements Runnable {
	
	private int countTo;
	private String threadName;
	private NumberService service;
	
	

	public InvokeNumberService(int countTo, String threadName) {
		super();
		
		
		//setting parameters passed from main method here
		this.countTo = countTo;
		this.threadName = threadName;
		
		
		// creating instance of service
		this.service=new NumberService();
		
		//passing the service which is runnable
		//to thread class along with name as arguments
		Thread thread =new Thread(this, threadName);
		
		//calling the start() method which makes thread eligible for run
		thread.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//calling the code that has to be executed in thread
		
		this.service.sumNumber(countTo);

	}

}
