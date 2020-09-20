package com.CustomExceptions;
public class MyCustomException extends Exception {

	private String message;
	Throwable cause;
	public MyCustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return cause+message;
	}
	
	

}
