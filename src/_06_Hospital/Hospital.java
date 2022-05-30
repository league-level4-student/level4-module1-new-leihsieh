package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> dt = new ArrayList<Doctor>();
	ArrayList<Patient> pt = new ArrayList<Patient>();
	public void addDoctor(Doctor d) {
		dt.add(d);
	}
	public ArrayList<Doctor> getDoctors() {
		return dt;
	}
	
	public void addPatient(Patient p) {
		pt.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return pt;
	}
	public void assignPatientsToDoctors() {
		int counter = 0;
		for(int i = 0; i < pt.size(); i++) {
			if(dt.get(counter).getPatients().size() == 3) {
				counter++;
			}
			dt.get(counter).assignPatient(pt.get(i));
		}
	}
}
