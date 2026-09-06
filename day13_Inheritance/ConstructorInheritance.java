package day13_Inheritance;

class ParentConstructor {

	ParentConstructor() {
		System.out.println("Parent constructor");
	}
}

public class ConstructorInheritance extends ParentConstructor {

	ConstructorInheritance() {
		System.out.println("Child constructor");
	}

	public static void main(String[] args) {

		ConstructorInheritance object =
				new ConstructorInheritance();
	}
}
