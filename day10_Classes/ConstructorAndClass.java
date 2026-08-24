package day10_Classes;

public class ConstructorAndClass {

	String name;
	int age;

	ConstructorAndClass(String name, int age) {

		this.name = name;
		this.age = age;
	}

	void display() {

		System.out.println("Name: " + name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {

		ConstructorAndClass student =
				new ConstructorAndClass("Tanvi", 21);

		student.display();
	}
}