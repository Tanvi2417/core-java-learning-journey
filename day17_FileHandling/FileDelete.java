package day17_FileHandling;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {

		File file = new File("student_copy.txt");

		if (file.delete()) {

			System.out.println("File deleted successfully");

		} else {

			System.out.println("File not found");
		}
	}
}