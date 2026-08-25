package day11_Objects;

class Car {

	String brand;
	String color;
	int speed;
}

public class ObjectState {

	public static void main(String[] args) {

		Car car = new Car();

		car.brand = "Toyota";
		car.color = "White";
		car.speed = 80;

		System.out.println("Brand : " + car.brand);
		System.out.println("Color : " + car.color);
		System.out.println("Speed : " + car.speed);
	}
}
