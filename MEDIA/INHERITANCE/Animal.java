package INHERITANCE;

public class Animal {
   /* Create a class Animal with method sound() that prints "Some animal makes sound".
    Create two child classes: Dog with method bark() → prints "Dog barks"
    Cat with method meow() → prints "Cat meows"What to do:
    Create objects of Dog and Cat
    Call both sound() and their unique method (like bark() for Dog)
    */
    public void sound(){
        System.out.println("some animal make sound");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("Cat meows ");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}

