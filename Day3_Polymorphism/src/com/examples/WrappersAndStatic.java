package com.examples;

public class WrappersAndStatic {
	
	private int id;
	private static String aadharNumber;
	
	
	public WrappersAndStatic(int id) {
		super();
		this.id = id;
	}

	public void show() {
		System.out.println(id);
		System.out.println(aadharNumber);
		display();
		
	}
	
	public static void display() {
		System.out.println("This is static method");
//		System.out.println("id :"+id);
		System.out.println("Adhar:"+ aadharNumber);
//		show();
	}

	public int parse(String strNumber) {
		
		
		int number = Integer.parseInt(strNumber);
		return (++number);
		
	}
	
	public String useToString(int number) {
		
		return Integer.toString(number);
		
		
	}
	
	public Integer useValueOf() {
		String age="45";
		return Integer.valueOf(age);
	}

	public WrappersAndStatic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
