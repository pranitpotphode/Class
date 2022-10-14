package Exceptions;

public class ExceptionDemo6 {
	public static void main(String[] args) {
		
		try {
			ageValidation(10);
			bloodgrpValidation("A+");
		}
		catch(Throwable ex) {
			ex.printStackTrace();
		}
		
	}
			
	
	public static void ageValidation(int age) throws Throwable {
		
		if(age<18) {
			//System.out.println("Not eligible to vote");
			throw new Throwable("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
		
	}
	
	public static void bloodgrpValidation(String bloodgrp) {
		
		if((bloodgrp == "A+") || (bloodgrp == "B+") || (bloodgrp == "O+")) {
			System.out.println("Can donate blood");
		}
		else {
			System.out.println("Can not donate blood");
		}
		
	}

}