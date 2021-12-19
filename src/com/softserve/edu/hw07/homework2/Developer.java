package com.software.edu.hw07.homework2;

public class Developer extends Employee{
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public Double getSalary(){
        return salary;
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Nick",24,6500.50);
        Developer developer = new Developer("Ivan",19,4600.00);
        System.out.println(developer.report());
        System.out.println(employee.report());
    }
}
