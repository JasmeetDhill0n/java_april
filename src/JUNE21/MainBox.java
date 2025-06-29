package JUNE21;

public class MainBox {
    public static void main(String[] args) {

                // Box
        //item1
        //item2
        //
        //create objects with
        //1. String , Integer
        //2. Interger, String
        //3. Double, Integer

                Box<String, Integer> item1 = new Box<>("pen", 10);
                System.out.println(item1);

                Box<Integer, String> item2 = new Box<>(20, "book");
                System.out.println(item2);

                // 3. Double, Integer
                Box<Double, Integer> item3 = new Box<>(99.56, 20);
                System.out.println(item3);
            }
        }
