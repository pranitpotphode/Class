package assignment;

public class Program1 {

	int num1 = 90, num2 = 50;
	
	public static void main(String[] args) {

		System.out.println("Addition is " + addition());
		System.out.println("Substraction is " + substraction());
		System.out.println("Division is " + division());
		System.out.println("Multiplication is " + multiplication());
		System.out.println("Modules is " + modules());
	    }
	
		static int addition() {
			Program1 good = new Program1();
			int addition = good.num1 + good.num2;
			return addition;
	    }
		
		static long substraction() {
			Program1 yo = new Program1();
			long substraction = yo.num1 - yo.num2;
			return substraction;
			
		}
		
		static float division() {
			Program1 hello = new Program1();
			float division = hello.num1 / hello.num2;
			return division ;
			
		}
		static double multiplication() {
			Program1 by = new Program1();
			double multiplication = by.num1 * by.num2;
			return multiplication;
		}
		static double modules() {
			Program1 hi = new Program1();
		    double modules = hi.num1 % hi.num2;
		    return modules;
		}
}
