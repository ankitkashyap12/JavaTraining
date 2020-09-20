package day4_ExceptionHandling.example;

import day4_ExceptionHandling.exceptions.RangeCheckExceptions;

public class Application {
	
	public static void main(String[] args)
	{
		try {

			Customer ankit=new Customer();
			ankit.setCustomerId("234");
			ankit.setEmail("anjnjldjo@");
			ankit.setMobileNumber(-9876);
			ankit.setCustomerName("Ankit");
			
			CustomerSevice service = new CustomerSevice();
			service.printCustomer(ankit);
			System.out.println(service.generateUserId(ankit));
			service.encryptMail(ankit);
		}
		catch(RangeCheckExceptions e)
		{
			System.err.println(e.getMessage());
		}
		
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	

}
