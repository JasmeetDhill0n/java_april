package INHERITANCE;

public class Person {

    public void sleep(){
            System.out.println("Person is Sleeping");
        }
    }

    class Employee extends Person {
        public void work() {
            System.out.println("employee is working");
        }
    }

        class Manager extends Employee{
            public void manage(){
                System.out.println("manager is managing");
            }
        }




