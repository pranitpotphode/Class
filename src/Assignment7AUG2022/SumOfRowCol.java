package Assignment7AUG2022;

public class SumOfRowCol {
	public static void main(String[] args) {
		int rows,cols,sumRow,sumCol;
		
		int a[][]= {
				{9,6,3},
				{6,3,9},
				{3,9,6}
		};
		rows=a.length;
		cols=a[0].length;
		
		for(int i=0;i<rows;i++) {
		sumRow=0;
		for(int j=0;j<cols;j++) {
			sumRow=sumRow+a[i][j];
		}
		System.out.println("sum of "+(i+1)+" rows:  "+sumRow);
		}
		for(int i=0;i<cols;i++) {
			sumCol=0;
			for(int j=0;j<rows;j++) {
				sumCol=sumCol+a[j][i];
			}
			System.out.println("sum of "+(i+1)+" column:"+sumCol);
		}
	}
}

