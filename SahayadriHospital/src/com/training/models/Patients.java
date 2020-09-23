/**
 * 
 */
package com.training.models;

/**
 * @author ankit
 *
 */
public class Patients {
	
	private String patientName;
	private int patientid;
	
	
	public Patients(String patientName, int patientid) {
		super();
		this.patientName = patientName;
		this.patientid = patientid;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public int getPatientid() {
		return patientid;
	}
	
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		result = prime * result + patientid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patients other = (Patients) obj;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		if (patientid != other.patientid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patients [patientName=" + patientName + ", patientid=" + patientid + "]";
	}
	
	

}
