package predefined;

public class SystemDemo2 {

public static void main(String[] args) {
		
		System.out.println("System user directory " + System.getProperty("user.home"));
		
		System.out.println("Work directory " + System.getProperty("user.dir"));
		
		//System.exit(0);
		
		System.out.println(System.getProperty("user.country"));
		
		System.out.println("System Password " + System.getProperty("user.password"));

		System.out.println("work time " + System.getProperty("user.time"));
		
	}

}