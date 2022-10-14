package Exceptions;

public class ExceptionDemo3 {
	

		public static void main(String[] args) {

			System.out.println("Program starts here");
			
			int i = 10;
			int j;
			
			try {
				j = i / 0;
				System.out.println("Result of j is " + j);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex + " -- Exception Handled" );
			}
			catch(NullPointerException ex) {
				ex.printStackTrace();
			}
			catch(ArithmeticException ex) {
				System.out.println(ex + " -- Exception Matched Handled" );
			}
			catch(Throwable ex) {
				System.out.println(ex + " -- Exception Handled" );
			}
			finally {
				System.out.println("Finally will get execute whether exception is handled or not");
			}
			//finally {
			//	System.out.println("Finally will get execute whether exception is handled or not");
			//}
			
			System.out.println("Program Ends Here");
			
}
		}