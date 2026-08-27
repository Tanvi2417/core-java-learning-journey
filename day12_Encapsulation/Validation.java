package day12_Encapsulation;

class Account {

	private double balance;

	public void setBalance(double balance) {

		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Balance cannot be negative");
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class Validation {

	public static void main(String[] args) {

		Account account = new Account();

		account.setBalance(5000);

		System.out.println("Balance: " + account.getBalance());

		account.setBalance(-1000);
	}
}