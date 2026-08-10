package day2_Variables_and_DataTypes;

public class TypeCastingEx {

		public static void main(String[] args) {

			// Widening
			int number = 100;
			double value = number;

			System.out.println("Integer : " + number);
			System.out.println("Double  : " + value);

			System.out.println();

			// Narrowing
			double marks = 89.75;
			int total = (int) marks;

			System.out.println("Double  : " + marks);
			System.out.println("Integer : " + total);

		}
	}
