package variables;

public class Calculation13 {
	static int num1 = 50, num2 = 10;  //SGV

	public static void main(String[] args) {
		addition();  //calling addition method
		substraction();
		multiplication();	
	}
	
	static void addition() {
		int addition = num1 + num2;  //;local variable
		System.out.println("Addition is " + addition);
	}
	
	static void substraction() {	
		int num1 = 30;
		int substract = Calculation13.num1 - num2;  //50 - 10 //If we want to use global variable
		//OR
		//int substract = num1 - num2; // 30-10 ,if we want to use loca1 variable
		System.out.println("Substracion is " + substract);
	}
	
	static void multiplication() {	
		int multiplication = num1 * num2;
		System.out.println("Multiplication is " + multiplication);
	}

}

