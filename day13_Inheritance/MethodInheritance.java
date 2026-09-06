package day13_Inheritance;

class Calculator {

	int add(int a, int b) {
		return a + b;
	}
}

public class MethodInheritance extends Calculator {

	int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		MethodInheritance calculator =
				new MethodInheritance();

		System.out.println("Addition: "
				+ calculator.add(10, 20));

		System.out.println("Multiplication: "
				+ calculator.multiply(10, 20));
	}
}
