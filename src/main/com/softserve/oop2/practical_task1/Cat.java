package com.softserve.oop2.practical_task1;

public class Cat implements Animal {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void feed() {
        System.out.println("I would like to eat some fish:)\n");
    }

    @Override
    public void voice() {
        System.out.println("I am cat, named " + getName() + ", MiuMiu!");
    }
}
