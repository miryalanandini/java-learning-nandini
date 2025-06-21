package Day3;

public class Cat extends Animal{
	 void sound() {
		 System.out.println("This is cat sound");
	 }
	 
	 public static void main(String[] args) {
		 Animal an = new Animal();
		 an.sound();
		 Animal d = new Dog();
		 d.sound();
		 Animal c = new Cat();
		 c.sound();
		 
	 }
}
