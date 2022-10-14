package inheritance;

public class WithInheritance {
	
	public static void main(String[] args) {
		System.out.println("Main method of WithInheritance");
		display();
	}
	static void display() {
		System.out.println("Display method of WithInheritance");
	}

}

//Child class
class program11 extends WithInheritance {
	
	public static void main(String[] args) {
		System.out.println("Main method of Program11");
		display();  //Calling method of Parent class i.e WithInheritance
	}	
	
}

class program12 {
	
	public static void main(String[] args) {
		System.out.println("Main method of Program11");

	}	
	

}
