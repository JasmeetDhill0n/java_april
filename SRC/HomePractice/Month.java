package HomePractice;

import java.util.Scanner;

public class Month {
    /*
    Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER MONTH NUMBER - ");
        int month = scanner.nextInt();
        if (month == 1){
            System.out.println("jan");
        }
        else if (month == 2){
            System.out.println("feb");
        }
        else if (month == 12) {
            System.out.println("dec");
        }
            else{
                System.out.println("invalid ");
            }
        }
    }


