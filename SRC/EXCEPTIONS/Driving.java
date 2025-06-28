package EXCEPTIONS;

public class Driving {
    int age;
    public void setAge(int age){
        if(age<18){
            throw new AgeRestrictionException("Not a valid driver");
        }
        else{
            this.age = age;
            System.out.println("Valid driver");
        }

    }

}
