package Day5;

import java.util.Scanner;
//📌 Simulate a login screen:
//Valid username = "admin", password = "pass123"
//Take input from user
//If wrong input, throw a custom InvalidLoginException
//Else print "Login Successful"

public class Login extends RuntimeException{
	 public Login(String message) {
	        super(message);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = scaner.next();
		System.out.println("Enter password: ");
		String password = scaner.next();	
		if(username.equals("admin") && password.equals("pass123")) {
			System.out.println("Login successful");
		}else {
			throw new Login("Invalid credentials");
		}
		

	}

}
