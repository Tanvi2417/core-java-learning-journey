package day10_Classes;

public class StaticMembers {

	static String collegeName = "ABC College";
	static int studentCount = 0;

	String studentName;

	StaticMembers(String studentName) {

		this.studentName = studentName;
		studentCount++;
	}

	void display() {

		System.out.println("Student: " + studentName);
		System.out.println("College: " + collegeName);
	}

	public static void main(String[] args) {

		StaticMembers student1 = new StaticMembers("Tanvi");
		StaticMembers student2 = new StaticMembers("Rahul");

		student1.display();
		student2.display();

		System.out.println("Total Students: " + studentCount);
	}
}