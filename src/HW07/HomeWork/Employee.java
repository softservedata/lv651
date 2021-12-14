package HW07.HomeWork;

/*
 * Create the base class Employee with a string variable employeeld
 * */
public class Employee {
    private String name;
    private Departments department;
    private String position;
    private String employeeID = "";
    private static int empID = 0;

    public Employee(String name) {
        this.name = name;
        this.department = null;
        this.position = "";
        this.setEmployeeID();
    }

    public Employee(String name, Departments department) {
        this.name = name;
        this.department = department;
        this.position = "";
        this.employeeID = "";
        this.setEmployeeID();
    }

    public Employee(String name, Departments department, String position) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeID = "";
        this.setEmployeeID();
    }

//    public Employee(String name, Departments department, String position, String employeeID) {
//        this.name = name;
//        this.department = department;
//        this.position = position;
//        this.employeeID = employeeID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    private void setEmployeeID() {
        empID++;
        this.employeeID = getDepID() + "000" + empID;
    }

    private String getDepID() {
        if (this.department == null) {
            return "UND";
        } else {
            return this.department.toString().substring(0, 3).toUpperCase();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }
}
