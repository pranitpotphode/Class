package Operators;

public class OperatorDemo5 {
	
	public static void main(String[] args) {

		//System.out.println("Unary Operators");
		
		//++  (increment by 1)
		//--  (decrement by 1)
		
		int a = 10;
		a++;   //10+1,    // a = a + 1;   //Post Increment
		
		System.out.println("Value of a is " + a);  //11
		
		/*
		int b = ++a;   //Pre - Increment
		//first  1+11 = a,  a = 12,, 
		//second b = a ,    b = 12
		
		System.out.println("Value of a is " + a); //12
		System.out.println("Value of b is " + b); //12
		*/
		
		
		int b = a++;   //Post Increment
		//first int b =  a,   since a is 11 so ---> b = 11
		//second a++,   a is 11 + 1 == 12
		
		System.out.println("Value of a is " + a); // a = 11+1 = 12
		System.out.println("Value of b is " + b); //11
		
	}

}
