package com.company.edu.hw6.task2;

public class Developer extends Employee {

    private String name;
    private String position;
    private int age;
    private double salary;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String report() {
        return ("Name: "+name+", Age: "+age+", Position: "+position+", Salary: \u20B4 "+salary+".");
    }

}
