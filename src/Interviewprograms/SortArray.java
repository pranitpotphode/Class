package Interviewprograms;

public class SortArray {

	public static void main(String[] args) {
		int array[]= new int [] {90,50,70,10,40,20,100,60,30,80};
		int temp =0;
		System.out.print("Element of original Array ==>");
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]+ " | ");
		}
		//Ascending
		for (int i=0; i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.print("Element of Array print in Ascending Order==)");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " | ");
		}
              
		//Descending
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if (array[i]<array[j]) {
					temp = array[i];
					array [i]= array[j];
					array [j]= temp;
				}
			}
		}
		System.out.println();
		System.out.print("Array was print in Decending Order==>> ");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " | ");
		}
	}

	}

