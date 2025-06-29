package INHERITANCE;

public class Vehicle {

    //Create a parent class called Vehicle that has:
    //a method move() that prints "Vehicle is moving".
    //Create a child class Car that inherits from Vehicle and adds:
    //a method drive() that prints "Car is being driven".
    //What to do:Create objects of Car
    //Call both move() and drive() using the Car object.
    public void move(){
        System.out.println("vehicle is moving");

    }
}
class Car extends Vehicle {
    public void drive(){
        System.out.println("car is being driven");
    }


}

