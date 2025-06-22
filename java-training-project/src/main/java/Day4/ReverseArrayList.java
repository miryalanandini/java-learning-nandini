package Day4;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {

	public static void main(String[] args) {
//		Reverse an ArrayList Without Using Collections.reverse()
//		Input: ["Java", "Python", "Selenium"]
//		Output: ["Selenium", "Python", "Java"]
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Selenium"));
        ArrayList<String> reverse = new ArrayList<>();
        for(int i = list.size()-1;i>=0;i--) {
        	reverse.add(list.get(i));
        }
        System.out.println("Orginal List: " + list);
        System.out.println("Reverse: " + reverse);
	}

}
