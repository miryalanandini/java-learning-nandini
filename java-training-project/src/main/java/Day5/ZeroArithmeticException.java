package Day5;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ZeroArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Divide by Zero
//		Take 2 numbers from user
//		Handle ArithmeticException
      Scanner scanner = new Scanner(System.in);
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int num3 =0;
      try {
    	  
    	  num3 = num1/num2;
    	  System.out.println(num3);
      }catch(ArithmeticException e){
    	  System.out.println("Cannot divide by zero");
    	  System.out.println("Exception message:" + e.getMessage());
      }
	}

}
