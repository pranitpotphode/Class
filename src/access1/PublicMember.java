package access1;

public class PublicMember {
	
	int i= 45000;
	
public void display() {
	
	System.out.println("Crickter salary is " + i);
		
	}

	public static void main(String[] args) {
		PublicMember ref = new PublicMember();
		ref.display();
		
		
	}

class Test_P{
	
	public static void main(String[] args) {
		PublicMember ref = new PublicMember();
		ref.display();
		
	}
	
}
}

