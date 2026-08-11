package day4_Input_and_output;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Roll Number: ");
		int rollNo = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Branch: ");
		String branch = sc.nextLine();

		System.out.print("Enter Percentage: ");
		double percentage = sc.nextDouble();

		System.out.println("\n----- Student Information -----");
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name        : " + name);
		System.out.println("Branch      : " + branch);
		System.out.println("Percentage  : " + percentage);

		sc.close();
	}
}