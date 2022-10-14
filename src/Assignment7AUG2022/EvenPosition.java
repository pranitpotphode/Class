package Assignment7AUG2022;

public class EvenPosition {

	public static void main(String[] args) {
		
		int arr[] = new int [] {91,62,22,65,92};
		
		System.out.println("Element of given Array present on Even position");
		
		for (int i=1; i<arr.length;i=i+2) {
			
			System.out.print(arr[i] + " ");
		}

	}

}
