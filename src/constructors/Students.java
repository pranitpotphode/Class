package constructors;

public class Students {
	
public Students() {
		
		System.out.println("Hi I am constructor");	
	}
	
	Students(String name) {
		
		System.out.println("Hi I am Parameterized constructor");
		System.out.println(name);
	}
	
	

	public static void main(String[] args) {
		
		Students ref = new Students(); //call Zero Parameter constructor
		
		Students ref1 = new Students("Rohit"); //call Parameterized constructor
		
		System.out.println("HI I am main method");
		
		//ref.display();
		//ref.display(10);
		
	}
	
	
	void display() {
		
	}
	
	void display(int num) {
		System.out.println(num);
	}

}

//Default Constructor -- It is created by Java

//User defined constructor  -- It is created/written by programmer



