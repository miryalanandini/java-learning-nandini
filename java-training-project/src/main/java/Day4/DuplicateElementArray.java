package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,23,10,13));
		HashSet<Integer> unilist = new HashSet<>();
		for(int i=0;i<list.size();i++) {
			unilist.add(list.get(i));
		}
		System.out.println(list);
		System.out.println(unilist);
		
		
		

	}

}
