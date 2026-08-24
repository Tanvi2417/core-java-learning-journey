package day10_Classes;

public class Car {

	String brand;
	String color;
	int speed;

	void displayCar() {

		System.out.println("Brand : " + brand);
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed + " km/h");
	}

	void accelerate() {

		speed = speed + 20;

		System.out.println("Current Speed: " + speed + " km/h");
	}

	public static void main(String[] args) {

		Car car = new Car();

		car.brand = "Toyota";
		car.color = "White";
		car.speed = 60;

		car.displayCar();
		car.accelerate();
	}
}
