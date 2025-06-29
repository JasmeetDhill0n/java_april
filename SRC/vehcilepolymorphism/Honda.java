package vehcilepolymorphism;

public class  Honda extends Vehicle {
    @Override
    public void run() {
        System.out.println("Honda is running");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda is accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Honda has stopped");
    }
}
