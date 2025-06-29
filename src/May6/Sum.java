package May6;

import java.util.Scanner;

public class Sum {
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x value =");
        int a = scanner.nextInt();

        System.out.println("enter y value = ");
        int b = scanner.nextInt();
        int sum = a+b;

        System.out.println("sum of two numbers:"+sum);
    }
}
