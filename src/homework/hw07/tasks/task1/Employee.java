package homework.hw07.tasks.task1;

public class Employee {

    private int employeeId;
    private String name;

    public Employee() {
        this.name = "";
        this.employeeId = 0;
    }

    public Employee(int employeeId, String name) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                '}';
    }
}
