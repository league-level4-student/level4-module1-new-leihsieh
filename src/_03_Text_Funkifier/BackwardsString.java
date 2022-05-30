package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

	private String unfunkifiedText;

	public BackwardsString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;

	}

	@Override
	public String funkifyText() {
		String funked = "";
		char[] arr = unfunkifiedText.toCharArray();
		for(int i = unfunkifiedText.length()-1; i >= 0; i--) {
			funked+=arr[i];
		}
		return funked;

	}
}
