package Day3;

public class student_cons {
	String name;
	int age;
	String course;
	public student_cons() {
		this.name = "NA";
		this.age = 0;
		this.course ="Unknown Course";
	}
	public student_cons(String name,int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}
	void dispay() {
		System.out.println("Name of the student: " + name);
		System.out.println("age of the student: " + age);
		System.out.println("course of the student: " + course);
	}
	public static void main(String[] args) {
		student_cons s1 = new student_cons();
		student_cons s2 = new student_cons("Nandini", 25, "Java Automation");
		s1.dispay();
		s2.dispay();
	}
	

}
