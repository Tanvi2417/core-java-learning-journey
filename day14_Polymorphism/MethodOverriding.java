package day14_Polymorphism;

class AnimalDemo {

	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class DogDemo extends AnimalDemo {

	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		DogDemo dog = new DogDemo();

		dog.sound();
	}
}
