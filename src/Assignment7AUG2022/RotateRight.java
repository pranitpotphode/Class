package Assignment7AUG2022;

public class RotateRight {

	public static void main(String[] args) {
		int arr []= new int [] {55,66,77,88,99};
		int n = 1;
		System.out.print("Original Array =>");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		for(int i=0; i<n;i++) {
			int j, last;
			last =arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		System.out.print("Array After Right Roatation =>");
		for ( int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
