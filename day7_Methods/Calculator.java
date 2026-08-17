package day7_Methods;

public class Calculator {

	static int add(int a, int b) {
		return a + b;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		System.out.println("Addition       : " + add(a, b));
		System.out.println("Subtraction    : " + subtract(a, b));
		System.out.println("Multiplication : " + multiply(a, b));
		System.out.println("Division       : " + divide(a, b));
	}
}
