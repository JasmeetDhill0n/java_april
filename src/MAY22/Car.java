package MAY22;

public class Car {
    String carName;
    double speed;
   static int totalCars = 0;


    public Car(String carName, double speed) {
        this.carName = carName;
        this.speed = speed;
        totalCars++;
    }

    public void  showDetails(){
        System.out.println("Car Name - "+carName);
        System.out.println(" speed - "+speed+"KM");
    }

    public static void showTotalCars(){
        System.out.println("show total Cars - "+ totalCars);

    }
}
