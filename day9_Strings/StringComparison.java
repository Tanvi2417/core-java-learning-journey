package day9_Strings;

public class StringComparison {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");

		System.out.println("Using == : " + (str1 == str2));
		System.out.println("Using == : " + (str1 == str3));

		System.out.println("Using equals() : " + str1.equals(str3));
		System.out.println("Using equalsIgnoreCase() : "
				+ str1.equalsIgnoreCase("JAVA"));
	}
}
