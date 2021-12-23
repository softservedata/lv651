package com.software.edu.hw08.homework2;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f  ",name,age,salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ivan",24,3200.00);
        Developer developer = new Developer("Sophia",35,7900.55);


        System.out.println(developer.report());
        System.out.println(employee.report());
    }
}
