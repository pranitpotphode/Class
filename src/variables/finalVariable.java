package variables;

public class finalVariable {
	
final double pi = 3.14;
	
	static final double pi1 = 3.14;

	public static void main(String[] args) {
		
		finalVariable ref = new finalVariable();
		
		//ref.pi = 322; //322.0
		
		System.out.println(ref.pi); 
		
		//finalVariable.pi1 = 355;
		
		

	}

}
