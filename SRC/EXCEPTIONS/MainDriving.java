package EXCEPTIONS;

import java.util.Scanner;

public class MainDriving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = sc.nextInt();
        Driving driving =new Driving();

        try {
            driving.setAge(age);
        }
        catch(AgeRestrictionException e){
            e.printStackTrace();
            }
        System.out.println("driver age should be 18+");


    }
}
