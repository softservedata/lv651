package com.software.edu.hw06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Employee {

    private String name;
    private int salary,dep_number;

    public Employee(String name, int salary, int dep_number) {
        this.name = name;
        this.salary = salary;
        this.dep_number = dep_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDep_number() {
        return dep_number;
    }

    public void setDep_number(int dep_number) {
        this.dep_number = dep_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    @Override
    public String toString() {
        return "name = " + name +
                ", dep_number = " + dep_number  +
                ", salary = " + salary ;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee employee1 = new Employee("Denis", 7500,4500);
        Employee employee2 = new Employee("Michael", 3504,5000);
        Employee employee3 = new Employee("Vova", 6541,4500);
        Employee employee4 = new Employee("Ival", 3576,3695);
        Employee employee5 = new Employee("Max", 4120,4568);


        Employee[] emp = {employee1,employee2 ,employee3 , employee4, employee5};
        Employee tmp;
        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].getSalary() < emp[j].getSalary()) {
                    tmp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = tmp;
                }
            }
        }
        System.out.println("All workersk sorted by salary: ");
        for (int i = 0; i < emp.length; i++) {
            System.out.println("\t" + emp[i].toString());
        }

        System.out.println("Enter number of department: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Workers from " + x + " department:");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDep_number() == x) {
                System.out.println("\t" + emp[i].toString());
            }
        }


        }



}

