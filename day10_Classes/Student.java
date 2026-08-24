package day10_Classes;

public class Student {

	String name;
	int age;
	double percentage;

	void displayDetails() {
		System.out.println("Name       : " + name);
		System.out.println("Age        : " + age);
		System.out.println("Percentage : " + percentage);
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.name = "Tanvi";
		student.age = 21;
		student.percentage = 85.5;

		student.displayDetails();
	}
}
