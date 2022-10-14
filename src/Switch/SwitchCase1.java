package Switch;

public class SwitchCase1 {
	
public static void main(String[] args) {
		
		int num1 = 30, num2 = 10, result;
		char op = '+';
		
		switch(op) {
		
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
			
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
			
		default:
			System.out.println("No such operator or case is present");
			break;
			
		}

	}

}
