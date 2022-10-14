package access1;

public class PrivateMember {
	
private void display() {
		
	}
	
	public static void main(String[] args) {

		PrivateMember ref = new PrivateMember();
		ref.display();
		System.out.println("this is display method");
	}

}


class Test_A {
	
	public static void main(String[] args) {

		PrivateMember ref = new PrivateMember();
		//ref.display();   //Private members are not accessible in other class
		
	}
	
	
}


