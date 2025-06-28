package May6;

import java.util.Scanner;

public class Sub {
    public static void main(String[]  args){

       Scanner scanner = new Scanner(System.in);
        System.out.println("enter a valuea");
        int a = scanner.nextInt();
        System.out.println("enter a valueb");
        int b = scanner.nextInt();
        int sub = a-b;
        System.out.println("sub of two numbers:" + sub);
    }
}

