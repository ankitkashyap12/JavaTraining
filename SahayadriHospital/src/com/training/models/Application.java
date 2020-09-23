/**
 * 
 */
package com.training.models;

import java.util.ArrayList;
import java.util.HashMap;

import com.training.ifaces.HospitalDAO;
import com.training.service.HospitalServices;

/**
 * @author ankit
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Doctors doc1=new Doctors("Dr Ram", 112);
		Doctors doc2=new Doctors("Dr Shayam", 201);
		Doctors doc3=new Doctors("Dr Rathore", 301);
		
		
		Patients ankit=new Patients("ankit", 398);
		Patients raj=new Patients("raj", 234);
		Patients radhe=new Patients("radhe", 194);
		Patients mohan=new Patients("mohan", 125);
		Patients kashyap=new Patients("kashyap", 198);
		
		
			
		HospitalDAO service=new HospitalServices();
		
		HashMap<Doctors, Patients > appointment= new HashMap<Doctors, Patients>(); //creating hashmap to store the appointment returned by HospitalServices class methods.
		
		appointment= service.addAppointment(doc1, ankit);
		appointment= service.addAppointment(doc2, raj);
		appointment= service.addAppointment(doc2, kashyap);
		
		
		
		
		
		appointment= service.addAppointment(doc3, radhe);
		System.out.println(appointment); //prints the doctor and correspondings patient.
		
		System.out.println( service.cancelAppointment(raj,appointment)); // return type is boolean 
		
		System.out.println("After deleting the appointment list is: ");
		System.out.println(appointment);
		
		
		System.out.println(service.getPatientsList(doc2)); //getting list of patients for particular doctor.
		
		

	}

}
