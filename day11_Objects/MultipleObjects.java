package day11_Objects;


class Employee {

	String name;
	double salary;

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

public class MultipleObjects {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		employee1.name = "Tanvi";
		employee1.salary = 45000;

		employee2.name = "Rahul";
		employee2.salary = 50000;

		employee1.display();

		System.out.println();

		employee2.display();
	}
}
