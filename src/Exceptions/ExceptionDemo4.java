package Exceptions;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
System.out.println("Program starts here");
		
		int i = 10;
		int j;
		
		//System.exit(0);
		
		try {
			j = i / 0;
			System.out.println("Result of j is " + j);
		}
		
		finally {
			System.out.println("Finally code will be executed whether exception handled or not");
		}
		
		System.out.println("Program ends here");

	}

}
