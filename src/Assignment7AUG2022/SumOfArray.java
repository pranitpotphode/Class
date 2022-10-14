package Assignment7AUG2022;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array is " + sum);
	}

}
