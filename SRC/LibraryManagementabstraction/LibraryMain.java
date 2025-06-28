package LibraryManagementabstraction;

public class LibraryMain {
        public static void main(String[] args) {
            Book javaBook = new Book(1, "Java Basics");

            javaBook.checkOut(10);       // Checked out for 10 days
            javaBook.checkOut(5);        // Try to rent again

            javaBook.returnItem(16);     // Return after 16 days (2 days late)
            javaBook.checkOut(7);        // Rent again
        }
    }

