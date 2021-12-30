package com.company.edu.hw8;

public abstract class Person {
     FullName fullName;
     int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String info(){
        return "First name:"+ fullName.firstName+", Last name:"+fullName.lastName+", Age: "+age;
    }
 public abstract String activity();
}
