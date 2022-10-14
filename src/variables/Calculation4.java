package variables;//non static example

public class Calculation4 {

	static int num1 =50, num2 = 10; //global variable
	
	public static void main(String[] args) {
		
		Calculation4 m1 = new Calculation4();
		//calculation2.addition();
		//OR
		m1.addition(); //calling addition Method
		m1.substraction();
		m1.multiplication();
		 
		
	}
	
	 void addition() {
		
		int addition = num1 + num2;//local variable
		System.out.println("Addition is " + addition);
		
	}
	 void substraction() {
		int num1 = 30;
		int substraction = calculation3.num1 - num2;//50-10 if we want to use global variable
		//OR
		//int substract = num1 - num2; // 30-10, if we want to use local variable
		
		System.out.println("substraction is " + substraction);
		
	}
	 void multiplication() {
		
		int multiplication = num1 * num2;
		System.out.println("multiplication is " + multiplication);
		
	} 
}
