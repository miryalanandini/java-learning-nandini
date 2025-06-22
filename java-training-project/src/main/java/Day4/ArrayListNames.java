package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNames {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many names you want in an array:");
		int size = scanner.nextInt();
		 scanner.nextLine(); 
		for(int i=1;i<=size;i++) {
			System.out.println("Enter Names " + i + " : ");
			names.add(scanner.nextLine());
		}
		
		System.out.println(names);		

	}

}
