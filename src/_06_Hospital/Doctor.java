package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor{

	public abstract void assignPatient(Patient p);
	
	public abstract ArrayList<Patient> getPatients();
	public abstract ArrayList<Patient> removePatient();

	protected abstract void doMedicine();
}
