package day7_Methods;

public class MethodWithReturnValue {

	static int add(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		int result = add(20, 30);

		System.out.println("Addition = " + result);
	}
}
