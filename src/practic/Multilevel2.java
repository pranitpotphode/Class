package practic;

class Grandparents{
		  
	    static void display() {
	 	   System.out.println("display method of class Grandparent");
	    }
	}
	//child of grandparent and parent of multilevel
	 class Parents  extends Grandparents{
		  
		  void show1() {
			  super.display();
			  show();
			  
			  System.out.println("show1 method of parent class");
		  }
		   void show() {
			  System.out.println("show method of parent class");
		  }
	}
	//child of parent
	public class Multilevel2 extends Parents {
	        public static void main(String[] args) {
	     	Parents ref = new Parents(); 
	     	
	     	 present();
	     	  System.out.println("This is child class"); 
		}
	       static void present() {
	     	   System.out.println("present method of class Multilevel");
	        }
	}

