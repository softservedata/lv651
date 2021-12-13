package com.softserve.oop2.homework1;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String employeeld;
    protected int salary;
    protected String name;
    protected String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee name: " + getName() + ", Employee ID Number: " + getId() + ", Employee payment: " + salary + "\n";
    }

}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.getSalary(), o1.getSalary());
    }
}

public class Runner {

    public static void main(String[] args) {
        Employee[] workers = new Employee[]{
                new SalariedEmployee("ID 345673", "Kostya", 25, 10),
                new SalariedEmployee("ID 674985", "Petya", 30, 12),
                new ContractEmployee("ID 986784", "Anna", 470),
                new ContractEmployee("ID 345987", "Faina", 510)};

        Arrays.sort(workers, new EmployeeComparator());

        for (Object i : workers) {
            System.out.println(i);
        }
    }
}
