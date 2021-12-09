package com.software.edu.hw06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Employee {

    private String name, dep_number;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep_number() {
        return dep_number;
    }

    public void setDep_number(String dep_number) {
        this.dep_number = dep_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void depNumb() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String dep_number = br.readLine();
            this.dep_number = dep_number;

    }


    @Override
    public String toString() {
        return "name = " + name +
                ", dep_number = " + dep_number  +
                ", salary = " + salary ;
    }



    public static void main(String[] args) throws IOException {
        Employee employee1 = new Employee("Denis", 7500);
        Employee employee2 = new Employee("Michael", 3504);
        Employee employee3 = new Employee("Vova", 6541);
        Employee employee4 = new Employee("Ival", 3576);
        Employee employee5 = new Employee("Max", 4120);
        System.out.print("Enter department number of employee " + employee1.getName() + ": ");
        employee1.depNumb();
        System.out.print("Enter department number of employee " + employee2.getName() + ": ");
        employee2.depNumb();
        System.out.print("Enter department number of employee " + employee3.getName() + ": ");
        employee3.depNumb();
        System.out.print("Enter department number of employee " + employee4.getName() + ": ");
        employee4.depNumb();
        System.out.print("Enter department number of employee " + employee5.getName() + ": ");
        employee5.depNumb();

        Employee [] employee = new Employee[5];
        employee[0] = new Employee("Denis", 7500);
        employee[1] = new Employee("Michael", 3504);
        employee[2] = new Employee("Vova", 6541);
        employee[3] = new Employee("Ival", 3576);
        employee[4] =new Employee("Max", 4120);
        System.out.println(Arrays.toString(employee));



        }



}

