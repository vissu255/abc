package JavaPr;

import org.checkerframework.checker.units.qual.s;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 ="selenium";
		
		s1 = s1+s2;
		
		
		s2= s1.substring(0, s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		
		
		System.out.println(s2);
		System.out.println(s1);
		
	}

}
