package Assignment7AUG2022;

public class ReverceOrder {

	public static void main(String[] args) {
		
		int arr[] = new int []{111,333,555,777,999};
		System.out.print("Original Array => ");
		
		for ( int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			}
		System.out.println();
		System.out.print("Reverce Array  => ");
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		}
}
