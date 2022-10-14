package methods;

public class MyProgram4 {

	public static void main(String[] args) {
		
		MyProgram4 m1 = new MyProgram4 ();
		m1.display("Rohit", 40, 15000, "Cricketer");
		m1.display("Virat", 33, 1515000, "Cricketer");
		m1.display("Messi", 33, 10015000, "Footballer");
		m1.display("Suresh", 35, 15000, "Cricketer");
		m1.display("Ronaldo", 37, 1015000, "Footballer");
		m1.display("james", 30, 115000, "basketballer");
		m1.display("Gaurav", 29, 300000, "Tester");
		m1.display("Bhavesh", 45, 5000, "Teacher");
		m1.display("Pranit", 31, 300000, "Tester");
		m1.display("Akshata", 16, 1115000, "Tester");
		m1.display("Rock", 40, 101515000, "Actor");
		m1.display("Yash", 35, 1015000, "Actor");
		m1.display("Ronaldinho", 40, 155000, "footballer");
		

	}

	//name,age salary,post,empid,height,weight,city name, nationality
	
	void display(String Name,int Age, int Salary, String Post) {
		
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Salary);
		System.out.println(Post);
		
		
	}
}
