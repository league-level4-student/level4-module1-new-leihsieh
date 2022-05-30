package _06_Hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor{
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		return true;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	protected void doMedicine() {
		
	}
	@Override
	public ArrayList<Patient> removePatient() {
		patients.remove(3);
		return patients;
	}
}
