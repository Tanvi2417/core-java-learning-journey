package day14_Polymorphism;

class StudentData {

	String name;
	int age;

	StudentData() {
		name = "Unknown";
		age = 0;
	}

	StudentData(String name) {
		this.name = name;
		age = 0;
	}

	StudentData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {

		StudentData student1 = new StudentData();
		StudentData student2 = new StudentData("Tanvi");
		StudentData student3 = new StudentData("Rahul", 22);

		student1.display();

		System.out.println();

		student2.display();

		System.out.println();

		student3.display();
	}
}
