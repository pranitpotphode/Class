package assignment;

public class RunsAvarage {
	
	static int Virat = 50, Rohit = 25;

	public static void main(String[] args) {
		
		
	      RunsAvarage ref = new RunsAvarage();
	      ref.addition();
	      ref.substraction();
	      ref.multiplication();
	      division();
	      moduler();
	}
	
	void addition() {
		int addition = Virat + Rohit;//75
		System.out.println("Addition is " + addition);
	}
	void substraction() {
		int substraction = Virat - Rohit;
		System.out.println("Substaction is " + substraction);
	}
	void multiplication() {
		int multiplication = Virat * Rohit;
			System.out.println("Multiplication is " + multiplication);
		}
	static void division() {
		int division = Virat / Rohit;
		System.out.println("Division is " + division);
	}
	static void moduler() {
		int moduler = Virat % Rohit;
		System.out.println("Moduler is " + moduler);
	}
	}
 
