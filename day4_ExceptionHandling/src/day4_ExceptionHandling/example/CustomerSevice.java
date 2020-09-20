package day4_ExceptionHandling.example;

public class CustomerSevice {
	
	
	public String generateUserId(Customer cust) {
	
		
		try {
			
			int firstPart= Integer.parseInt(cust.getCustomerId());
			String secondPart=cust.getEmail().substring(2);
			String userId ;
			userId = firstPart+secondPart;
			return userId;
			
		} 
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("Number not formatted correctly ");
		}
		return "";
		
		
	}
	
	public void printCustomer(Customer cust) {
		
		try {
			
			System.out.println(cust.getCustomerName().length());
			
		} 
		
		
		catch (NullPointerException e) {
			
			System.err.println("Customer Name should not be empty ");
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("outside catch block");
	}
	
	public String encryptMail(Customer cust) {
		String encrypted;
		
		String email =cust.getEmail();
		boolean status =email.contains("@");
		if(!status) {
			try {
				throw new Exception("Invalid mail");
				
			}
			catch(Exception e)
			{
//				System.err.println("ERROR in mail");
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		finally {
			System.out.println("Inside finally");
		}	
		}
		else
		{
			 encrypted="abcde"+email+"!234@";
			 return encrypted;
		}
		
		return "";
		
		
	}

}
