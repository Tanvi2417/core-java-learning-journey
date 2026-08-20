package day9_Strings;

public class StringMethods {

	public static void main(String[] args) {

		String text = "Java Programming";

		System.out.println("Length       : " + text.length());
		System.out.println("Uppercase    : " + text.toUpperCase());
		System.out.println("Lowercase    : " + text.toLowerCase());
		System.out.println("Character    : " + text.charAt(2));
		System.out.println("Substring    : " + text.substring(5));
		System.out.println("Contains Java: " + text.contains("Java"));
		System.out.println("Starts With  : " + text.startsWith("Java"));
		System.out.println("Ends With    : " + text.endsWith("ing"));
	}
}