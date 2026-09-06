package day15_Abstraction;

abstract class VehicleAbstract {

	abstract void start();

	void stop() {
		System.out.println("Vehicle stopped");
	}
}

class CarAbstract extends VehicleAbstract {

	@Override
	void start() {
		System.out.println("Car starts with a key");
	}
}

class BikeAbstract extends VehicleAbstract {

	@Override
	void start() {
		System.out.println("Bike starts with a button");
	}
}

public class VehicleDemo {

	public static void main(String[] args) {

		CarAbstract car = new CarAbstract();

		car.start();
		car.stop();

		System.out.println();

		BikeAbstract bike = new BikeAbstract();

		bike.start();
		bike.stop();
	}
}
