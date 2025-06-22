package Day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KSPL\\Desktop\\txt1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\KSPL\\Desktop\\results.txt"));
		String line;
		
		while((line = br.readLine())!= null){
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}

		  br.close();
	      bw.close();
		

	}	

}
