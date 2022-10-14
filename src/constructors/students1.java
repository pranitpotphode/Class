package constructors;

public class students1 {
	
	int roll_no;  //NSGV
	String name;  //NSGV
	
	//Zero Param Constructor
	students1() {
		
		System.out.println("Hi, we are students....");
	}
	
	//Param Constructor
	students1(int roll_no, String name) {
		
		//students1 c1 = new students1();
		  //Call zero param constructor
		
		this();
		
		System.out.println("Roll No is " + roll_no);
		
		System.out.println("Name is " + name);
		
	}
	
	

	public static void main(String[] args) {
		
		//students1 c1 = new students1();  
		
		students1 c2 = new students1(1, "Rohit Sharma"); //Call Param Constructor
		

	}

}
