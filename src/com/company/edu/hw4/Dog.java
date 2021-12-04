package com.company.edu.hw4;
import java.util.Objects;
import java.util.Scanner;
public class Dog {
    private String name;
    private int age;
    private  String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
enum breed{
    JACKRUSSELL, SIBAINU, CHIHUAHUA;
}
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        name="";
        age=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return getName().equals(dog.getName());
    }

    }

