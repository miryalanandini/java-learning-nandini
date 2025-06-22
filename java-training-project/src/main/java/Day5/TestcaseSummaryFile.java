package Day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Ask user for:
//Test Case ID
//Test Case Name
//Status (Pass/Fail)
//Write all of them in a file in this format:
public class TestcaseSummaryFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\KSPL\\Desktop\\summery.txt"));
		
		System.out.println("Enter number of testcases:");
		int count = scanner.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter Testcase Id");
			int id = scanner.nextInt();
			System.out.println("Enter Testcase Name");
			String name = scanner.next();
			System.out.println("Enter Testcase Status");
			String status = scanner.next();
			while (!status.equalsIgnoreCase("Y") && !status.equalsIgnoreCase("N")) {
                System.out.println("❌ Invalid status. Please re-enter (Y/N):");
                status = scanner.next();
            }

			bw.write(id + "," + name + "," + status);
			bw.newLine();
	
			
			
		}
		bw.close();
		System.out.println("Updated in file2");
		
	}

}
