package com.softserve.edu.hw08.task1;

abstract public class Person {
    FullName fullName;// nested object
    int age;


    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
   public String info () {
       return "First name: " + fullName.getFirstName() + "Last name: " + fullName.getLastName() +
               "age: " + age;
   }
    public abstract String activity();
}

