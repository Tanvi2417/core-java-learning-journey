package day13_Inheritance;

class Animal {

	void eat() {
		System.out.println("Animal is eating");
	}
}

public class SingleInheritance extends Animal {

	void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {

		SingleInheritance dog = new SingleInheritance();

		dog.eat();
		dog.bark();
	}
}
