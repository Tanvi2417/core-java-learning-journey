package day1_JavaBasics;

/*
 * Program Name : JavaProgramStructure
 * Description  : Basic Structure of Java Program
 */

public class JavaProgramStructure {

    static int number = 100;

    public static void displayMessage() {

        System.out.println("This is a user-defined method.");

    }

    public static void main(String[] args) {

        System.out.println("Program Started");

        displayMessage();

        System.out.println("Number = " + number);

        System.out.println("Program Ended");

    }

}