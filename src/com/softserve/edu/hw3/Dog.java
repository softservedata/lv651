package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog {
    public enum breed{
        AmericanFoxhound,
        Beagle,
        GermanSheppard;

    }
    private String name;
    private int age;
    private breed dogBread;

    public Dog(String name, int age, breed dogBread) {
        this.name = name;
        this.age = age;
        this.dogBread = dogBread;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public breed getDogBread() {
        return dogBread;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Dog pes1 = new Dog("Tom", 1, breed.GermanSheppard);
        Dog pes2 = new Dog("Bob", 2, breed.AmericanFoxhound);
        Dog pes3 = new Dog("Sem", 3, breed.Beagle);

    if (pes1.getName() == pes2.getName() ||
            pes1.getName() == pes3.getName() ||
            pes2.getName() == pes1.getName() ||
            pes2.getName() == pes3.getName() ||
            pes3.getName() == pes1.getName() ||
            pes3.getName() == pes2.getName()
        )
            System.out.println("The are dogs with the same names: ");
    Dog oldestDog;
    if (pes1.getAge() > pes2.getAge())
        oldestDog = pes1;
    else
        oldestDog = pes2;
    if (oldestDog.getAge() < pes3.getAge())
        oldestDog = pes3;

        System.out.println(
                "The oldest dog is: \n" +
                        "Name - " + oldestDog.getName() + ", \n" +
                        "Bread - " + oldestDog.getDogBread() + ", \n" +
                        "Age - " + oldestDog.getAge() + " years");
    }
}
