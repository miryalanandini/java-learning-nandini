package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class evenOdd {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\KSPL\\Desktop\\number.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextInt()) {
			int number1 = scanner.nextInt();
			if(number1%2==0) {
				System.out.println(number1 +" Is even");
			}else {
				System.out.println(number1 +" Is odd");
			}
		}
	}
}
