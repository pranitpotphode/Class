package SWAP;

public class Swap1 {
	
public static void main(String[] args) {
		
		System.out.println("Swap Number without using temporary variable");
		
		int num1 = 50, num2 = 100;
		
		num2 = num1 + num2;  //new value of num2 is 150
		
		num1 = num2 - num1;  //150-50 = 100
		
		num2 = num2 - num1;  //150-100 = 50
		
		
		 System.out.println("num1 is " + num1);  //100
		 
		 System.out.println("num2 is " + num2);   //50

	}

}
