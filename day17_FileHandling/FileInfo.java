package day17_FileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("student.txt");

		if (file.exists()) {

			System.out.println("File Name: " + file.getName());
			System.out.println("File Path: " + file.getAbsolutePath());
			System.out.println("File Size: " + file.length() + " bytes");
			System.out.println("Can Read: " + file.canRead());
			System.out.println("Can Write: " + file.canWrite());

		} else {

			System.out.println("File does not exist");
		}
	}
}