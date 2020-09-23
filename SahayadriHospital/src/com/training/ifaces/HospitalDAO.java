/**
 * 
 */
package com.training.ifaces;

import java.util.*;

import com.training.models.Doctors;
import com.training.models.Patients;

/**
 * @author ankit
 *
 */
public interface HospitalDAO {
	
	
	Patients getPatientsList(Doctors doctor); 
	boolean cancelAppointment(Patients patient,HashMap<Doctors,Patients> appointment);
	public HashMap<Doctors, Patients> addAppointment(Doctors doctor, Patients patient);
	
}
