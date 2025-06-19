package com.mycompany.javatraining;

import java.util.Scanner;

public class AcceptNumberAndSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1:");
		int number1 = scanner.nextInt();
		System.out.println("Enter the number2:");
		int number2 = scanner.nextInt();
		int sum = number1 + number2;
		System.out.println("Sum : " + sum);
		
		
		
	}
}
