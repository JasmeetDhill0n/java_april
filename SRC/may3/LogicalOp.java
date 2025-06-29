package may3;

public class LogicalOp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;


        boolean result1 = !((x <= y ) || (x > b));

        System.out.println("Result1 - " + result1);

        boolean result2 = ((x > y ) && (a > 348));
        System.out.println("Result2 - " + result2);

        boolean result3 = !((x >= y ) || (x > a));
        System.out.println("Result3 - " + result3);

        boolean result4 = ((x > y ) && (a > 18));
        System.out.println("Result4 - " + result4);

        boolean result5 = !((a >= y ) || (x > 8));
        System.out.println("Result5 - " + result5);

        boolean result6 = !((x > y ) || (x > 23));
        System.out.println("Result6 - " + result6);


        boolean result7 = ((b > y ) && (x > 8));
        System.out.println("Result7 - " + result7);

        boolean result8 = ((x >= y ) || (x <= 10));
        System.out.println("Result8 - " + result8);

        boolean result9 = ((x > y ) && (x > a));
        System.out.println("Result9 - " + result9);

        boolean result10 = !((x == y ) || (x <= 8));
        System.out.println("Result10 - " + result10);
    }
}
