package day14_Polymorphism;

class Bank {

	void rateOfInterest() {
		System.out.println("General bank interest rate");
	}
}

class SBI extends Bank {

	@Override
	void rateOfInterest() {
		System.out.println("SBI interest rate: 7%");
	}
}

class HDFC extends Bank {

	@Override
	void rateOfInterest() {
		System.out.println("HDFC interest rate: 7.5%");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		Bank bank;

		bank = new SBI();
		bank.rateOfInterest();

		bank = new HDFC();
		bank.rateOfInterest();
	}
}
