package Day3;

public class Developer extends Employee{
	
	public void work() {
		System.out.println("He is working as a developer");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.work();
		Employee  d= new Developer();
		d.work();

	}

}
