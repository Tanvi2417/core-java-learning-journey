package day15_Abstraction;

abstract class Shape {

	abstract void area();

	void display() {
		System.out.println("This is a shape");
	}
}

class Circle extends Shape {

	double radius = 5;

	@Override
	void area() {
		double result = 3.14 * radius * radius;
		System.out.println("Circle Area: " + result);
	}
}

class Rectangle extends Shape {

	int length = 10;
	int width = 5;

	@Override
	void area() {
		int result = length * width;
		System.out.println("Rectangle Area: " + result);
	}
}

public class ShapeDemo {

	public static void main(String[] args) {

		Circle circle = new Circle();

		circle.display();
		circle.area();

		System.out.println();

		Rectangle rectangle = new Rectangle();

		rectangle.display();
		rectangle.area();
	}
}
