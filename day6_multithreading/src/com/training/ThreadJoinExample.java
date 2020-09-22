package com.training;

import java.io.IOException;

public class ThreadJoinExample {

	public static void main(String[] args) {
		
		System.out.println("main Thread this is said yoda ");
		Thread thread=new Thread() {

			@Override
			public void run() {
				System.out.println("Joining thread starts ");
				
				
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Joining thread finished ");
			}
			
			
		};
		System.out.println("thread starts ");
		thread.start();

		
				try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
				
		System.out.println("Finished is main ");
	}

}
