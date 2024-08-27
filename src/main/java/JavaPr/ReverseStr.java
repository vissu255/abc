package JavaPr;


public class ReverseStr {

	public static void main(String[] args) {

		String s1 = "seleniumjava";
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		
	}

}
