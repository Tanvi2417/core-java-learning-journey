package day9_Strings;

public class PalindromeString {

	public static void main(String[] args) {

		String text = "madam";

		String reverse = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = reverse + text.charAt(i);
		}

		if (text.equals(reverse))
			System.out.println(text + " is a Palindrome");
		else
			System.out.println(text + " is not a Palindrome");
	}
}
