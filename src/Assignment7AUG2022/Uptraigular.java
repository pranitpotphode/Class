package Assignment7AUG2022;

public class Uptraigular {

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
			System.out.println("upper triangular matrix");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(i>j) 
						System.out.print("0");
						else
							System.out.print(a[i][j]+"");
					}
				System.out.println();
				}
			}
		}
}

