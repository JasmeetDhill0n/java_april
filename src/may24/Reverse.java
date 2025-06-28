package may24;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
       int temp = arr[4];
       arr[0] = temp;
       arr[1] = arr[3];
       arr[3] = arr[3+1];
       arr[4] = arr[2-2];
        for (int i = 0; i < arr.length; i++)
        System.out.println(arr[i]);
    }
}
