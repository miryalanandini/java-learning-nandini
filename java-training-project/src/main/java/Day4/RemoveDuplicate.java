package Day4;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
//		 6. Remove Duplicates from Array Using HashSet
//		 Input: int[] arr = {1, 2, 2, 3, 4, 4, 5}
//		 Output: Set with unique values: {1, 2, 3, 4, 5}
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		HashSet<Integer> hashlist = new HashSet<>();
		for(int i =0;i<arr.length;i++) {
			hashlist.add(arr[i]);
		}
		System.out.println(hashlist);
		
		
		

	}

}
