package Exceptions;

public class ExceptionDemo1 {

public static void main(String[] args) throws Throwable {
		
		System.out.println("Program starts here");
		
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("Program ends here");

	}

}