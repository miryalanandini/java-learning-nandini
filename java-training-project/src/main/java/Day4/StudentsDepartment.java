package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentsDepartment {

	public static void main(String[] args) {
//		Input: Map<String, ArrayList<String>>
//		Key = Dept, Value = List of student names
//		Populate:
//		CSE = [“Nandini”, “Anil”]
//		ECE = [“Ravi”, “Neha”]
//		Print students grouped by dept

		HashMap<String, ArrayList<String>> stuDepartment = new HashMap<>();
		ArrayList<String> cseStudent = new ArrayList<>(Arrays.asList("Nandini", "Anil"));
		ArrayList<String> eceStudent = new ArrayList<>(Arrays.asList("Ravi", "Neha"));
		stuDepartment.put("CSE", cseStudent);
		stuDepartment.put("ECE", eceStudent);
		for(Map.Entry<String,ArrayList<String>> entry : stuDepartment.entrySet()) {
			String dept = entry.getKey();
			ArrayList<String> students = entry.getValue();
	         System.out.println("Department: " + dept);
	            System.out.println("Students: " + students);
	            System.out.println("-------------------------");
		}
		
		
}
}