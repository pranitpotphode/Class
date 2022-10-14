package Assignment7AUG2022;

public class Frequency { // *****

	public static void main(String[] args) {
		
	int arr[]= new int []{2,4,5,2,6,6,6,3,7};
	int arrvisited[] = new int [arr.length];
	int visited = -1;
	for(int i = 0;i<arr.length;i++) {
		int count = 1;
		for(int j = i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				  count++;
				  arrvisited[j]= visited;
			}
		}
		if(arrvisited[i]!=visited) {
			arrvisited[i]= count;
		}
	}
	for(int i = 0;i<arrvisited.length;i++) {
		if (arrvisited[i]!=visited) {
			System.out.println(" frequency of " + arr[i]+ " : " + arrvisited[i] );
		}
	}
	
			}
		}