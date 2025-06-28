package ASSIGNMENT3;

public class Person {
    //Base Class: Person o Fields: name (String), age (int).
    // o Constructor: Accepts name and age. o Methods: ▪
    // public void displayInfo(): Prints name and age. ▪
    // A final method getType(): Returns "Person".

    String name ;
    int age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name-"+name);
        System.out.println("Age- "+age);
    }

    final String getName() {              //final on method	Cannot be changed in subclasses
        return name;
    }
}
