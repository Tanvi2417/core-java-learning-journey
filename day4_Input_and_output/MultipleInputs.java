package day4_Input_and_output;

import java.util.Scanner;

public class MultipleInputs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		System.out.print("Enter Percentage: ");
		double percentage = sc.nextDouble();

		System.out.print("Enter Grade: ");
		char grade = sc.next().charAt(0);

		System.out.println("\n----- Student Details -----");
		System.out.println("Name       : " + name);
		System.out.println("Age        : " + age);
		System.out.println("Percentage : " + percentage);
		System.out.println("Grade      : " + grade);

		sc.close();
	}
}
