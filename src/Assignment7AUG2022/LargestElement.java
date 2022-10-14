package Assignment7AUG2022;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = new int [] {5000,2000,7000,1000,9000};
		
		int Large =arr [0];
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i]> Large);
			Large =arr[i];
			
		}
		System.out.println("Largest element of present in given array ==>" + Large);

	}

}
