package com.software.edu.hw04;
import java.util.Scanner;
// Template for Homework 04

public class Employee {
    private String name;
    private int rate;
    private float hours;
    private static float totalSum;
    private int getSalary;
    public Employee() {
        this.name = "Ivan";
        this.rate = 9;
        this.hours = 50;
    }

    //constructor with 2 parameters
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;

    }

    //constructor with 3 parameters
    public Employee(String name, int rate,float hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static void getTotalSum(float...salaries ) {
        float slrs = 0;
        for (int i = 0; i < salaries.length; i++) {
            slrs = slrs + salaries[i];

        }
        System.out.println("Total Sum: " + slrs);
    }

    public float getSalary(){
        float salary;
        salary = rate * hours;
        return salary;
    }

    public float getBonuses()
    {
        int i = 10;
        float bonus;
        bonus = getSalary() / i;
        return bonus;
    }

    public void changeRate(int rate){
        System.out.print("\nTo change rate '1'\nTo recalculate salary press '2'\nIf don't want to change,press '0': ");
        boolean n = true;
        while (n) {
            int m;
            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();
            switch (m)
            {
                case 1:
                    System.out.println("Rate of " + name + " equal " + rate);
                    System.out.print("Specify new rate :");
                    rate = sc.nextInt();
                    this.rate = rate;
                    System.out.print("New rate of " + name + " equal " + rate);
                    System.out.print("\nIf don't want to change,press '0': ");
                    break;
                case 2:
                    System.out.print("Salary of " + name + " equal "+ getSalary());
                    getSalary();
                    System.out.print("\nIf don't want to change,press '0': ");
                    break;
                default:
                    n=false;
                    break;
            }
        }
    }



    @Override
    public String toString(){
        return "Employee[name = "+name+", rate = "+rate+", hours = "+ hours+"]";
    }

    public static void main(String[] args) {
        System.out.println("Homework 04 \nPractical task");

        System.out.println("\nInformation about Employee 1:");
        Employee employee1 = new Employee("Tom" , 5, 63.8f);
        System.out.println(employee1.toString());
        employee1.changeRate(employee1.getRate());
        System.out.println("Salary "+ employee1.getName()+" = "+employee1.getSalary());
        System.out.println("Bonuses for " + employee1.getName() + " equal: " + employee1.getBonuses());
        System.out.println(employee1.toString());

        System.out.println("\nInformation about Employee 2:");
        Employee employee2 = new Employee("Vlad" , 16, 70.7f);
        System.out.println(employee2.toString());
        employee2.changeRate(employee2.getRate());
        System.out.println("Salary "+ employee2.getName()+" = "+employee2.getSalary());
        System.out.println("Bonuses for " + employee2.getName() + " equal: " + employee2.getBonuses());
        System.out.println(employee2.toString());

        System.out.println("\nInformation about Employee 3:");
        Employee employee3 = new Employee("Denis" , 25, 45.7f);
        System.out.println(employee3.toString());
        employee3.changeRate(employee3.getRate());
        System.out.println("Salary "+ employee3.getName()+" = "+employee3.getSalary());
        System.out.println("Bonuses for " + employee3.getName() + " equal: " + employee3.getBonuses());
        System.out.println(employee3.toString());

        Employee.getTotalSum(employee1.getBonuses() + employee1.getSalary(),employee2.getSalary() + employee2.getBonuses(),employee3.getSalary() + employee3.getBonuses());
    }
}
