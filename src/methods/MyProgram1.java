package methods;

public class MyProgram1 {
	
	int age = 50;

	public static void main(String[] args) {
		
		MyProgram1 m1 = new MyProgram1();
		m1.display();  //print statement 
		
		System.out.println(m1.number());
		
		System.out.println(m1.age);
		
		System.out.println(m1.number1());
		
		System.out.println(m1.show());	

	}
	
	//return_type  method_name()
	void display() {
		
		System.out.println("Display method with void return type");
	}
	
	
	//return_type  method_name()
	int number() {
		
		/*int num1 = 50;
		int num2 = 10;
		int result = num1 + num2;
		*/
		
		//return result;
		return 15;	
	}
	
	double number1() {
		
		
		return 5.0;
	}
	
	String show() {
		
		return "Sachin";
	}
	
	
	//char, long, byte, float, boolean
	

}


