package objectPractice;

public class Animal {

    String color;
    double weight;
    double height;

    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    public void run() {
        System.out.println("Animal is running");
    }


    public void PrintAllDetails() {
        System.out.println("Color  - "  +this.color);
        System.out.println("weight---" +this.weight);
        System.out.println("height---"+this.height);
    }
}
