package arrays;

public class Maximum {
    public static void main(String[] args) {
        int [] numbers = {12,5,8,20,7};
       int maximum = numbers[0];

        for(int i =0;i<5;i++){
            if (maximum<numbers[i]){
                maximum = numbers[i];
            }
        }
        System.out.println("maximum number - "+maximum);
    }
}
