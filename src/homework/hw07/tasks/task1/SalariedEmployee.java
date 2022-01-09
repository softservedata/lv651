package homework.hw07.tasks.task1;

public class SalariedEmployee extends Employee implements Payment, Comparable<Employee>{

    private int socialSecurityNumber;
    private double hours;
    private double salary;
    private double hourlyRate;

    // constructors
    public SalariedEmployee() {
        this.hours = 0;
        this.socialSecurityNumber = 0;
        this.hourlyRate = 0;
        this.salary = calculatePay();
    }

    public SalariedEmployee(double hours, double hourlyRate, int socialSecurityNumber) {
        this.hours = hours;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.salary = calculatePay();
    }

    public SalariedEmployee(int employeeId, String name, double hours, double hourlyRate, int socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.salary = calculatePay();
    }

    // Getters and setters
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
        this.salary = calculatePay();
    }

    public double getSalary() {
        return salary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        this.salary = calculatePay();
    }

    //--------


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * socialSecurityNumber * (int) (hours * salary * hourlyRate);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) obj;
        return socialSecurityNumber == that.socialSecurityNumber && Double.compare(that.hours, hours) == 0 && Double.compare(that.salary, salary) == 0 && Double.compare(that.hourlyRate, hourlyRate) == 0;
    }

    @Override
    public double calculatePay() {
        return hours * hourlyRate;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "ID = " + getEmployeeId() +
                " name = " + getName() +
                ", SSN = " + socialSecurityNumber +
                ", salary = " + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return -Double.compare(calculatePay(), employee.calculatePay());
    }
}
