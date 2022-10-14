package methods;

public class MyProgram3 {

	public static void main(String[] args) {
		
		MyProgram3 m1 = new MyProgram3 ();
		m1.display();
		m1.display1(50);
		m1.display2 (20,30);
		
		}

	
	void display () {
		
		System.out.println("Method with zero OR no Parameter");
		int num = 10;
		System.out.println(num);
	}
	
	void display1 (int num1) {
		
		System.out.println("Method with single parameter");
		System.out.println(num1);
		
	}
	
	void display2 (int num1, int num2) {
		System.out.println("Method with two parameter");
		System.out.println(num1+num2);
	}
	
	
	
}
