package Abstractionvehcilerentalsystem;

public class Car extends Vehicle{

    public Car( int vehcileId) {
        super( vehcileId);
    }


    int ratePerDay = 50;


    @Override
    int rent(int days) {
        if (isRented) {
            System.out.println("Car is already rented.");
            return 0;  // cannot rent again
        }
        isRented = true;
        int totalCost = days * ratePerDay;
        System.out.println("Car rented for " + days + " days. Total cost: $" + totalCost);
        return totalCost;
    }

    @Override
    void returnVehicle() {
        if (!isRented) {
            System.out.println("Car was not rented.");
        } else {
            isRented = false;
            System.out.println("Car returned. Now available for rent.");
        }

    }
}

