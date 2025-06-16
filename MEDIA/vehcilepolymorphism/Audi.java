package vehcilepolymorphism;

public class Audi extends Vehicle{

    @Override
    public void run() {
        System.out.println("Audi is running");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi is accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Audi has stopped");
    }
}
