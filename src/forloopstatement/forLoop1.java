package forloopstatement;

public class forLoop1 {
	
	
public static void main(String[] args) {
		
		//print a-z
		//a b c d .... z   
		
	//	char ch1 = 'a';
		
		
		for(char ch='A'; ch<='Z' ; ch++) {
			
			System.out.print(ch + " ");
			
		}
		
		System.out.println();
		
		//print z-a
		for(char ch='Z'; ch>='A' ; ch--) {
			
			System.out.print(ch + " ");
			
		}
		
		

	}


}
