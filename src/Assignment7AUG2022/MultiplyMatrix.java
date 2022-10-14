package Assignment7AUG2022;

public class MultiplyMatrix {

	public static void main(String[] args) {
		int x[][]= new int [][] {{7,8,9},{7,8,9},{7,8,9}};
		int y[][]= new int [][] {{9,8,7},{9,8,7},{9,8,7}};
		int z[][]= new int [3][3];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				z[i][j]=0;
				
				for (int k=0;k<3;k++) {
					z[i][j]=z[i][j] + x[i][k]*y[i][k];
				}
				System.out.print(z[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
