package access1;

public class ParentProtectedMember {
	
	protected void display() {
		System.out.println("display method from Parent Protected");
	}
	
}
						

class ProtectedMember extends ParentProtectedMember {
	
	public static void main(String[] args) {
		ParentProtectedMember ref = new ParentProtectedMember();
		ref.display();

	}


}
