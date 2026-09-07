package day17_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {

		try {

			FileWriter writer =
					new FileWriter("student.txt", true);

			writer.write("Status: Learning Java\n");

			writer.close();

			System.out.println("Data appended successfully");

		} catch (IOException e) {

			System.out.println("Error while appending data");
		}
	}
}
