package day2_Variables_and_DataTypes;
import java.util.Scanner;

public class ScannerInputEx {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Name : ");
			String name = sc.nextLine();

			System.out.print("Enter Age : ");
			int age = sc.nextInt();

			System.out.println();

			System.out.println("Name : " + name);
			System.out.println("Age  : " + age);

			sc.close();
		}
	}

