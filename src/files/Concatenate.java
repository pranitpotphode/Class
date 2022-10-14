package files;

public class Concatenate {
	
	public static void main(String[] args) {

		System.out.println(20 + 30 + 10);  //60
		System.out.println("20" + 30 + 10 + 50);  //203010
		
		
	   // String	+    number  = 2030  "2030"
		//String (2030)    +    number(10)  = 203010
		
		System.out.println(20 + 30 + "10");    //5010
		
		//number (20)  + number (30) = 50
		//number (50)  +  String (10) = 5010
		
		System.out.println(20 + 30 + "Hello"); //50Hello
		System.out.println("Hello" + 20 + 30); //Hello2030
		
		System.out.println(20 + "30" + 10);  //203010
		
		
	}

}
