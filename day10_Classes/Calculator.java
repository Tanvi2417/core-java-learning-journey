package day10_Classes;

public class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int subtract(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("Addition       : " + calculator.add(20, 10));
		System.out.println("Subtraction    : " + calculator.subtract(20, 10));
		System.out.println("Multiplication : " + calculator.multiply(20, 10));
		System.out.println("Division       : " + calculator.divide(20, 10));
	}
}
