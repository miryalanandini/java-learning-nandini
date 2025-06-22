package Day4;

import java.util.HashMap;
import java.util.Map;

public class StudentMarksHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> markslist = new HashMap<>();
		markslist.put("nandini", 98);
		markslist.put("test1", 89);
		markslist.put("test2", 80);
		markslist.put("test3", 70);
		markslist.put("test4", 96);
		int topmarks = 0;
		String topper = null;
		System.out.println(markslist);

		for (Map.Entry<String, Integer> entry : markslist.entrySet()) {
			if (entry.getValue() > topmarks) {
				topmarks = entry.getValue();
                topper = entry.getKey();
                      }
			
		} System.out.println("🏆 Topper: " + topper);
        System.out.println("🎯 Marks: " + topmarks);

		
		

	}

}
