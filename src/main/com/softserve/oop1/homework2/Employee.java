package com.softserve.oop1.homework2;

class Employee {
    protected String name;
    protected int age;
    protected double salary;
    protected String position;


    public Employee(String name, int age, double salary, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: %f, Position: %s" , name, age, salary, position);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Taras",32,4500.25,"Programmer");
        Developer developer = new Developer("Kolya",20,4600.65, "TeamLead");
        System.out.println(developer.report());
        System.out.println(employee.report());
    }


}
