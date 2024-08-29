package JavaPr;

public class LongestConsecutiveIntOccurence {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,77,99,5,29};
		
		int count =0;
		
		int max =0 ;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+1 == arr[i+1]) {
				count ++;
			}else {
				count =0;
			}
			max = Math.max(max, count+1);
		}

		System.out.println(max);
		
	}
	
}
