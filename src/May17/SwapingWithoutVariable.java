package May17;

public class SwapingWithoutVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        x = x + y; // x value will become 30
        y = x - y; // y value will become 10
        x = x - y; // x value will become 20

        System.out.println("x value after swaping - " + x);
        System.out.println("y value after swaping --"+y);

    }
}

