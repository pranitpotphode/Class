package Interviewprograms;

public class ReverseString {

		public static void main(String[] args) {
		   String name = "Sanjay";
		   
		   //System.out.println(" original string : " + name );
		   
		   String reversedStr = "";
		//   String name1 = "nitin";
		   
		  // int length = name.length();
		   //System.out.print("Reverse of given String : " );
		   
		   for(int i = name.length()-1;i>=0;i--) {
			   reversedStr = reversedStr + name.charAt(i);
			   //System.out.print(name.charAt(i));
			 
		   }
		  // System.out.print(" Reverse of given String" );
	  
		   System.out.println("original string : " + name);
	       System.out.println(" Reverse of given String : "+ reversedStr);
		}

	}
