package constructors;

public class students5 {
	
	int roll_no = 7;  //NSGV
	String name = "Dhoni";  //NSGV
	
	students5(int roll_no, String name) { //constructor para
		
		this.roll_no = roll_no;
		
		this.name = name;
		
		this.display();
		
	}
	
	void display() { // zero para method
		
		System.out.println("Roll No is " + roll_no);
		
		System.out.println("Name is " + name);
	}
	
	void display1() {
		
		this.display();
		
	}
	

	public static void main(String[] args) {
		
		students5 m1 = new students5(20, "Virat");
		
		//m1.display();
		
		//students5 m2 = new students5(7, "Dhoni");

	}

}

// Constructor to Constructor ----- this()  - this statement

// Constructor to Method ------- this.methodname()   --- this keyword

//--------------

// Method to Method ----- this.methodname()   --- this keyword

// Method to Constructor using this keyword or this statement  --- Not allowed
// In method if you want to call constructor then we need to create object
