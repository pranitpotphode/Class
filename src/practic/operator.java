package practic;

public class operator {
 
	public static void main(String[] args) {
	System.out.println("Unary operators");
	//++ (increment by 1)
    //-- (decrement by 1)
	 int a = 5;
	 a++; //a+1 = 5+1=6//post increment
	 System.out.println("Value of a is " + a);//6
	 int b = ++a; //1+a=7   1+6=7 pre-increment  a=7
	 System.out.println("Value of a is " + a);//7
	 System.out.println("Value of b is " + b);//7
	 
	// int b = a++;//
	// System.out.println("Value of a is " + a);//7
//	 System.out.println("Value of b is " + b);//8
	}

}