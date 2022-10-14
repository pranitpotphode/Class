package assingment22july;
class calculation {//parent class/super class/ existing class
	       public void display() {
		   //this.show();
		int i = 1;
		for (i=5; i>=1; i--) {
			System.out.print(i+ " ");
		}
		System.out.println("");
	}
	      public void show() {
		
        	int remainder, revNum = 0;
    		
    		int n = 9669; 
    		int temp = n;  
    		
    		while(n!=0) {
    			remainder = n%10;  
    			revNum = (revNum*10) + remainder;  
    			n = n/10; 	
    		}
    		
    		if(revNum==temp) {
    			System.out.println(revNum + " is Palindrome");
    		}
    		else {
    			System.out.println(revNum + " is not a Palindrome");
    		}	

        }
        public void present() {
        	 int year = 1991;
             if(year%4==0) {
             	System.out.println(year + " is Leap year");
             }
             else {
             	System.out.println(year + " is not Leap year");
             }
        	
        }
    		public static void car (String name) {
    			System.out.println("car name is " + name);
    		}
    }
class calculation1 extends calculation {//child class
	public void display() {
		super.car("POLO");
		super.display();
		int i = 1;
		for (i=3; i>=1; i--) {
			System.out.print(i+ " ");
		}
		System.out.println("");
	}
	
	public void show() {
		super.show();
    	int remainder, revNum = 0;
		
		int n = 5321; 
		int temp = n;  
		
		while(n!=0) {
			remainder = n%10;  
			revNum = (revNum*10) + remainder;  
			n = n/10; 	
		}
		
		if(revNum==temp) {
			System.out.print(revNum + " is Palindrome");
		}
		else {
			System.out.print(revNum + " is not a Palindrome");
		}
		System.out.println("");
    }
	 public void present() {
		 super.present();
    	 int year = 2000;
         if(year%4==0) {
         	System.out.println(year + " is Leap year");
         }
         else {
         	System.out.println(year + " is not Leap year");
         }
    	
    }
}

public class Execution {
	public static void main(String [] args) {
		
		calculation1 ref = new calculation1();
		ref.display();
		ref.show();
		ref.present();
		
	}

}


