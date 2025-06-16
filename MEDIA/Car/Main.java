package Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Honda honda =new Honda();
        car.Brand = "honda";
        car.seatingCapacity = 4;
        car.accelarate();
        car.brake();
        car.stop();



        honda.accelarate();
        honda.brake();
        honda.stop();


    }
}
