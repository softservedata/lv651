package com.softserve.edu.hw08.Task01;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public  String info(){
        return "First name: <firstName>, Last name: <lastName>, Age: <age>";
    }
    public abstract String activity();
}
