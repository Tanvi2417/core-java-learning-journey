package day10_Classes;

public class Book {

	String title;
	String author;
	double price;

	void displayBook() {

		System.out.println("Title  : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price  : " + price);
	}

	public static void main(String[] args) {

		Book book = new Book();

		book.title = "Java Programming";
		book.author = "James Gosling";
		book.price = 599;

		book.displayBook();
	}
}