package day11_Objects;

class Employees {

	int id;
	String name;
	double salary;

	Employees(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {

		System.out.println("ID     : " + id);
		System.out.println("Name   : " + name);
		System.out.println("Salary : " + salary);
	}
}

public class EmployeeObjects {

	public static void main(String[] args) {

		Employees employee1 =
				new Employees(101, "Tanvi", 45000);

		Employees employee2 =
				new Employees(102, "Rahul", 50000);

		employee1.display();

		System.out.println();

		employee2.display();
	}
}