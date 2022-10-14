package practic;

public class MyProgram5 {
	
	
public static void main(String[] args) {
		
		MyProgram5 m1 = new MyProgram5();
		m1.display("Rohit" , 30, 45000);
		m1.display("Virat", 33, 50000);
		m1.display("Dhoni", 35, 55000);
		m1.display("Sachin", 40, 60000);
		

	}
	
	void display(String name, int age, int salary) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
	}


}
