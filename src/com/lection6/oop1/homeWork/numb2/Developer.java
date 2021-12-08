package com.lection6.oop1.homeWork.numb2;

public class Developer extends Employee{
     private String name;
     private int age;
     private double salary;

     public Developer (String name, int age, double salary){
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     public String report (){
         String s = "Name: " + name + "||\n Age:" + age + "\n Salary: " + salary;
         return s;
     }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
