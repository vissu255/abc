package JavaPr;

public class Palindrome {

	public static void main(String[] args) {
       
       isPalindrome(54245); 	
        
	}
	static void isPalindrome(int num) {
		int sum=0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;
			num= num/10;
			sum=(sum*10)+r;
			
		}
		if(t==sum) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not a palindrome");
		}
		
	}

}
