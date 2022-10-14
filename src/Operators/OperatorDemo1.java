package Operators;

public class OperatorDemo1 {
	
	public static void main(String[] args) {

		//System.out.println("Relational Operators");
		
		int age = 20;
		char bloodgroup = 'A';
		
		if(age>=18) {
			
			if(bloodgroup!='B') {  //! - shiftkey + 1 ,   != (not equals to)
				
				System.out.println("Blood Group is " + bloodgroup);
			}
			
			
		}
		   else {
			     System.out.println("Age is below 18");
		}

	}


}
