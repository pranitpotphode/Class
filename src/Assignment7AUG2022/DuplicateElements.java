package Assignment7AUG2022;

public class DuplicateElements {

	public static void main(String[] args) {
		String arr[] = {"Ronaldo", "Messi", "Jijus", "Hasard", "Ronaldo"};
		
		boolean flag = false;
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=i+1; j<arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element is ==> " + arr[i]);
					flag=true;
				}
				
			}
			
		}
            
		if (flag==false) {
			System.out.println("Duplicate Elements not found");
			}
	   }

}
