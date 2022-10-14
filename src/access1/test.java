package access1;


class Parent {
	
	void display() {
		
		System.out.println("Final method of parent");
	}
} 

public class test extends Parent {

	
	void display() {
		System.out.println("Final method of child");
	}
	
	
	//Overriding is not possible bcz parent's method is final
	
	public static void main(String[] args) {
		
		test ref = new test();
		ref.display();

	}
}
