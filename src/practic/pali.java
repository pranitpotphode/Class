package practic;

public class pali {
	
public static void main(String[] args) {
		
		
		
		int remainder, revNum = 0;
		
		int birthyear = 1991; 
		
		int temp = birthyear;  //or int temp = 1221;
		
		
		while(birthyear!=0) {
			remainder = birthyear%10;  
			
			revNum = (revNum*10) + remainder;  
			
			birthyear = birthyear/10; 	
		}
		
		if(revNum==temp) {
			System.out.println(revNum + " is Palindrome");
		}
		else {
			System.out.println(revNum + " is not a Palindrome");
		}
		
}
}

