package MAY22;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("chevy", 100 );
        Car car2 =new Car("mustang", 120);

        car1.showDetails();
        System.out.println();
        car2.showDetails();
        System.out.println();

        Car.showTotalCars();

    }
}
