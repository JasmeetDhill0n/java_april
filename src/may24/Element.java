package may24;

public class Element {
    public static void main(String[] args) {
        int[] arr = {12, 23, 543, 23, 45, 7878, 23, 1243, 43,};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (largest < arr[i]) {
                largest = arr[i];
            }

        if (smallest > arr[i]) {
                smallest = arr[i];
           }

        }
        System.out.println("MaxiMum element - " + largest);
        System.out.println("minimum element - " + smallest);
    }

}
