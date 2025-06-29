package june17exceptionAssignment;
import java.util.Scanner;

public class Grocery {
    double balance;  // using double since prices are in decimals
        String[] items = {"A", "B", "C", "D", "E"};
        double[] prices = {19.99, 20.99, 15.99, 30.99, 40.99};

        public Grocery(double balance) {
            this.balance = balance;
        }

        public void bill() {
            Scanner sc = new Scanner(System.in);
            double total = 0;
            String choice;

            while (true) {
                System.out.print("Enter item code (A-E) or Q to quit: ");
                choice = sc.next().toUpperCase();  // makes input uppercase

                if (choice.equals("Q")) {
                    System.out.println("Thank you! Final bill amount: $" + String.format("%.2f", total));
                    break;
                }

                boolean found = false;

                for (int i = 0; i < items.length; i++) {
                    if (choice.equals(items[i])) {
                        found = true;
                        double newTotal = total + prices[i];

                        if (newTotal > balance) {
                            System.out.println("Item " + choice + " cannot be added. Not enough balance.");
                            try {
                                throw new InsufficientBalanceException("❌ Balance too low for item " + choice);
                            } catch (InsufficientBalanceException e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            total = newTotal;
                            System.out.println("✅ Item " + choice + " added. Current total: $" + String.format("%.2f", total));
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("⚠ Invalid item code. Please enter A, B, C, D, E or Q.");
                }
            }

            sc.close();
        }
    }
