package assignment24june;

public class whileloopreversenumber {

	public static void main(String[] args) {
		int num = 6789 , reversed = 0;
		
		while(num!= 0) {
			int digit = num % 10;
			
			reversed = reversed * 10 + digit;
		
			num = num / 10;
		}
		System.out.println("Reversed number: "+ reversed);
		}
	}


