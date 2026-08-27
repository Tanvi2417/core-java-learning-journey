package day12_Encapsulation;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {

		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary cannot be negative");
		}
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setId(101);
		employee.setName("Rahul");
		employee.setSalary(45000);

		System.out.println("ID     : " + employee.getId());
		System.out.println("Name   : " + employee.getName());
		System.out.println("Salary : " + employee.getSalary());
	}
}