package com.lect7.oop2.practicaltask.task1;

public class Dog implements Animal {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Dog "+ name +" talking");
    }

    @Override
    public void feed() {
        System.out.println("Dog "+ name+" feeding");
    }
}
