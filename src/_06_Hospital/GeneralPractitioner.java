package _06_Hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return true;
	}
	
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	public void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
	@Override
	public ArrayList<Patient> removePatient() {
		patients.remove(3);
		return patients;
	}
}
