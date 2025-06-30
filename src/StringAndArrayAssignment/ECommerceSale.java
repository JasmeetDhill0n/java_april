package StringAndArrayAssignment;

import java.util.Scanner;

public class ECommerceSale {
    //E-commerce Sales Analysis An e-commerce website tracks the number of sales made for different
    // products each day of the week. Write a Java program that: • Stores the names of 7 products and
    // the number of sales made for each in two separate arrays. •
    // Allows the user to search for a product and view its total sales.

    public static void main(String[] args) {
        String [] productName ={"Pen","book","pencil","Eraser","stapler","laptop","tablet"};
        int [] sales = {2,4,6,6,7,0,4};

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the product you want to search - ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for(int i = 0;i<productName.length;i++) {
            if (productName[i].equalsIgnoreCase(searchName)) {
                System.out.println("Product name-  "+productName[i]+"  with number of sales - "+sales[i]);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Products is not in the list");
            }

    }
}
