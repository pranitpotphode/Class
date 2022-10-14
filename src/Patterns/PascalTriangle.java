package Patterns;

public class PascalTriangle {
	
	public static void main (String[] args) {
		
		int row =6, i , j, num, space;
		   
		   for (i=0; i<row; i++) {
			   
			   for (space=row; space>i; space--) {
				   
				   System.out.print(" ");
			   }
			   num=1;
			   for(j=0; j<=i; j++) {
				   
				   System.out.print(num+ " ");
				   
				   num = num* (i-j) / (j+1); // 2 x (2-1) / (1+1) =  2 x 1  /  2    = 2 /2 = 1
				     
				   }                        // 1 * (3-0) / (0+1) = 1*3 / 1 = 3 / 1 = 3
			   System.out.println("");      // 5 *(5-1) / (1+1)= 20/2 = 10   
			    
		   }
	}
	
}
