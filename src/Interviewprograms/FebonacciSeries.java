package Interviewprograms;
	

public class FebonacciSeries {
	
	public static void main(String[] args) 
	{
			int a=0,b=1,c, num=10;
			for(int i=0;i<num;i++)
			{
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
			}
	}


}



