package Day5;

import java.util.Scanner;

public class InvalidAgeException extends RuntimeException {
	 public InvalidAgeException(String message) {
	        super(message);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter age :");
    int age = scanner.nextInt();
    if(age<18) {
    	throw new InvalidAgeException("Age should be 18 or above");
    	
    }else {
    	System.out.println("Eligeble for voting");
    }
	}

}
