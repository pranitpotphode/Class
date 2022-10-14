package inheritance;

public class A1 {
	
public static void main(String[] args) {
		
		display();   //calling method of same class i.e A1
		
	}
	
	static void display() {
		System.out.println("Display Method of class A1");
	}
}

class B1 extends A1 {
	
	public static void main(String[] args) {
		
		display();   //calling method of Parent class i.e A1
		show();     //calling method of same class i.e B1
		
	}
	
	static void show() {
		System.out.println("Show Method of class B1");
	}
	
}



class C1 extends B1 {
	public static void main(String[] args) {
		
		display();   //calling method of A1 class
		show();     //calling method of B1 class
		present();  //calling method of same class i.e Inheritance2
	}
	
	static void present() {
		System.out.println("Present method of class Inheritance2");
	}

}

	