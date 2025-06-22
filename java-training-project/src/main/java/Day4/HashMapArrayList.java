package Day4;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayList {

	public static void main(String[] args) {
		
		ArrayList<HashMap<String,String>> employeelist = new ArrayList<>();
		HashMap<String,String> emp1 = new HashMap<>();
		emp1.put("name","nandini");
		emp1.put("id", "E101");
        emp1.put("dept", "QA");
        employeelist.add(emp1);
        
        HashMap<String,String> emp2 = new HashMap<>();
		emp2.put("name","nandu");
		emp2.put("id", "E102");
        emp2.put("dept", "QA");
        employeelist.add(emp2);
        
        HashMap<String,String> emp3 = new HashMap<>();
		emp3.put("name","uday");
		emp3.put("id", "E103");
        emp3.put("dept", "QA");
        employeelist.add(emp3);
        System.out.println(employeelist);
	}

}
