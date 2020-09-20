package day4_ExceptionHandling.example;

import day4_ExceptionHandling.exceptions.RangeCheckExceptions;

public class Customer {
	
	private String customerId;
	private String customerName;
	private long mobileNumber;
	private String email;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) throws RangeCheckExceptions {
		
		if(mobileNumber<0 || mobileNumber>9999) {
			throw new RangeCheckExceptions("Invalid Mobile number");
		}
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
	
	
	

}
