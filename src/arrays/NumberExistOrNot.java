package arrays;

import java.util.Scanner;

public class NumberExistOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = {23, 12, 45, 70, 1, 2, 34};
        boolean found = false;


            System.out.println("enter the number you want to check - ");
            int n = scanner.nextInt();

           // boolean found = false;

            for (int i = 0; i < 7; i++) {
                n = number[i];
                found = true;

            }
            if (true) {
                System.out.println("yes number is listed in array");

            } else {
                System.out.println("no,number is not in array");


            }
        }
    }
