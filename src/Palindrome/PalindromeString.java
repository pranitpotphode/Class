package Palindrome;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String name = "Nitin";
		String temp = name;
		String revString = "";
		
		int length = name.length();  //5
		
		for(int i=length-1; i>=0; i--) {
			
			revString = revString + name.charAt(i);    //nitiN
			//System.out.println(revString);
		}
		
		if(revString.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println(revString + " and " + temp + " are palindrome" );
		}
		else {
			System.out.println(revString + " and " + temp + " are not palindrome" );
		}
		
		
		//// OR

		/*String reverse = revString.toLowerCase();  //nitin
		String original = temp.toLowerCase();    //nitin
		
		if(reverse.equals(original)) {
			System.out.println(reverse + " and " + original + " are palindrome" );
		}
		else {
			System.out.println(reverse + " and " + original + " are not palindrome" );
		}*/
		
	}

}
