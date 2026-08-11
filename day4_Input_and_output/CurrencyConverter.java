package day4_Input_and_output;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final double USD_RATE = 87.0;

		System.out.print("Enter Amount in INR: ");
		double inr = sc.nextDouble();

		double usd = inr / USD_RATE;

		System.out.printf("Amount in USD = %.2f", usd);

		sc.close();
	}
}
