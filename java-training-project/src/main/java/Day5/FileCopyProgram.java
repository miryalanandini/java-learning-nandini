package Day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
//Read content from input.txt and write it to copied.txt
//Use BufferedReader and BufferedWriter
//Line-by-line copy
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KSPL\\Desktop\\input.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\KSPL\\Desktop\\copied.txt"));
    String line;
    while((line = br.readLine())!= null)
    {
    	bw.write(line);
    	bw.newLine();
    }
    System.out.println("Data is copied to copied.txt"  );
    
    br.close();
    bw.close();
	}

}
