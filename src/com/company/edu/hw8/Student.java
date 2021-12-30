package com.company.edu.hw8;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info(){
        return "First name:"+ fullName.firstName+", Last name:"+fullName.lastName+", Age: "+age+", Course: "+course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
