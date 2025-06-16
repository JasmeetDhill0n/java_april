package objectPractice;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Animal();

        dog.color = "brown";
        dog.weight = 10;
        dog.height = 11.34;

        dog.eat();
        dog.run();
        dog.sleep();

        dog.PrintAllDetails();

        Animal cat = new Animal();
        cat.color = "white";
        cat.height = 10.4;
        cat.weight =20;

        cat.eat();
        cat.run();

        cat.PrintAllDetails();

    }
}
