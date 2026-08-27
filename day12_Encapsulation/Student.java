package day12_Encapsulation;


public class Student {

	private String name;
	private int age;
	private double marks;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.setName("Tanvi");
		student.setAge(21);
		student.setMarks(85.5);

		System.out.println("Name       : " + student.getName());
		System.out.println("Age        : " + student.getAge());
		System.out.println("Marks      : " + student.getMarks());
	}
}
