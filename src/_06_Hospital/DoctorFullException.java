package _06_Hospital;

public class DoctorFullException extends Exception {
	public static void DoctorLimit(Doctor dt) throws Exception{
		if(dt.getPatients().size() > 3) {
			throw new DoctorFullException();
		}
	}
}
