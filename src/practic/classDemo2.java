package practic;


	interface P4 {
		
		void print();   // OR   //public abstract void print();
		void present();
	}

	interface P5 {
		
		void print();
		void show();
	}

	interface P6 {
		
		//Introduced in Java 8  - static methods which includes method body
		public static void display() {
			System.out.println("this is display method");
			
			
		}
		
		public abstract void print();
		
	}

	//fn + f3

	public class classDemo2 implements P4, P5, P6 {

		public static void main(String[] args) {
			classDemo2 ref = new classDemo2();
			ref.print();
			ref.show();
			ref.present();
			
		}
		
		public void print() {
			System.out.println("Print method ");
		}
		
		public void show() {
			System.out.println("Show method ");	
		}

		public void present() {
			System.out.println("Present method ");
		}
		

	}


