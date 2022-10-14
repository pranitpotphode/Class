package SWAP;

public class Swap {
	
public static void main(String[] args) {
		
		System.out.println("Swap Number using temporary variable");
		
		int num1 = 50;
		
		int num2 = 100;
		
		int temp = num1 + num2;  //150
		
		num1 = temp - num1;  //150-50 = 100
		
		num2 = temp - num2;  //150-100 = 50
						
		 System.out.println("num1 is " + num1);  //100
		 
		 System.out.println("num2 is " + num2);   //50
		

	}


}
