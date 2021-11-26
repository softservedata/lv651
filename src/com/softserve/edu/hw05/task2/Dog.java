package com.softserve.edu.hw05.task2;

import com.softserve.edu.hw04.Person;

public class Dog {
    private String name;
    private String breed;
    private int age;


    public enum Breed {
        PUG, DALMATIAN, FRENCH_BULLDOG;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
