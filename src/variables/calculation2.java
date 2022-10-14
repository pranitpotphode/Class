package variables;//static example

public class calculation2 {

	static int num1 =50, num2 = 10; //global variable
	
	public static void main(String[] args) {
		//calculation2.addition();
		//OR
		addition(); //calling addition Method
		substraction();
		multiplication();
		
		
	}
	
	static void addition() {
		
		int addition = num1 + num2;
		System.out.println("Addition is " + addition);
		
	}
	static void substraction() {
		
		int substraction = num1 - num2;
		System.out.println("substraction is " + substraction);
		
	}
	static void multiplication() {
		
		int multiplication = num1 * num2;
		System.out.println("multiplication is " + multiplication);
		
	} 
}
