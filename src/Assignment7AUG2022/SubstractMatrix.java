package Assignment7AUG2022;

public class SubstractMatrix {

	public static void main(String[] args) {
		
		int row,col;
		int Income [][]= {
				{900,800,700},
				{600,500,600},
				{700,800,900}
		};
		int Expenses[][]= {
				{100,100,100},
				{100,100,100},
				{100,100,100}
		};
		row =Income.length;
		col =Income[0].length;
		int diff[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				diff[i][j]=Income[i][j]-Expenses[i][j];
			}
		}
		 System.out.println("substraction of two matrices:");
          for(int i=0;i<row;i++) {
        	  for(int j=0;j<col;j++) {
        		  System.out.print(diff[i][j]+" ");
        	  }
        	  System.out.println();
          }
          }
          }