package Abstractionvehcilerentalsystem;

public  abstract class Vehicle {

    int vehcileId;
    boolean isRented;

    public Vehicle(int vehcileId) {
        this.vehcileId = vehcileId;

    }

    abstract int rent(int days);
    abstract void returnVehicle();

    public boolean getIsRented() {
        return isRented;
    }
}
