package Assignment7AUG2022;

public class CopyArrayElements {

	public static void main(String[] args) {
		
		int arr10[] = new int[] {1,2,3,4,5};
		int arr20[] = new int[arr10.length];
		
		for (int i=0; i<arr10.length; i++) {
			
			arr20[i] = arr10[i];
		}
		
		System.out.print("Element of Original Array ");
		
		for (int i=0; i<arr10.length; i++) {
			System.out.print(arr10[i] + " ");
		}

		System.out.println();
		
		System.out.print("Copy Element of Original Array ");
		
		for (int i=0; i<arr20.length; i++) {
			System.out.print(arr20[i] + " ");
			
		}
	

}
}