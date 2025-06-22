package Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\KSPL\\Desktop\\txt1.txt")); 
		String line;
		while((line = b.readLine())!= null) {
			System.out.println(line);
		}
		
	} catch ( IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	} finally{
		System.out.println("Exceution is done");
	}
	}

}
