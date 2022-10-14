package variables;

public class Calculation12 {

	public static void main(String[] args) {
		//Calculation2.addition();
		//OR
		addition();  //calling addition method
		substraction();
		multiplication();	
		modulus();
		}
	
	static void addition() {
		int num1 = 50, num2 = 10;
		int addition = num1 + num2;
		System.out.println("Addition is " + addition);
	}
	
	static void substraction() {
		int num1 = 50, num2 = 20;
		int substract = num1 - num2;
		System.out.println("Substracion is " + substract);
	}
	
	static void multiplication() {
		int num1 = 50, num2 = 30;
		int multiplication = num1 * num2;
		System.out.println("Multiplication is " + multiplication);
	}
	
	static void modulus() {
		int num1 = 50, num2 = 40;
		int modulus = num1 % num2;
		System.out.println("Modulus is " + modulus);
	}

}


