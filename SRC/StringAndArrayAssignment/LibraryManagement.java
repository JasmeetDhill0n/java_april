package StringAndArrayAssignment;

import java.util.Scanner;

public class LibraryManagement {
    /*Library Book Management A library stores a list of book titles.
    Create a Java program that uses a string array to store 6 book titles.
    Write functions that: • Searches for a specific book title entered by the user.
        • Replaces a specific book title in the array if a user wants to update the library records.

     */
    public static void main(String[] args) {
        String [] bookTitle = {"Adventure","the sun","life ","mercent of venice","Treaure island"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title you want to search--");
        String choice = scanner.nextLine();

        boolean found  = false;
        for(int i =0;i<bookTitle.length;i++) {
            if (bookTitle[i].equals(choice)) {
                System.out.println(bookTitle[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("book not found");
        }

        System.out.println("enter the rename book title - ");

        String newTilte = scanner.nextLine();
        boolean rename = false;

        for(int i =1;i<bookTitle.length;i++){
            newTilte = bookTitle[i];
            rename = true;
        }
        System.out.println("renamed book title  - "+newTilte);
        System.out.println("all book title name - ");
        for(int i =0;i<bookTitle.length;i++){
            System.out.println(bookTitle);
        }
    }
}
