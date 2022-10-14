package Interviewprograms;

public class largestNumerinArray {

	public static void main (String [] args) {
		
		int []arr = new int [] {3000,2000,8000,7000,4000};
		
		int max = arr [0];
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] > max )
				max= arr [i];
		}
		System.out.println("Largest Number present in given Array :" + max);
			}

		}


	
