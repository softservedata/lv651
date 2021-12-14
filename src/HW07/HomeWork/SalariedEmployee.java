package HW07.HomeWork;

/*
 * Create SalariedEmployee which implement interface Payment and are inherited from the Employee class.
 * Describe fixed paid workers
 * Describe the string variable socialSecurityNumber in the class SalariedEmployee
 * */
//public class SalariedEmployee extends Employee implements Payment { //???????????????
public class SalariedEmployee extends Employee{
    private double salary;
    private String socialSecurityNumber;

    public SalariedEmployee(String name) {
        super(name);
        this.salary = 0.0;
        this.socialSecurityNumber = "";
    }

    public SalariedEmployee(String name, Departments department) {
        super(name, department);
        this.salary = 0.0;
        this.socialSecurityNumber = "";
    }

    public SalariedEmployee(String name, Departments department, String position) {
        super(name, department, position);
        this.salary = 0.0;
        this.socialSecurityNumber = "";
    }

    public SalariedEmployee(String name, Departments department, String position, double salary) {
        super(name, department, position);
        this.salary = salary;
        this.socialSecurityNumber = "";
    }

    public SalariedEmployee(String name, Departments department, String position, double salary, String socialSecurityNumber) {
        super(name, department, position);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    private void setDefaultData() {
        this.salary = 0.0;
        this.socialSecurityNumber = "";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}
