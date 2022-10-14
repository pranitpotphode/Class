package IfElse;

public class ifelseoddeven {

	int num = 20;

	public static void main(String[] args) {
		
		ifelseoddeven ref = new ifelseoddeven();
		
		//(0 == 0)  , == equals to  
		
		if(ref.num%4 == 0) {
			
			System.out.println(ref.num + " is Even number");
			
		}
		else {
			
			System.out.println(ref.num + " is Odd number");
		}
		

	}
}
