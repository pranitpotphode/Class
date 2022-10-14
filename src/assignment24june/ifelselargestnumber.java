package assignment24june;

public class ifelselargestnumber {
	
	public static void main(String[] args) {
		int i = 90,j = 270 ,k = 180;
		
		if (i >= j && i >= k)		{
			
			System.out.println(i + " I is the largest number");
		}
		else if(j>i && j>k) {
			
			System.out.println(j + " J is the largest number");     
		
	    }
	    else {
	    	System.out.println(k + " K is the largest number");
	    }
		}

}
