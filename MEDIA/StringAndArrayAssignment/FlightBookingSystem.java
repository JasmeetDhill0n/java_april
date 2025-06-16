package StringAndArrayAssignment;

import java.util.Scanner;

public class FlightBookingSystem {
    //Flight Booking System You are building a system for an airline company.
    // Write a Java program that stores the names of 5 destinations in a string array.
    // Create methods to: • Search for a destination and confirm whether it’s available.
    // • Allow a user to update the name of a destination.

    public static void main(String[] args) {
        System.out.println("Welcome to AirCanada");
        String [] destination = {"Toronto","vancouver","edmonton","calgary","melbounre"};

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the destination loacation - ");
        String search = scanner.nextLine();

        boolean found = false;
        int index = 0;

        for(int i =0;i< destination.length;i++){
            if(search.equalsIgnoreCase(destination[i])){
                found = true;
                System.out.println("destination found -"+destination[i]);
                index = i;

            }
        }
        if(!found){
            System.out.println("destination not found");
        }
        else {
            System.out.println("enter to update destination ");
            String update = scanner.nextLine();
            destination[index] = update;
            System.out.println("updated destination-" + update);

            for (int i = 0; i < destination.length; i++) {
                System.out.println(destination[i]);
            }

        }
    }
}
