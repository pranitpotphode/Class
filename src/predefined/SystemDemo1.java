package predefined;

import java.io.IOException;

public class SystemDemo1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome to java");
		System.out.println();
		System.out.println("Hello World");
		
		System.err.println("Kindly participate in sessions/classes to answer the question");
		
		int i = System.in.read();
		char ch = (char)i;
		
		System.out.println(ch);

	}

}