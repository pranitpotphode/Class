package variables;

public class Calculation14 {
	
	static int num1 = 50, num2 = 10;  //SGV

	public static void main(String[] args) {
		
		Calculation14 m1 = new Calculation14();
		m1.addition();  //calling addition method
		m1.substraction();
		m1.multiplication();	
	}
	
	void addition() {
		int addition = num1 + num2;  //local variable
		System.out.println("Addition is " + addition);
	}
	
	void substraction() {	
		int num1 = 30, num2 = 20;	
		//int substract = Calculation14.num1 - Calculation14.num2;  //50 - 10 //If we want to use global variable
		//OR
		int substract = num1 - num2; // 30-10 ,if we want to use loca1 variable
		System.out.println("Substracion is " + substract);
	}
	
	void multiplication() {	
		int multiplication = num1 * num2;
		System.out.println("Multiplication is " + multiplication);
	}

}
