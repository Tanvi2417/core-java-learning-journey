package day13_Inheritance;

class Grandparent {

	void property() {
		System.out.println("Grandparent's property");
	}
}

class Parent extends Grandparent {

	void house() {
		System.out.println("Parent's house");
	}
}

public class MultilevelInheritance extends Parent {

	void car() {
		System.out.println("Child's car");
	}

	public static void main(String[] args) {

		MultilevelInheritance child =
				new MultilevelInheritance();

		child.property();
		child.house();
		child.car();
	}
}
