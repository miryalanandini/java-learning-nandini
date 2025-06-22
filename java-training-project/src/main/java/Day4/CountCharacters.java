package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. Count Characters in a String Using HashMap
//		Input: "testing"
//
//		Output: {t=2, e=1, s=1, i=1, n=1, g=1}
		String word = "testing";
		HashMap<String, Integer> charactercount = new HashMap<>();
		ArrayList<String> charcter = new ArrayList<>(Arrays.asList(word.split("")));
		System.out.println(charcter);
		for(int i=0;i<charcter.size();i++) {
			String letter = charcter.get(i);
			if(charactercount.containsKey(letter)) {
				charactercount.put(letter, charactercount.get(letter)+1);
			}else {
				charactercount.put(letter, 1);
			}
		}
		System.out.println(charactercount);
	}

}
