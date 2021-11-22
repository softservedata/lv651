package com.OOP.PracticalTask;

import java.util.Scanner;

public class employee {
    private String name;
    private int rate;
    private int hours;
    private static double totalSUM;
    int i = 0;
    int bonus;

    public employee (){

    }
    public employee(String name){
        this.name = name;
    }
    public employee (String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public employee (String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void getSalary (int rate, int hours){
        this.hours = hours;
        this.rate = rate;
        i = hours * rate;
        System.out.println("Salary of "+ name + " = "+ i);
    }
    public int changeRate (){
        Scanner s = new Scanner(System.in);
        System.out.print("Put new rate of employee: ");
        int newRate = s.nextInt();
        System.out.println("New rate is: "+newRate);
        s.close();
        rate = newRate;
        i = hours * rate;
        return rate;
    }
    public void getBonuses (){
        bonus = i/10;
        System.out.println("Bonus for "+name+" = "+bonus);
    }

    public int totalSum() {
        int tot = i + bonus;
        System.out.println("Employee "+name+" will take "+tot);
        totalSUM = tot;
        return (int) totalSUM;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRate: " + rate + "\nWorking hours: " + hours + "\nTotalSum: "+totalSUM;
    }
}
