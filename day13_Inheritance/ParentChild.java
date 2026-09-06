package day13_Inheritance;

class ParentDemo {

	String name = "Parent";

	void displayParent() {
		System.out.println("This is Parent class");
	}
}

public class ParentChild extends ParentDemo {

	String childName = "Child";

	void displayChild() {
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {

		ParentChild object = new ParentChild();

		System.out.println(object.name);

		object.displayParent();
		object.displayChild();
	}
}
