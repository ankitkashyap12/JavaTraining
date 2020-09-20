package day4_ExceptionHandling.exceptions;

public class RangeCheckExceptions extends Exception {
	
	private String  message;

	public RangeCheckExceptions(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exceptions "+message;
	}
	
	

}
