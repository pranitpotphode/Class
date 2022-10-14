package Assignment7AUG2022;

public class Frequencyoddeven {

	public static void main(String[] args) {
		int rows,cols,countodd=0,counteven=0;
		int a[][]= {
				{8,2,6},
				{3,5,7},
				{4,1,3}
		};
		rows=a.length;
		cols=a[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(a[i][j]%2==0)
					counteven++;
				else
					countodd++;
			}
		}
		System.out.println("frequency of odd numbers:"+countodd);
		System.out.println("frequency of even numbers:"+counteven);
			}

			}


