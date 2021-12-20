package com.software.edu.hw08.practicaltask2;

public class Teacher extends Staff{
    private String name;
    private int salary;
    final String TYPE_PERSON;
    public Teacher(String name, int salary, String TAPE_PERSON) {
       this.name = name;
       this.salary = salary;
       this.TYPE_PERSON = TAPE_PERSON;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
    @Override
    public  void print(){
        System.out.println("My name is " + getName() + ", I am a " + getTYPE_PERSON());
    }

    @Override
    public void salary() {
        System.out.println("My salary is " + getSalary() + "$.");
    }
}
