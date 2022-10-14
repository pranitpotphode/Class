package constructors;

public class students4 {

	int roll_no = 7;  //NSGV
	String name = "Dhoni";  //NSGV
	
	students4(int roll_no, String name) {
		
		this.roll_no = roll_no;
		
		this.name = name;
		
	}
	
	students4() {
		
		this(18, "Virat"); //calling param constructor
		
		System.out.println("Roll No is " + roll_no);
		
		System.out.println("Name is " + name);
		
	}
	

	public static void main(String[] args) {
		
		//students4 m1 = new students4(20, "Virat");
		
		students4 m1 = new students4();

	}

}
