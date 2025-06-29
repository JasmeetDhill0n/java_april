package arrays;

public class Marks {
    public static void main(String[] args) {
        int[] marks = {70, 60, 50, 40};
        int sum = 0;

        for (int i =0;i<marks.length;i++){
            sum = marks[i] +sum;


        }
        System.out.println(sum);
        int average = sum/ marks.length;
        System.out.println("average - "+average);

    }
}
