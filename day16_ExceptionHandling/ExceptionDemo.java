package day16_ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {

			String name = null;

			System.out.println(name.length());

		} catch (NullPointerException e) {

			System.out.println("Object is null");

		} finally {

			System.out.println("Execution completed");
		}
	}
}
