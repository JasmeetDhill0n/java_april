package May17;

public class Computer {
    String brand;
    int capacity;

    public Computer() {
        System.out.println("Hello world");
    }

    public Computer(String brand) {
        this();
        this.brand = brand;
        System.out.println("Hello pragra");
    }

    public Computer(int capacity, String brand) {
        this("lenova");
        this.capacity=capacity;
        this.brand = brand;
        System.out.println("Hello students");

    }
    public void Display(){
        System.out.println("name - "+brand);
        System.out.println("capacity--"+capacity);

    }
}
