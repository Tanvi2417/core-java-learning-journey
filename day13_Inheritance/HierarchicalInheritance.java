package day13_Inheritance;

class Vehicle {

	void start() {
		System.out.println("Vehicle starts");
	}
}

class Car extends Vehicle {

	void driveCar() {
		System.out.println("Car is driving");
	}
}

class Bike extends Vehicle {

	void rideBike() {
		System.out.println("Bike is riding");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Car car = new Car();

		car.start();
		car.driveCar();

		System.out.println();

		Bike bike = new Bike();

		bike.start();
		bike.rideBike();
	}
}
