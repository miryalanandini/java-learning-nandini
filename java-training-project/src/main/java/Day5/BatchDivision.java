package Day5;

import java.util.Scanner;

//Take:
//Total test cases = 100
//Ask user: “How many batches do you want to divide into?”
//✅ If input is 0, throw and catch ArithmeticException
//✅ Else show how many test cases per batch


public class BatchDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total number of testcases: ");
		int numberofTestcases = scanner.nextInt();
		System.out.println("Enter how many batches: ");
		int numberofbatches = scanner.nextInt();
//		int test =0;
//		if(numberofbatches!=0) {
//			test = numberofTestcases/numberofbatches;
//			System.out.println("No of testcases per batch: "+ test );
//			
//		}else {
//			try {
//			test = numberofTestcases/numberofbatches;
//			}catch(ArithmeticException e) {
//				System.out.println(e.getMessage());
//			}
//		}
        try {
        	int test = numberofTestcases/numberofbatches;
        	System.out.println("No of testcases per batch: "+ test );
        }catch(ArithmeticException e) {
			System.out.println("❌ Cannot divide by zero: " + e.getMessage());
		}

	}

}
