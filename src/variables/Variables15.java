package variables;

public class Variables15 {

	double salary = 75989.708;  //NSGV
	   
	   static int age = 15; //SGV

	   public static void main(String args[]) {
		   
	      Variables15 empOne = new Variables15(); //Object of Variable15 Class
	    
	      System.out.println("salary :" + empOne.salary); //75989.708
	      
		  empOne.salary = 85000.78; //re-initialized salary variable
		  
		  System.out.println("salary :" + empOne.salary); //85000.78
		  
		  Variables15 empOne1 = new Variables15();  //Second Object of Variable5 Class
		  System.out.println("salary :" + empOne1.salary); //75989.708

		  ageMethod();
		  
	   }
	   
	   
	   static void ageMethod() {
		   System.out.println(age);
	   }
	   
}
