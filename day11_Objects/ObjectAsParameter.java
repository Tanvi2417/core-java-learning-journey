package day11_Objects;


class Student {

	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class ObjectAsParameter {

	static void displayStudent(Student student) {

		System.out.println("Name  : " + student.name);
		System.out.println("Marks : " + student.marks);
	}

	public static void main(String[] args) {

		Student student = new Student("Tanvi", 85);

		displayStudent(student);
	}
}
