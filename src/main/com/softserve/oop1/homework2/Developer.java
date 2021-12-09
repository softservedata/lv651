package com.softserve.oop1.homework2;

public class Developer extends Employee {

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary, position);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }


    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: %f Position: %s", name, age, salary,position);
    }
}
