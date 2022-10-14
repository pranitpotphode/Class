package Interviewprograms;

public class PrimeNumber {

	public static void main(String[] args) {
			
			int maxValue = 100;
			
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
