package day10_Classes;

class Person {

	String name;
	int age;

	void displayPerson() {

		System.out.println("Name: " + name);
		System.out.println("Age : " + age);
	}
}

public class MultipleClasses {

	public static void main(String[] args) {

		Person person = new Person();

		person.name = "Tanvi";
		person.age = 21;

		person.displayPerson();
	}
}