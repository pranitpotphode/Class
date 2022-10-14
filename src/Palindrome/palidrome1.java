package Palindrome;

public class palidrome1 {

	public static void main(String[] args) {
		
		String name1 = "NitiN";
		
		String temp = name1;
		
		String revString =  "";
		
		int length = name1.length();
		//System.out.println(length);
		
       for (int i=length-1; i>=0; i-- ) {
       
       revString = revString + name1.charAt(i);
	}
       
       String reverse = revString.toLowerCase();
       String original = temp.toLowerCase();
       
	if(reverse.equals(original)) {
		System.out.println(reverse + " and " + original + " are palindrome");
	}
	else {
		System.out.println(reverse + " and " + original + " are not palindrome");
}
}
}