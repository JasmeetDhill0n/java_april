package May6;

import java.util.Scanner;

public class SwitchCalculator {
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

        if (options >= 6 || options <= 0) {
            System.out.println("Invalid option ");
            return; //exit the program without running whole code.
        }

        System.out.println("Enter Num 1 - ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Num 2 - ");
        int num2 = scanner.nextInt();


        switch (options) {
            case  1:
                int sum = num1 + num2;
                System.out.println("Sum Of Num1 and Num 2 - " + sum);
                break;

            case 2:
                int sub = num1 - num2;
                System.out.println("Sub of Num1 and Num2 - " + sub);
                break;

            case 3:
                int mul = num1 * num2;
                System.out.println("Multiplication of Num1 and Num 2 - " + mul);
                break;

            case 4:
                float div = num1 / num2;
                System.out.println("Division of Num1 and Num2  - " + div);
                break;

            case 5 :
                float modulas = num1%num2;
                System.out.println("Modulas of Num1 and Num2 - " + modulas);

        }
    }

}
