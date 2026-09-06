package day15_Abstraction;

abstract class EmployeeAbstract {

	abstract void work();

	void company() {
		System.out.println("Employee works in a company");
	}
}

public class AbstractMethodDemo extends EmployeeAbstract {

	@Override
	void work() {
		System.out.println("Employee is working");
	}

	public static void main(String[] args) {

		AbstractMethodDemo employee = new AbstractMethodDemo();

		employee.company();
		employee.work();
	}
}
