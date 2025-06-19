package com.mycompany.javatraining;

public class reverse {
	public static void main(String[] args) {
		int number =1234;
		int reverse = 0;
		
		
		for(int i=1;i<=4;i++) {
			
			int number1 = number%10;
			reverse = (reverse*10) + number1;
			number = number/10;
		} System.out.println("Reversed number: " + reverse);
	}

}
