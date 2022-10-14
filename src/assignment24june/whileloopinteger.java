package assignment24june;

public class whileloopinteger {
	
	public static void main (String [] args) {
	
	int count = 0, num = 063;
	
	while (num!=0) {
		
		num = num/10;
		
		++count;
	}
	
 System.out.println("Number of digits: " + count);
}
}