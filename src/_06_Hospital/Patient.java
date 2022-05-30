package _06_Hospital;

public class Patient {
	private boolean feelsCared = false;
	public boolean feelsCaredFor() {
		return feelsCared;
	}
	public void checkPulse() {
		feelsCared = true;
	}
}
