package arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < number.length; i++) {
             int modulas = number[i] % 2;
            boolean n = (modulas == 0);


            if (n) {
                System.out.println(number[i] + "even number");
            } else {
                System.out.println(number[i] + "odd number");
            }

        }
    }
}

