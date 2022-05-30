package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class AbstractClass extends AbstractClassDemo implements InterfaceDemo{
	public void abstractDemo() {
		System.out.println("abstract demo");
	}
	public int abstractNumDemo() {
		return getNum();
	}
	public static void main(String[] args) {
		AbstractClass ac = new AbstractClass();
		System.out.println(ac.abstractNumDemo());
	}
	@Override
	public double interDemo() {
		// TODO Auto-generated method stub
		return 1.5;
	}
	public String faceDemo() {
		return "faceDemo";
	}
}