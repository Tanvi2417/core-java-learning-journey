package day15_Abstraction;

interface PaymentMethod {

	void pay();
}

class UPIPayment implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("Payment made using UPI");
	}
}

class CardPayment implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("Payment made using Card");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		UPIPayment upi = new UPIPayment();
		upi.pay();

		CardPayment card = new CardPayment();
		card.pay();
	}
}
