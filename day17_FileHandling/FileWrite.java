package day17_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {

		try {

			FileWriter writer = new FileWriter("student.txt");

			writer.write("Name: Tanvi\n");
			writer.write("Course: Core Java\n");
			writer.write("Day: 17\n");

			writer.close();

			System.out.println("Data written successfully");

		} catch (IOException e) {

			System.out.println("Error while writing file");
		}
	}
}
