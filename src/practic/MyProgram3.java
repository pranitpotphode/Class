package practic;

public class MyProgram3 {
	
public static void main(String[] args) {
	
	MyProgram3 m1 = new MyProgram3();
	m1.display();  //call zero parameter method
	m1.display1(40); //call single parameter method
	m1.display2(10, 20);
	m1.display3( "Rohit", 33, 45000);
	
		
		
	}
	
	void display() {
		System.out.println("Method with zero or no parameter");
		int num = 10;
		System.out.println(num);
		
	}
	
	void display1(int num) {
		System.out.println("Method with single parameter");
		System.out.println(num);
	}
	
	void display2(int num1, int num2) {
		System.out.println("Method with two parameters");
		int addition = num1 + num2;
		System.out.println(addition);
		
	}
	
	void display3(String name, int age, int salary) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
	}
	

}
	


