package com.softserve.edu.homework2;

public class PersonMain {
    public static void main(String[] args) {

        Person max = new Person("Maxim", "Domchuk", 1993);
        Person olg = new Person("Oleg", "Movchan", 1996);
        Person and = new Person("Andrii", "Domchuk", 1995);
        Person lud = new Person("Lyudmila", "Domchuk", 1968);
        Person art = new Person("Artem", "Ivanchuk", 1994);

        System.out.println(max);
            System.out.println("Full years: " + max.getAge(2021));
        System.out.println(olg);
            System.out.println("Full years: " + olg.getAge(2021));
        System.out.println(and);
            System.out.println("Full years: " + and.getAge(2021));
        System.out.println(lud);
            System.out.println("Full years: " + lud.getAge(2021));
        System.out.println(art);
            System.out.println("Full years: " + art.getAge(2021));


    }
}
