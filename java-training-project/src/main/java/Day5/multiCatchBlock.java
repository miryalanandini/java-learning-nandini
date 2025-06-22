package Day5;

public class multiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6};
		
		try {
		int[] arr1 = null;
		System.out.println(arr1.length);
		System.out.println(arr[10]);
	
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
