package JavaPr;

public class Armstrong {

	public static void main(String[] args) {

		isArmstrongNumber(371);
	}

	static void isArmstrongNumber(int num) {
		
		int cube= 0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			cube= cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not an armstrong");
		}
	}
}
