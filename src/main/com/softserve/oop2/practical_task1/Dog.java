package com.softserve.oop2.practical_task1;

public class Dog implements Animal {
    public String name;
    public int age;

    public Dog(String name, int age) {
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
        System.out.println("I would like to eat some meat:)\n");
    }

    @Override
    public void voice() {
        System.out.println("I am dog, named " + getName() + ", BarkBark!");
    }
}
