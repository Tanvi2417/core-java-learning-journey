package day15_Abstraction;

abstract class AnimalAbstract {

	void eat() {
		System.out.println("Animal is eating");
	}

	abstract void sound();
}

public class AbstractClassDemo extends AnimalAbstract {

	@Override
	void sound() {
		System.out.println("Animal makes a sound");
	}

	public static void main(String[] args) {

		AbstractClassDemo animal = new AbstractClassDemo();

		animal.eat();
		animal.sound();
	}
}