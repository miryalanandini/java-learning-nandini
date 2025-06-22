package Day1;

public class leapYearSimple {
 public static void main(String[] args) {
	 int year = 1600;
	 if(year%4==0 &&(year%100 !=0 || year%400==0)) {
		 System.out.println(year + " It is leap");
	 }else {

		 System.out.println(year + " It is not leap");
	 }
 }
}
