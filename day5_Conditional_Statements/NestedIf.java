package day5_Conditional_Statements;

public class NestedIf {

	public static void main(String[] args) {

		int age = 22;
		boolean hasLicense = true;

		if (age >= 18) {

			if (hasLicense) {
				System.out.println("Eligible to Drive");
			} else {
				System.out.println("License Required");
			}

		} else {
			System.out.println("Not Eligible");
		}
	}
}
