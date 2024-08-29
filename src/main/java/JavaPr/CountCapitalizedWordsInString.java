package JavaPr;

public class CountCapitalizedWordsInString {

	public static void main(String[] args) {
		
		System.out.println(countCapitalsInString("RahulNaveenAutomation"));

		
	}
	static int countCapitalsInString(String inputString) {
		
		int counter =0;
		
		for(int i =0;i<inputString.length();i++) {
			if(inputString.charAt(i)>='A' && inputString.charAt(i) <='Z') {
				counter++;
			}
		}return counter;
	}

}
