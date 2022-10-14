package Exceptions;

public class ExceptionDemo2 {

		public static void main(String[] args) {
			
			System.out.println("Program starts here");
			
			int i = 10;
			int j;
			
			try {
				j = i / 10;
				System.out.println("Result of j is " + j);
			}
			catch(ArithmeticException ex) {
				System.out.println(ex + " -- Exception Handled" );
				//ex.printStackTrace();
			}
			finally {
				System.out.println("Finally will get execute whether exception is handled or not");
			}
			
			
			System.out.println("Program Ends Here");
			

		}

	}