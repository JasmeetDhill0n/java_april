package may20;
public class BookManagement {
    String studentName;
    String bookTitle;
    String author;
    static int totalBookIssued = 0;

    public BookManagement(String studentName, String bookTitle, String author) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;  // Fixed spelling
        this.author = author;
        totalBookIssued++;
    }

    public void printInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
    }

    public static void showTotalIssued() {
        System.out.println("Total Books Issued: " + totalBookIssued);
    }

    
}
