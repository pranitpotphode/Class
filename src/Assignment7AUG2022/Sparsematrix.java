package Assignment7AUG2022;

public class Sparsematrix {

	public static void main(String[] args) {
		int rows,cols,size,count=0;
		int a[][]= {
				{10,0,0},
				{0,20,0},
				{0,0,30}
		};
		rows=a.length;
		cols=a[0].length;
		size=rows*cols;
		
		for(int i=0;i<rows;i++) {
        for(int j=0;j<cols;j++) {
        	if(a[i][j]==0)
        		count++;
        }
		}
		if(count>(size/2))
			System.out.println("given matrix is sparse matrix");
		else
			System.out.println("given matrix is not sparse matrix");
	}
}