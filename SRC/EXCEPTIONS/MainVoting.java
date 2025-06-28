package EXCEPTIONS;

import java.util.Scanner;

public class MainVoting {
    public static void main(String[] args) {
        Voting voting = new Voting();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = sc.nextInt();
        try {
            voting.setAge(age);
        } catch (AgeRestrictionException e) {
            e.printStackTrace();
        }
        System.out.println("Voter age should be 18+");

    }
}
