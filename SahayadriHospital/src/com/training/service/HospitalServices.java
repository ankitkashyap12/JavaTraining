/**
 * 
 */
package com.training.service;

import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;

import com.training.ifaces.HospitalDAO;
import com.training.models.Doctors;
import com.training.models.Patients;

/**
 * @author ankit
 *
 */
public class HospitalServices implements Serializable, HospitalDAO {
	
	private ArrayList<Patients> patientList;
	private ArrayList<Doctors> doctorsList;
	
	HashMap<Doctors, Patients> appointment= new HashMap<Doctors, Patients>();
	
	

	@Override
	public HashMap<Doctors, Patients> addAppointment(Doctors doctor, Patients patient) {
		
			appointment.put(doctor, patient);
		
		return appointment;
	}

	@Override
	public Patients getPatientsList(Doctors doctor) {
		
		return appointment.get(doctor);
	}

	@Override
	public boolean cancelAppointment(Patients patient,HashMap<Doctors, Patients> appointment) {
		return appointment.values().remove(patient);
	        
	}
		
}
