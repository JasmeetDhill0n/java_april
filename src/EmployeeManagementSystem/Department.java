package EmployeeManagementSystem;

public class Department {
    private final String deptId;
    private final String deptName;

    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public String getDeptId(){
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
