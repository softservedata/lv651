package com.softserve.edu.hw03;

import java.util.Scanner;

public class Employee {
    private String name;
    private int rate;
    private float hours;
    private static float totalSum;
    // Default constructor
    public Employee() {
        this.name = "Nestor";
        this.rate = 5;
        this.hours = 100;
    }
    // Constructor with 2 parameters
    public Employee(String name,int rate) {
        this.rate = rate;
        this.name = name;
    }
    // Constructor with 3 parameters
    public Employee(String name, int rate,float hours) {
        this.rate = rate;
        this.name = name;
        this.hours = hours;
    }

    public static void getTotalSum(float...salaries ) {
        float slrs=0;
        for(int i=0; i< salaries.length; i++){
            slrs=slrs+salaries[i];

        }System.out.println("Total Sum: "+slrs);


    }

    public float getSalary()
    {
        float salary;
        salary = rate * hours;
        return salary;
    }
    @Override
    public String toString()
    {
        String s = "Employee [Name - " + name + ", rate - " + rate + ", hours - " + hours + "]";
        return s;
    }
    public void changeRate (int rate)
    {
        System.out.println("To change rate '1'\n"+ "To recalculate salary press '2'\n" + "If don't want to change data press '3'\n");
        boolean n = true;
        while (n)
        {
            int m;
            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();
            switch (m)
            {
                case 1:
                    System.out.println("Rate of " + name + " equal " + rate);
                    System.out.println("Specify new rate :");
                    rate = sc.nextInt();
                    this.rate = rate;
                    System.out.println("New rate of " + name + " equal " + rate);
                    break;
                case 2:
                    System.out.print("Salary of " + name + " equal "+ getSalary());
                    getSalary();
                    break;
                case 3:
                    n=false;
                    break;
            }
        }
    }
public float getBonuses()
{
    int i = 10;
    float bonus;
    bonus = getSalary() / i;
    //System.out.println("Bonuses for " + name + " equal: " + bonus);
    return bonus;
}


}
class Head
{
    public static void main(String[] args)
    {
        System.out.println("Enter information about Employee 1:");
        Employee employee = new Employee("Oleg" , 3, 25.5f);
        System.out.println(employee.getSalary());
        employee.changeRate(2);
        System.out.println(employee.getBonuses());
        System.out.println(employee.toString());
        System.out.println("Enter information about Employee 2:");
        Employee employee2 = new Employee();
        System.out.println(employee2.getSalary());
        employee2.changeRate(4);
        System.out.println(employee2.getBonuses());
        System.out.println(employee2.toString());
        System.out.println("Enter information about Employee 3:");
        Employee employee3 = new Employee("Vova" , 2, 150);
        System.out.println(employee3.getSalary());
        employee3.changeRate(3);
        System.out.println(employee3.toString());
        System.out.println("Bonuses of employees: \n" + employee.getBonuses()+"\n"+employee2.getBonuses()+"\n"+employee3.getBonuses());
        System.out.println("Salaries of employees: \n" + employee.getSalary()+"\n"+employee2.getSalary()+"\n"+employee3.getSalary());
        Employee.getTotalSum(employee.getBonuses() + employee.getSalary(),employee2.getSalary() + employee2.getBonuses(),employee3.getSalary() + employee3.getBonuses());
    }
}