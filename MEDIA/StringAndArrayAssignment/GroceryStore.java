package StringAndArrayAssignment;

import java.util.Scanner;

public class GroceryStore {
    //Grocery Store Price Calculator You are working at a grocery store that offers 5 different fruits.
    // Create a Java program that: • Uses two arrays: one for storing the names of fruits and
    // another for storing their prices per kilogram. •
    // Allows the user to input the fruit name and the number of kilograms they want to purchase,
    // then calculates and prints the total price.
    public static void main(String[] args) {
        String [] fruit = {"apple","Banana","kiwi","strawberry","Orange"};
        int  [] pricePerKG = {10,4,5,6,3};

        System.out.println("fruit product list - ");
        for(int i = 0;i<fruit.length;i++){
            System.out.println(fruit[i]+"-- $"+pricePerKG[i]);
        }

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the fruit name - ");
        String fruitName = scanner.nextLine();

        boolean found  = false;
        int index = 0;

        for(int i = 0;i<fruit.length;i++){

            if(fruit[i].equalsIgnoreCase(fruitName)){
                found = true;
                index = i ;
                break;
            }

            }
        if (!found){
            System.out.println("product not  found");
        }

       if (found) {
           System.out.println("enter the Number of kilogram you want to buy - ");
           int kilogram = scanner.nextInt();
           double price = 1;
           price = pricePerKG[index] * kilogram;
           System.out.println("total price - $" + price);

       }
    }
}
