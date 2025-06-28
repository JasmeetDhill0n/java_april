package EXCEPTIONS;

public class Voting {
    int age;

    public Voting() {
        this.age = age;
    }

    public void setAge(int age){
        if(age<18){
            throw new AgeRestrictionException("person is not eligible for voting");
        }
        else{
            System.out.println("person is eligible for voting");
            this.age =age;
        }

    }

}
