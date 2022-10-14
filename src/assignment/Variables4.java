package assignment;

public class Variables4 {
	
	//datatype variable_name = value/data;
	
	String name = "Sumit";  //NSGV
	

	public static void main(String[] args) {
		
		Variables4 m1 = new Variables4(); //name, display(), display1()
		m1.display();
		
	}

	//non static method
	void display() {
		System.out.println(name);
		display1();
	}
	
	//non static method
	void display1() {
		
		int age = 50;
		System.out.println(age);
		
	}
	
	
}

