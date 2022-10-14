package constructors;

public class students3 {

	int roll_no;  //NSGV
	String name ;  //NSGV

	public static void main(String[] args) {
		
		students3 m1 = new students3();
		
		m1.display(15, "Rohit");
		
		m1.display1();

	}
	
	void display(int roll_no, String name) {
		
		this.roll_no = roll_no;   //Global variable will take value of local
		
		this.name = name;
		
		//System.out.println("Roll No is " + roll_no); 
		
		//System.out.println("Name is " + name);
		
		
	}
	
	void display1() {
		
		System.out.println("Roll No is " + roll_no);
		
		System.out.println("Name is " + name);
		
	}

}
