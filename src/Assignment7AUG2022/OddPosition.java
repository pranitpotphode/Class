package Assignment7AUG2022;

public class OddPosition {

	public static void main(String[] args) {
		
		int arr[]= new int [] {91,62,22,65,92};
		
		System.out.println("Element of given Array present on Odd Position");
		
		for (int i=0; i<arr.length; i=i+2) {
			System.out.println(arr[i]+ " ");
		}

	}

}
