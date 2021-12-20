package com.softserve.edu.hw06.task2;

public class Developer extends Employee{
    private String name;
    private int age;
    private double salary;
    private String position;
    public Developer(String name, int age, double salary, String position){
        super(name, age, salary);
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }
    public String report () {
        return ("Name:" + name + " Age: " + age  + " Position: " + position + " Salary: " + salary);
    }
}
