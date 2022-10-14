package Assignment7AUG2022;

public class OddEvenArray {

	public static void main(String[] args) {
		
		System.out.print("EVEN Numbers are ==> ");
		
		int arr[]= {91, 92 , 93, 94, 95, 96, 97, 98, 99, 100};
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		System.out.println();
		
		System.out.print("ODD Numbers are ==>  ");
		
        for (int i=0; i<arr.length; i++) {
        	if (arr[i]%2 != 0) {
        		System.out.print(arr[i] + " ");
        		
        	}
        }
	}

}
