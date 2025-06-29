package vehcilepolymorphism;

public class VehicleMain {
    public static void main(String[] args) {


        Vehicle vehicle = new Honda();
        vehicle.run();
        vehicle.accelerate();
        vehicle.run();
        System.out.println();

        Vehicle vehicle1 = new Audi();
        vehicle1.run();
        vehicle1.stop();
        vehicle1.accelerate();
        System.out.println();

        Vehicle vehicle2 = new Cruze();
        vehicle2.run();
        vehicle2.stop();
        vehicle2.accelerate();
        System.out.println();





    }
}
