package com.softserve.edu.hwOOP2;

public class Employee implements Payment, Comparable<Employee>{
    private String employeeId;
    private String name;

    public Employee() {
        employeeId = "";
        name = "";
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int calculatePay () {
     return 0;
     }
       
    
    @Override
    public int compareTo(Employee employee) {
        return this.calculatePay() - employee.calculatePay();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}