package com.software.edu.hw08.practicaltask1;

public class Cat implements Animal {
    protected String name;
    protected int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("\nI am cat, named " + getName());
    }

    @Override
    public void feed() {
        System.out.println("I'd like to eat some fish...");
    }
}
