package variables;//non static example

public class calculation3 {

	static int num1 =50, num2 = 10; //global variable
	
	public static void main(String[] args) {
		//calculation2.addition();
		//OR
		addition(); //calling addition Method
		substraction();
		multiplication();
		
		
	}
	
	static void addition() {
		
		int addition = num1 + num2;//local variable
		System.out.println("Addition is " + addition);
		
	}
	static void substraction() {
		int num1 = 30;
		int substraction = calculation3.num1 - num2;//50-10 if we want to use global variable
		//OR
		//int substract = num1 - num2; // 30-10, if we want to use local variable
		
		System.out.println("substraction is " + substraction);
		
	}
	static void multiplication() {
		
		int multiplication = num1 * num2;
		System.out.println("multiplication is " + multiplication);
		
	} 
}
