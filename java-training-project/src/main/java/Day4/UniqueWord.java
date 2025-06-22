package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueWord {
	public static void main(String[] args) {
//		7. Find Unique Words in a Sentence
//		Input: "Java is easy and Java is fun"
//		Output: {Java, is, easy, and, fun}	
		String sentence = "Java is easy and Java is fun";
		HashSet<String> unique = new HashSet<>();
		String[] arr = sentence.split(" ");
//		for(int i = 0;i<arr.length;i++) {
//			unique.add(arr[i]);
//		}
		 for (String word : arr) {
			 unique.add(word);
		 }
		System.out.println(unique);
		
				
	}
}
