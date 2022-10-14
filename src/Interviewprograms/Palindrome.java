package Interviewprograms;

public class Palindrome {
	

public static void main(String[] args) {
		

		int remainder, revNum = 0;
		
		int n = 1221; 
		int temp = n;  //or int temp = 1221;
		
		while(n!=0) {
			remainder = n%10;   //1  ,  //2  , //2   //1
			revNum = (revNum*10) + remainder;  //1  ,//10+2=12,  //120+2=122,  //1220+1= 1221
			n = n/10; //122,  //12,  //1,  //0		
		}
		
		if(revNum==temp) {
			System.out.println(revNum + " is Palindrome");
		}
		else {
			System.out.println(revNum + " is not a Palindrome");
		}
		
	}

}

