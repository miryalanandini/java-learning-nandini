package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class configExample {
//	Create a config.txt with content like:
//		browser=chrome
//		url=https://testsite.com
//		timeout=30
//		Write Java code to:
//		Read this file
//		Load values into a HashMap<String, String>
//		Handle FileNotFoundException
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KSPL\\Desktop\\config.txt"));
	HashMap<String,String> config = new HashMap<>();
//	String key;
//	String value;
	ArrayList<String> ar = new ArrayList<>();
	String line;
	while((line = br.readLine())!=null) 
	{
		if (line.trim().isEmpty()) continue;
		String[] parts= line.split("=", 2);
		if(parts.length==2) {
			String key = parts[0];
			String value = parts[1];
			config.put(key, value);
		}
		
	}br.close();
	//config.put("config", ar);
    System.out.println("✅ Config Loaded:");
    for (String key : config.keySet()) {
        System.out.println(key + " => " + config.get(key));
    }
	System.out.println(config);
		
	}

}
