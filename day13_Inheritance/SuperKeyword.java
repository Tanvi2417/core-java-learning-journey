package day13_Inheritance;

class ParentClass {

	String name = "Parent";

	void display() {
		System.out.println("Parent class method");
	}
}

public class SuperKeyword extends ParentClass {

	String name = "Child";

	void show() {

		System.out.println("Child variable: " + name);
		System.out.println("Parent variable: " + super.name);

		super.display();
	}

	public static void main(String[] args) {

		SuperKeyword object = new SuperKeyword();

		object.show();
	}
}
