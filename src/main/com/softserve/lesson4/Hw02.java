package com.softserve.lesson4;

public class Hw02 {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Patrick", 15, 7);
        Employee worker2 = new Employee("Victor", 12, 9);
        Employee worker3 = new Employee("Jack", 16, 5);

        System.out.println("Employee information: \n" + worker1);
        System.out.println();
        System.out.println("Employee information: \n" + worker2);
        System.out.println();
        System.out.println("Employee information: \n" + worker3);
        System.out.println("-------------------------------------------");

        System.out.println(worker1.getName() + "'s salary is: " + worker1.getSalary());
        System.out.println(worker2.getName() + "'s salary is: " + worker2.getSalary());
        System.out.println(worker3.getName() + "'s salary is: " + worker3.getSalary());
        System.out.println("-------------------------------------------");

        System.out.println(worker1.getName() + "'s bonus is: " + worker1.getBonuses() + "$.");
        System.out.println(worker2.getName() + "'s bonus is: " + worker2.getBonuses() + "$.");
        System.out.println(worker3.getName() + "'s bonus is: " + worker3.getBonuses() + "$.");
        System.out.println("-------------------------------------------");

        worker1.changeRate(2);
        System.out.println(worker1.getName() + "'s new rate is: " + worker1.getRate() + "$ per hour.");
        worker2.changeRate(4);
        System.out.println(worker2.getName() + "'s new rate is: " + worker2.getRate() + "$ per hour.");
        worker3.changeRate(1);
        System.out.println(worker3.getName() + "'s new rate is: " + worker3.getRate() + "$ per hour.");
        System.out.println("-------------------------------------------");

        int totalSum = worker1.getRate() + worker2.getRate() + worker3.getRate();
        System.out.println(totalSum);


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        System.out.println("-------------------------------------------");
        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();
        System.out.println("-------------------------------------------");
        person1.output();
        person1.changeName();
        person1.output();
        System.out.println();
        person2.output();
        person2.changeLastName();
        person2.output();
        System.out.println();
        person3.output();
        System.out.println();
        person4.output();
        System.out.println();
        person5.output();
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println(person1.getFirstName() + " birth year is: " + person1.getBirthYear());
        System.out.println(person2.getFirstName() + " birth year is: " + person2.getBirthYear());
        System.out.println(person3.getFirstName() + " birth year is: " + person3.getBirthYear());
        System.out.println(person4.getFirstName() + " birth year is: " + person4.getBirthYear());
        System.out.println(person5.getFirstName() + " birth year is: " + person5.getBirthYear());
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println(person1.getFirstName() + " age is: " + person1.getAge());
        System.out.println(person2.getFirstName() + " age is: " + person2.getAge());
        System.out.println(person3.getFirstName() + " age is: " + person3.getAge());
        System.out.println(person4.getFirstName() + " age is: " + person4.getAge());
        System.out.println(person5.getFirstName() + " age is: " + person5.getAge());
    }
}
