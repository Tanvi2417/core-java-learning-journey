package day15_Abstraction;

abstract class BankAccount {

	abstract void calculateInterest();

	void accountType() {
		System.out.println("This is a bank account");
	}
}

class SavingsAccount extends BankAccount {

	@Override
	void calculateInterest() {
		System.out.println("Savings account interest calculated");
	}
}

class CurrentAccount extends BankAccount {

	@Override
	void calculateInterest() {
		System.out.println("Current account interest calculated");
	}
}

public class BankDemo {

	public static void main(String[] args) {

		SavingsAccount savings = new SavingsAccount();

		savings.accountType();
		savings.calculateInterest();

		System.out.println();

		CurrentAccount current = new CurrentAccount();

		current.accountType();
		current.calculateInterest();
	}
}
