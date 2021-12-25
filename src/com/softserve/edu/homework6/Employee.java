package com.softserve.edu.homework6;

public class Employee implements Payment{

    private String employeeld;
    private String name;
    private String position;
    protected double salary;
    protected double fixedMonthlyPayment;
    protected double hourlyRate;
    protected double numberOfHoursWorked;

    public Employee(String employeeld, String name, String position, double fixedMonthlyPayment) {
        this.employeeld = employeeld;
        this.name = name;
        this.position = position;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public Employee(String employeeld, String name, String position, double hourlyRate, double numberOfHoursWorked) {
        this.employeeld = employeeld;
        this.name = name;
        this.position = position;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary(int i) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (Double.compare(employee.fixedMonthlyPayment, fixedMonthlyPayment) != 0) return false;
        if (Double.compare(employee.hourlyRate, hourlyRate) != 0) return false;
        if (Double.compare(employee.numberOfHoursWorked, numberOfHoursWorked) != 0) return false;
        if (!employeeld.equals(employee.employeeld)) return false;
        if (!name.equals(employee.name)) return false;
        return position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = employeeld.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + position.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fixedMonthlyPayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hourlyRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(numberOfHoursWorked);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
