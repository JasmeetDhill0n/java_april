package StringAndArrayAssignment;

import java.util.Scanner;

public class InventoryManagement {
    //Product Inventory Management You are managing an inventory syst
    // em for an online store. Create a Java program that uses an array to store the names of
    // 5 products and another array to store their corresponding prices. Write a function that: • D
    // isplays all products with their prices. • Allows the user to search for a product by name
    // and retrieve its price.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] productName = {"Tshirt", "shoes", "jeans", "perfumes", "Jacket"};
        float[] price = {10, 40, 30, 45, 100};
        System.out.println("product List with prices");

        for (int i = 0; i < productName.length; i++) {
            System.out.println(productName[i] + " - $" + price[i]);
        }

        System.out.print("\nEnter product name to find its price: ");
        String search = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < productName.length; i++) {
            if (productName[i].equalsIgnoreCase(search)) {
                System.out.println("Price of " + productName[i] + " is $" + price[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }

        scanner.close();
    }
}