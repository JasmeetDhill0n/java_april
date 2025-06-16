package LibraryManagementabstraction;

    public class Book extends LibraryItem {

        private final int LOAN_PERIOD = 14;           // Allowed days for book
        private final double LATE_FEE_PER_DAY = 1.50; // Fine per extra day

        public Book(int itemId, String title) {
            super(itemId, title); // Call constructor from LibraryItem
        }

        // ✅ Implement abstract method from LibraryItem
        @Override
        public void checkOut(int days) {
            if (isAvailable()) {
                setAvailable(false); // Now book is rented
                System.out.println("Book \"" + getTitle() + "\" has been checked out for " + days + " days.");
            } else {
                System.out.println("Book \"" + getTitle() + "\" is not available right now.");
            }
        }

        // ✅ Implement abstract method from LibraryItem
        @Override
        public void returnItem(int daysKept) {
            setAvailable(true); // Book returned, now available
            System.out.println("Book \"" + getTitle() + "\" is returned.");

            if (daysKept > LOAN_PERIOD) {
                int lateDays = daysKept - LOAN_PERIOD;
                double fee = lateDays * LATE_FEE_PER_DAY;
                System.out.println("Late by " + lateDays + " days. Late fee: $" + fee);
            } else {
                System.out.println("Returned on time. No late fee.");
            }
        }
    }

