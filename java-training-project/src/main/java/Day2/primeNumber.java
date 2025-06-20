package Day2;

public class primeNumber {
	public static void main(String[] args) {
		int number = 7;
		 boolean isPrime = true;
		if(number<=1) {
			System.out.println("It is not a prime number");
		}
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(number%i);
                isPrime = false;
                break;
			}
		}
		 if (isPrime) {
	            System.out.println(number + " is a prime number");
	        } else {
	            System.out.println(number + " is not a prime number");
	        }
}
}