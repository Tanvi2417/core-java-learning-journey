package day11_Objects;

class ObjStudent {

	String name;
	int age;

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class ObjectCreation {

	public static void main(String[] args) {

		ObjStudent student = new ObjStudent();

		student.name = "Tanvi";
		student.age = 21;

		student.display();
	}
}