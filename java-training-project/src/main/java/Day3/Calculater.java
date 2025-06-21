package Day3;

public class Calculater {
	void add(int a,int b) {
		System.out.println("Add integer: " + a+b);
	}
	void add(double a,double b) {
		System.out.println("Add decimal: " + a+b);
	}
	void add(String a,String b) {
		System.out.println("String: " + a +" " + b);
	}
	
	public static void main(String[] args) {
		Calculater cal = new Calculater();
		cal.add(10,10);
		cal.add(1.1, 2.0);
		cal.add("TEST", "Learning");
	}

}
