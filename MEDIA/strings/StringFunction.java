package strings;

import java.util.Scanner;

public class StringFunction {
    //Write a Java program to:
    //
    //Ask the user to enter their full name.
    //
    //Print the length of the name.
    //
    //Convert the name to uppercase.
    //
    //Print the first 3 characters using substring.
    //
    //Replace all spaces with dashes (-).

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the full name - ");
        String fullName = scanner.nextLine();

        System.out.println("length - "+fullName.length());

        System.out.println("full name in upper case - "+fullName.toUpperCase());

        System.out.println("first three letter - "+fullName.substring(0, 3));

        System.out.println(fullName.replace(" ","-"));


    }

}
