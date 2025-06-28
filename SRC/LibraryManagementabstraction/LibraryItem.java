package LibraryManagementabstraction;

public abstract class LibraryItem {

    //Problem: Library Management System
    //Abstract class LibraryItem with abstract methods: checkOut() and returnItem().
    //Subclasses: Book
    //Each item has different loan periods and late fee calculations.
    //Override methods with specific behaviors.
    //Track availability status.
    //Concepts: abstraction, inheritance, method overriding, data encapsulation.

    private int itemId;
    private String title;
    private boolean isAvailable;

    public LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isAvailable = true; // Initially available
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }


    public abstract void checkOut(int days);           // How to check out item
    public abstract void returnItem(int daysKept);     // How to return item and calculate late fee
}
