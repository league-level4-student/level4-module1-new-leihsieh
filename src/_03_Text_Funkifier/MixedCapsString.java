package _03_Text_Funkifier;
public class MixedCapsString implements TextFunkifier{

	private String unfunkifiedText;

	public MixedCapsString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;

	}

	@Override
	public String funkifyText() {
		unfunkifiedText = unfunkifiedText.toLowerCase(); 
		String funked = "";
		char[] arr = unfunkifiedText.toCharArray();
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			if(i % 2 == 1) {
				arr[i] = Character.toUpperCase(arr[i]);
			}
			funked+=arr[i];
		}
		return funked;
	}

}
