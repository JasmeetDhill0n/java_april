package LAMDAPRATICE;
public class CheckNumber {

    /*  ✅ Problem: Check if a number is even or odd using a lambda expression.
         🔧 Step-by-step:
      Create a functional interface CheckNumber with a method check(int n).
      Use a lambda to implement it and check if the number is even or odd.
      Print the result
     */
    public static void main(String[] args) {
        Number number = (n) -> {
            if ((n % 2) == 0) {
                System.out.println("n is even number");
            } else {
                System.out.println("not even number");
            }
        };
        number.checkNumber(5);
        number.checkNumber(28);
    }
}
interface Number{
    void checkNumber(int n);
        }