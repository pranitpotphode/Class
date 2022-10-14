package inheritance;

//Example of Single Inheritance

//Parent class 
class A {
	
	void display() {
		System.out.println("Method of parent class");
	}
	static void display1() {
		System.out.println("Another method of parent class");
	}
	
}

//Child class  
public class Inheritance1 extends A {

	public static void main(String[] args) {
		A ref = new A();
		ref.display();  //Calling non static method of parent class
		
		display1(); //calling static method of parent class
	}

}
/*
Other name of Parent class is
//Existing class
//Super class

  
Other name of Child class is
//Current class
//Sub class

*/












