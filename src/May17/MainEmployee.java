package May17;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee =new Employee();
        System.out.println(employee.name("jasmeet"));
        System.out.println(employee.name("jasmeet" ,"Kaur"));
        System.out.println(employee.name("jasmeet","kaur","Dhillon"));
        System.out.println(employee.salary(60000));
        System.out.println(employee.salary( 60000,   433));
        System.out.println(employee.salary( 60000,   433,   234));
    }
}
