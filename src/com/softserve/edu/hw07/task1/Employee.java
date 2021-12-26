package com.softserve.edu.hw07.task1;

public class Employee implements Comparable<Payment>, Payment {
    public String employeeID;



    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public int compareTo(Payment o) {
        int currentAverageSalary = this.calculatePay();
        int averageSalary = o.calculatePay();
        return Integer.compare(currentAverageSalary,averageSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                '}';
    }
}
