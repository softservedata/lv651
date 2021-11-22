package com.OOP.PracticalTask;

public class main {
    public static void main(String[] args) {
        employee e = new employee("Vlad");
        employee e1 = new employee("Katya");
        employee e2 = new employee("Alena");

        e.getSalary(11,8);
        e1.getSalary(22,8);
        e2.getSalary(33,8);

        e.getBonuses();
        e1.getBonuses();
        e2.getBonuses();

        e.changeRate();
        e.getBonuses();

        e.totalSum();
        e1.totalSum();
        e2.totalSum();

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println(e.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
