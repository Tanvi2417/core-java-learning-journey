package day11_Objects;

class ArrayStudent {

	String name;
	int marks;

	ArrayStudent(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {

		ArrayStudent[] students = new ArrayStudent[3];

		students[0] = new ArrayStudent("Tanvi", 85);
		students[1] = new ArrayStudent("Rahul", 78);
		students[2] = new ArrayStudent("Priya", 92);

		for (ArrayStudent student : students) {

			System.out.println("Name  : " + student.name);
			System.out.println("Marks : " + student.marks);
			System.out.println();
		}
	}
}