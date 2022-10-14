package Assignment7AUG2022;

public class AdditionMatrix {

	public static void main(String[] args) {
		int x [][]= {{10,20,30},{10,20,30},{10,20,30}};
		int y [][]= {{30,20,10},{30,20,10},{30,20,10}};
		int z [][]= new int [3][3];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(z[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
