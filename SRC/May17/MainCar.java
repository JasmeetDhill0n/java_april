package May17;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("honda");
        Car car2 = new Car("honda", "civic");
        Car car3 = new Car("honda", "black", "good engine", "civic");
        Car car4 = new Car(89.89);

        car2.color = "red";

        car3.display();
        System.out.println();
        car1.display();
        System.out.println();
        car2.display();
        System.out.println();
        car4.display();
        System.out.println();
        car.display();





    }
}