package May6;

import javax.swing.*;
import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {

        System.out.println("Welcome to Rogers");

        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the option - ");
        int options = scanner.nextInt();

        if(options == 1){
            System.out.println("Press 1 for Internet support");
            System.out.println("Press 2 for Mobile support");
            System.out.println("Press 3 for Billing Questions");
            System.out.println("Press 4 for Talk to customer service support");
            System.out.println("press 5 for exit the call");
        }
        else {
            System.out.println("Show French Menu ");
        }

        System.out.println("Please Enter the option - ");
        int option = scanner.nextInt();


        switch(option){

            case 1 :
                System.out.println(" Internet support");
                break;

            case 2 :
                System.out.println("  Mobile support");
                break;

            case 3 :
                System.out.println(" Billing Questions");
                break;

            case 4 :
                System.out.println(" Talk to customer service support");
                break;

            case 5 :
                System.out.println(" Thank you for calling.Good Bye ");
                break;

            default :
                System.out.println("Invalid entry");
        }

    }
}
