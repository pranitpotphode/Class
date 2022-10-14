package practic;

public class block {
		

		int age = 10;
		
		static {
			String name = "Welcome Rohit";
			
			System.out.println(name);
			
			int num1 = 10, num2 = 20;
			int result = num1 + num2;
			
			System.out.println(result);
			
			block b = new block(); 
			System.out.println(b.age);
			
		}

		public static void main(String[] args) {
			
			System.out.println("Hi this is main method");

		}

		{
			
		}


	}



