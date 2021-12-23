package com.software.edu.hw08.homework2;

public class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String getName(){
        return  name;
    }

    public Integer getAge(){
        return age;
    }

    public Double getSalary(){
        return salary;
    }
    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f ", name, age, salary);}
}
