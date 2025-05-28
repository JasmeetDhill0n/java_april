package May17;

public class Car {
    String name;
    String brand;
    String engineType;
    String color;
    double horsePower;

    public Car(){

    }
    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Car(String name, String color, String engineType, String brand) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.brand = brand;
    }

    public Car(double horsePower) {
        this.horsePower = horsePower;
    }
    public void display(){
        System.out.println("name - "+name);
        System.out.println(("brand -"+ brand));
        System.out.println("Color--"+color);
        System.out.println("Engine type--"+engineType);
        System.out.println("horse Power ---"+horsePower);
    }
}
