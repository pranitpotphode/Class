package constructors;

public class students2 {
	
	//Zero Param Constructor
		students2() {
			
			this(1, "Virat Kohli");
		//	this("International School");
			
			System.out.println("Hi, we are students....");
		}
		
		//Two Param Constructor
		students2(int roll_no, String name) {
			
			this("International School");
			
			System.out.println("Roll No is " + roll_no);
			
			System.out.println("Name is " + name);
			
		}
		
		//Single Param Constructor
		students2(String school) {
			
			System.out.println("School is " + school);
			
		}
		

		public static void main(String[] args) {
			
			students2 c1 = new students2(); 
		
		}


}
