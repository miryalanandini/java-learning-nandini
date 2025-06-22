package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String sentence = "This is My Name and My Place";
      HashMap<String, Integer> count = new HashMap<String, Integer>();
      String[] word = sentence.split(" ");
      ArrayList<String> words = new ArrayList<>(Arrays.asList(word));
      System.out.println(words);
      for(int i=0;i<words.size();i++) {
    	  String name = words.get(i);
    	  if(count.containsKey(name)) {
    		  
    		  count.put(name, count.get(name)+1);
    		  
    	  }else {
    		  count.put(name, 1);
    	  }
      }
      System.out.println(count);
      
	}

}
