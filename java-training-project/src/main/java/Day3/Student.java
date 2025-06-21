package Day3;

public class Student {
	String name;
	int rollno;
	double marks;
	
	public Student(String name, int rollno, double marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		System.out.println("Name : " + name + " rollno: " + rollno +"marks: " + marks);
		
	}
	
	public static void main(String[] args) {
		Student st = new Student("Nandini",101,80.5);
	}

}
