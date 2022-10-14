package While;

public class whileLoop1 {
	
public static void main(String[] args) {
		
		
		int i = 1;
		while(i<=1) {
			
			//System.out.println("Value of i " + i);	
			for(int j=1; j<=3; j++) {
				System.out.println(i + "     " + j);  //2 1  ,  2  2,   2  3  
				System.out.println("Hello I am inside for loop");
			}
	
			i++;
		}
	
		
		/*int i = 1;
		while(i<1) {
			
			System.out.println(i);
			i++;
		}*/
		
	}


}
