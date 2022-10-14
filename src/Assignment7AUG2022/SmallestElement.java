package Assignment7AUG2022;

public class SmallestElement {
		
		public static void main(String[] args) {
			int[]arr = new int[] {5000,2000,7000,1000,9000};

			int Small =arr[0];
			
			for(int i =0;i<arr.length;i++){
				
				if(arr[i]< Small) 
					Small = arr[i];
			}
				System.out.println("smallest element present in given array=> " + Small);
		}
	}