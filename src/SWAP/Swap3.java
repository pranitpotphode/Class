package SWAP;

public class Swap3 {

	
		public static void main(String[] args) {
			
			String s1 = "Rahul", s2 = "Sachin";
			
			String temp = s2;  //"Sachin"
			
			s2 = s1;  //Rahul
			
			s1 = temp;  //Sachin
			
			System.out.println(s1);  //Sachin
			
			System.out.println(s2);  //Rahul
			

		}

}