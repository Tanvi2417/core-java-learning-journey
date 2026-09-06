package day14_Polymorphism;

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Addition: " + (a + b + c));
	}

	void add(double a, double b) {
		System.out.println("Addition: " + (a + b));
	}

	public static void main(String[] args) {

		MethodOverloading object = new MethodOverloading();

		object.add(10, 20);
		object.add(10, 20, 30);
		object.add(10.5, 20.5);
	}
}
