package day16_ExceptionHandling;

public class ThrowDemo {

	static void checkAge(int age) {

		if (age < 18) {

			throw new ArithmeticException("Age must be 18 or above");
		}

		System.out.println("Eligible to vote");
	}

	public static void main(String[] args) {

		try {

			checkAge(16);

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
		}
	}
}