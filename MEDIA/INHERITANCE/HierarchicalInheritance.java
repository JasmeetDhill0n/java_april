package INHERITANCE;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.bark();
        dog.sound();
        System.out.println("");
        cat.meow();
        cat.sound();
    }
}
