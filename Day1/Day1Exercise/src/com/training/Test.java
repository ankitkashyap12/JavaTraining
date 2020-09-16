package com.training;

public class Test {
	public static void main(String[] args) {
		Donor person=new Donor();
		person.setBloodGroup("O+");
		person.setDonorName("Ankit");
		person.setDonorAge(21);
		System.out.println("Thanks,"+person.getDonorName());
		
		Donor person2=new Donor("Kashyap","A+",24);
		System.out.println(person2.getDonorAge());
	}

}
