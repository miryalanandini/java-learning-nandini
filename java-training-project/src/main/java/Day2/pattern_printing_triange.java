package Day2;

public class pattern_printing_triange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n =5;
     for(int i =1;i<=n+1;i++) {
    	 for (int s = 1; s <= n - i+1; s++) {
             System.out.print(" ");
         }
    	 for (int j=1;j<i;j++) {
    		 System.out.print(j+ " ");
    	 }System.out.println("");
    	 
     }
	}

}
