package Assignment7AUG2022;

public class Lowtriangular {

	public static void main(String[] args) {
		int rows,cols;
		int a [][]= {
				{10,20,30},
				{80,60,40},
				{40,50,60}
		};
		rows=a.length;
		cols=a[0].length;
		
		if(rows!=cols) {
			System.out.println("matrix should be a square matrix");
		}
		else {
			System.out.println("lower triangular matrix");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(j>1) 
						System.out.print("0");
						else
							System.out.print(a[i][j]+" ");
					}
				System.out.println();
				}
			}
		}
}
