package _03_Text_Funkifier;

public class AddSpacesString implements TextFunkifier{
	
	private String unfunkifiedText;
	
	public AddSpacesString(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}
	
	public String funkifyText() {
		String funked = "";
		char[] arr = unfunkifiedText.toCharArray();
		int counter = 0;
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			if(counter == 1) {
				funked+=' ';
				counter = 0;
			}
			funked+=arr[i];
			counter++;
		}
		return funked;
	}
}
