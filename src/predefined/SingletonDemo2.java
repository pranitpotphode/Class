package predefined;

class Singleton2 {
	
	String name = "Pune";
	
	//private constructor
	private Singleton2() {
		System.out.println("Zero param constructor");
	}
	
	//static instance
	static Singleton2 ref = new Singleton2();    //constructor called in same class
	
	//Static method to create instance of singleton class
	static Singleton2 getInstance() {
		return ref;	
	}
	
	void display() {
		System.out.println("display method of singleton class");
	}
	
}

public class SingletonDemo2 {

	public static void main(String[] args) {
		
		//Singleton2 s2 = new Singleton2();
		//s2.display();
		
		Singleton2 s2 = Singleton2.getInstance();  //calling static method of singleton class
		s2.display();
		
		System.out.println(s2.name);
		

	}

}