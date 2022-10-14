package Assignment7AUG2022;

public class RotateLeft {
		
		public static void main(String[] args) {
			int [] arr = new int [] {111,212,313,414,515};//left rotating this array by 1 element first
		int n = 515;
		System.out.println("Original array");
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i= 0;i<n;i++) {
			int j,first;
			
			first = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]= first;
		}
		System.out.println();
		System.out.println("Array after left rotation");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	}
	
