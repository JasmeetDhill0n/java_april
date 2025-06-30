package ArrayListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManageStudentName {
    //Manage Student Names
    //Create an ArrayList<String> to store student names.
    //Add at least 10 student names.
    //Print all student names.
    //Remove a student by name.
    //Update the name of a student at a given index.
    //Search for a student’s name and print their index.
    //Sort the list alphabetically and print.
        public static void main(String[] args) {
            // 1. Create ArrayList and add student names
            ArrayList<String> students = new ArrayList<>();
            students.add("Arsh");
            students.add("Jasmeet");
            students.add("Mohit");
            students.add("Satwinder");
            students.add("Maher");
            students.add("Gurjot");
            students.add("Gurleen");
            students.add("Love");
            students.add("Darshan");
            students.add("Simran");

            // 2. Print all student names
            System.out.println("All students:");
            for (String name : students) {
                System.out.println(name);
            }

            // 3. Remove a student by name
            students.remove("Maher");  // removes first occurrence
            System.out.println("\nAfter removing 'Maher': " + students);

            // 4. Update the name at index 2
            students.set(2, "Manpreet");  // replaces Mohit with Manpreet
            System.out.println("\nAfter updating index 2: " + students);

            // 5. Search for a student name and print index
            int index = students.indexOf("Love");
            if (index != -1) {
                System.out.println("\n'Love' found at index: " + index);
            } else {
                System.out.println("\n'Love' not found in the list");
            }

            // 6. Sort the list alphabetically
            Collections.sort(students);
            System.out.println("\nSorted list:");
            for (String name : students) {
                System.out.println(name);
            }
        }
    }