package arrays;

public class Minimum {
    public static void main(String[] args) {
        int [] numbers = {23,56,89,45,89};
        int minimum = numbers [0];

        for (int i =0;i<5;i++){
            if (minimum >numbers[i]){
                minimum = numbers[i];
            }
        }
        System.out.println(minimum);
    }
}