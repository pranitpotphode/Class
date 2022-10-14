package access2;

 import access1.*;
 
public class ProtectedMember1 extends ParentProtectedMember{
	
	/*
	 protected void display() {
	 	//this method inherited by parent
	 
	 } 
	 */
	

	public static void main(String[] args) {
		
		ProtectedMember1 ref = new ProtectedMember1();  //child object of class inside package 2
		ref.display();    //call method which is inherited by parent class of package 1
	}

}
