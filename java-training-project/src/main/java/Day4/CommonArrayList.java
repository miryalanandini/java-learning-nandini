package Day4;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonArrayList {
//	1. Find Common Elements Between Two ArrayLists
//	Input: Two ArrayList<Integer>
//
//	Output: New ArrayList with common elements
	public static void main(String[] args) {
		ArrayList<Integer>  list1 = new ArrayList<>(Arrays.asList(10,11,12,34,2));
		ArrayList<Integer>  list2 = new ArrayList<>(Arrays.asList(89,2,9,10));
		ArrayList<Integer>  list3 = new ArrayList<>();
		for(int i = 0;i<list1.size();i++) {
			for(int j = 0;j<list2.size();j++){
				if(list1.get(i)== list2.get(j)) {
					list3.add(list1.get(i));
				}
			}
			
		}
		System.out.println(list3);
	}
}
