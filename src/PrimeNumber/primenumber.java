package PrimeNumber;

public class primenumber {
	
	//Number which is divisible by 1 and itself
	
		//3  -> divide by 1 and 3  -- is prime number
		//4  -> divide by 1 , 2 , 4  --  is not prime number
		
		//2, 3, 5, 7, 11, 13, 17, 19, 23  [between 1 to 25]
		
		
		//division count = 2
		//modulus -> to check is number if we getting 0 or not after division
		
		
		public static void main(String[] args) {
			
			int maxValue = 25;
			
			for(int i=1; i<=maxValue; i++) {
				
				int divisionCount = 0;
				
				for(int num=i; num>=1; num--) {
					
					if(i%num==0) {
						
						divisionCount = divisionCount + 1;
					}
					
				}
				if(divisionCount == 2) {
					System.out.println(i + " is prime number");
				}
				else {
					System.out.println(i + " is not prime number");
				}
				
			}
		
		}

	}
