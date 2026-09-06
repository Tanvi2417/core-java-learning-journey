package day14_Polymorphism;

class AnimalRuntime {

	void sound() {
		System.out.println("Animal sound");
	}
}

class DogRuntime extends AnimalRuntime {

	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class CatRuntime extends AnimalRuntime {

	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {

		AnimalRuntime animal;

		animal = new DogRuntime();
		animal.sound();

		animal = new CatRuntime();
		animal.sound();
	}
}
