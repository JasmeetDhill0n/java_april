package may20;
public class MainBookManagement {
    public static void main(String[] args) {

        BookManagement book  = new BookManagement("JasmeeT", "Math", "jas");
        BookManagement book1 = new BookManagement("arsh", "English", "meet");
        BookManagement book2 = new BookManagement("maher", "Punjabi", "dhillon");

        book1.printInfo();
        System.out.println();

        book2.printInfo();
        System.out.println();

        book.printInfo();
        System.out.println();

        BookManagement.showTotalIssued();
    }
}