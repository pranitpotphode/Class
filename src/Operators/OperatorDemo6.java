package Operators;

public class OperatorDemo6 {
	
	public static void main(String[] args) {

		//System.out.println("Unary Operators");
		
		int a = 10;
		/*
		int b = --a;    //Pre Decrement
		//Decrement value of a by 1 ,,,   10-1 = 9 , a is 9 
		
		System.out.println("Value of a is " + a);  //9   
		System.out.println("Value of b is " + b);  //9  
		*/

		
		
		int b = a--;   //Post Decrement
		//b=a,  b=10
		//a-1,  10-1= 9,    a = 9
		
		System.out.println("Value of a is " + a);  //9   
		System.out.println("Value of b is " + b);  //10   
		
	}

}