package vehcilepolymorphism;

public class Cruze extends Vehicle {
    @Override
    public void run() {
        System.out.println("cruze is running");
    }

    @Override
    public void accelerate() {
        System.out.println("cruze is accelerating");
    }

    @Override
    public void stop() {
        System.out.println("cruze has stopped");
    }
}
