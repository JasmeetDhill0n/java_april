package Abstractionvehcilerentalsystem;

public class MainVehicle {
           public static void main(String[] args) {
            Car myCar = new Car(101);  // vehicle ID is 101

            myCar.rent(5);         // Rent for 5 days
            myCar.rent(2);         // Try to rent again while already rented
            myCar.returnVehicle(); // Return the car
            myCar.returnVehicle(); // Try returning again when already available
            myCar.rent(3);         // Rent again after returning
        }
    }