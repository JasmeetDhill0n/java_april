package arrays;

public class Sum {
    public static void main(String[] args) {
        int [] elements = { 2,4,6,8,10};
        int sum = 0;
        for(int i =0;i<5;i++){
            sum = sum + elements[i];

        }
        System.out.println(sum);
    }
}
