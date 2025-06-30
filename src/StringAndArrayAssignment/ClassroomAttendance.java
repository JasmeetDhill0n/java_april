package StringAndArrayAssignment;

import java.util.Scanner;

public class ClassroomAttendance {
  //  Classroom Attendance Tracker You are building a system for a school to track student attendance.
    //  Create a Java program that: • Uses an array to store the names of students present in the
    //  class on a particular day. • Allows the user to enter a student's name and check
    //  if they attended the class.

    public static void main(String[] args) {
        String [] studentPresent = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Present student please enter your name - ");
        System.out.println("Enter names of 5 students who are present today:");
        for (int i = 0; i < 5; i++) {
            studentPresent[i] = scanner.nextLine();
        }
        System.out.print("\nEnter a student's name to check if they were present: ");
        String nameToCheck = scanner.nextLine();
        boolean found  = false;
        for (int i = 0; i < 5; i++) {
            if (studentPresent[i].equalsIgnoreCase(nameToCheck)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(nameToCheck + " was present in class.");
        } else {
            System.out.println(nameToCheck + " was absent.");
        }

        scanner.close();
    }
}




