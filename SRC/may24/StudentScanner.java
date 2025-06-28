package may24;

import java.util.Scanner;

public class StudentScanner {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[3];
   // System.out.println("Enter the elements of array");
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;

    for (int i = 0; i <arr.length ; i++) {
      //  arr[i] = scanner.nextInt();
    }

   // System.out.println("Print all the elements ");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}