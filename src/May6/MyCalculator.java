package May6;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my Calculator");
        System.out.println(" 1) ADDITION");
        System.out.println(" 2) SUBSTRACTION");
        System.out.println(" 3 MULTIPLICATION");
        System.out.println(" 4) DIVISION");
        System.out.println(" 5) MODULAS");
        System.out.println(" 6) EXIT");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option:");
        int options = scanner.nextInt();

        System.out.println("Enter num 1 - ");
        int num1 =  scanner.nextInt();

        System.out.println("Enter num 2 -");
        int num2 =  scanner.nextInt();

        if (options == 1){
            int sum = num1+num2;
            System.out.println("sum of num1 and num2-"+sum);
        }
        else if (options == 2)
        {
            int sub = num1 - num2;
            System.out.println("Substration of num1 and num2- " + sub);
        }
        else if (options == 3)
        {
            int mul = num1 * num2;
            System.out.println("Multiplication of num1 and num2- " + mul);
        }
        else if (options == 4)
            {
                float division = num1 / num2;
                System.out.println("Division of num1 and num2- " + division);
            }
        else if (options == 5)
            {
                float modulas = num1 % num2;
                System.out.println("Modulas of num1 and num2- " + modulas);
            }
        else {

                System.out.println("Exit");

            }

    }
}
