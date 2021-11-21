package com.softserve.edu.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

//type
public class Person  {
    private String firstName;
    private String lastName;
    private Integer birthYear;

    //constructor
    public Person() {}
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //method
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Integer getBirthYear(){
        return birthYear;
    }
    public Integer getAge(){
        LocalDate d = LocalDate.now();
        return d.getYear() - birthYear;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBirthYear(Integer birthYear){
        this.birthYear = birthYear;
    }
    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your First name:");
        String name = br.readLine();
        this.setFirstName(name);
        System.out.println("Please enter your Last name:");
        String last = br.readLine();
        this.setLastName(last);
        System.out.println("Please enter your Birth year:");
        Integer year = Integer.parseInt(br.readLine());
        this.setBirthYear(year);
    }
    public void output(){
        System.out.println(getFirstName() + " " + getLastName() + ", " + getAge() + " years");
    }
    public void changeNames(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) throws IOException {
        //objects
        Person p1 = new Person();
        p1.input();
        p1.output();
        Person p2 = new Person();
        p2.input();
        p2.output();
        Person p3 = new Person();
        p3.input();
        p3.output();
        Person p4 = new Person();
        p4.input();
        p4.output();
        Person p5 = new Person();
        p5.input();
        p5.output();
    }

}
