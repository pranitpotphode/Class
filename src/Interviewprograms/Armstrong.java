package Interviewprograms;

public class Armstrong {
	
public static void main(String[] args) {
		
		int n = 371, remainder;
		
		int result = 0;
				
		int temp = n;		
		
		while(n!=0) {
			remainder = n%10;
			result = (int) (result + Math.pow(remainder, 3));  
			//OR
			//result += Math.pow(remainder, 3);   
			n = n/10;	
		}
		
		
		if(result==temp) {
			System.out.println(result + " is Armstrong");
		}
		else {
			System.out.println(result + " is not an Armstrong ");
		}

	}


}
