package day12_Encapsulation;


public class BankAccount {

	private String accountHolder;
	private double balance;

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Deposited: " + amount);
		} else {
			System.out.println("Invalid Amount");
		}
	}

	public void withdraw(double amount) {

		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
		} else {
			System.out.println("Invalid Withdrawal");
		}
	}

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		account.setAccountHolder("Tanvi");

		account.deposit(10000);
		account.withdraw(2500);

		System.out.println("Account Holder: "
				+ account.getAccountHolder());

		System.out.println("Balance: "
				+ account.getBalance());
	}
}
