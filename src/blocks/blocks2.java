package blocks;

public class blocks2 {
	
	{
		System.out.println("Hi I am non static block");
	}
	

	public static void main(String[] args) {
		
		blocks2 b = new blocks2(); 
		
		System.out.println("Hey, I am inside main method");
	
	}
	
	
	{
		System.out.println("Hi I am another non static block");
	}

}
