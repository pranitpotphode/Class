package Assignment7AUG2022;

public class Removeduplicate {
		public static void main(String[] args) {
			int arr[]= {20,20,20,50,70,70,80,90,90,90};
			int length =arr.length;
			int temp[]= new int [arr.length];
			int j=0;
			
			for(int i=0;i<length-1;i++) {
				
				if(arr[i]!=arr[i+1]) {
					temp[j++]=arr[i];
				}
			}
			temp[j++]=arr[length-1];
			for(int k=0;k<j;k++) {
				System.out.println(temp[k]);
			}
		}
	}
