package InternalImplentationOfHashcod;

import java.util.HashMap;

public class Student {
    private int roll;
    private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // 🔁 Uncomment below based on your test case

    // ✅ Case 1: Only hashCode()
    /*
    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }
    */

    // ✅ Case 2: Only equals()
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }
    */

    // ✅ Case 3: Both overridden
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }
    */

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name='" + name + '\'' + '}';
    }
}