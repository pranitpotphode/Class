package practic;

class test {
	
	private static void sum () { // not accessible because of private class 
		System.out.println("HI");
	}
}


public class main {
	
	public static void main (String[] args) {
		test.sum();
		
	}

}
