package day9_Strings;

public class CountCharacters {

	public static void main(String[] args) {

		String text = "Java Programming";

		int count = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) != ' ') {
				count++;
			}
		}

		System.out.println("Number of Characters: " + count);
	}
}
