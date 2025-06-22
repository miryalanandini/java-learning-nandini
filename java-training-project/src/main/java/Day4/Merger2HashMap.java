package Day4;

import java.util.HashMap;

public class Merger2HashMap {

	public static void main(String[] args) {
//		map1 = {A=1, B=2}
//		map2 = {B=3, C=4}
//		Output: {A=1, B=3, C=4} (map2 values should override)
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		HashMap<String, Integer> map2 = new HashMap<>();
		map1.put("B", 3);
		map1.put("C", 4);
		map1.putAll(map2);
		System.out.println(map1);
		
		}
		

	}


