package assignment;
  
public class Program2 {

	int num1 = 45, num2 = 20;
	
	public static void main(String[] args) {
		Program2 yes = new Program2();
		System.out.println("Addition is " + yes.addition());//65
		System.out.println("substraction is " + yes.substraction());//25
		System.out.println("multiplication is " + yes.multiplication());//900
		System.out.println("division is " + yes.division());//2
		System.out.println("modules is " + yes.modules());
		
		}
	int addition() {
		int addition = num1 + num2;
		return addition;
		
	}
	long substraction() {
		long substraction = num1 - num2;
		return substraction;
		
	}
	float multiplication() {
		float multiplication = num1 * num2;
		return multiplication;
		
	}
	double division() {
		double division = num1 / num2;
		return division;
	}
	long modules() {
		long modules = num1 % num2;
		return modules;
	}
}
