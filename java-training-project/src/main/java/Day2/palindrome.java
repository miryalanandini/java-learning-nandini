package Day2;

public class palindrome {
	public static void main(String[] args) {
		int n1 =121;
		int reverse =0;
		int n=n1;
		 while (n != 0) {
			int r=n%10;
			reverse = (reverse*10)+r;
			n=n/10;
		}System.out.println("Reverse: " + reverse + " number: " + n1);
		if(n1==reverse) {
			System.out.println("It is palindrome");
		}else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
