package com.softserve.edu.hw04;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Changed person name is: " + this.firstName + " " + this.lastName);
    }

    public int getAge() {
        int year = 2021;
        int age = year - birthYear;
        System.out.println("My age is: " + age);
        return age;
    }

    public void input(int personNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String firstName = scanner.nextLine();
        this.firstName = firstName;

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        this.lastName = lastName;

        System.out.println("Enter birth year: ");
        int birthYear = scanner.nextInt();
        this.birthYear = birthYear;
        System.out.println("Person" + personNumber + " name is: " + firstName + " " + lastName + "birth year is: " + birthYear);

    }

    public void output() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthYear +
                '}';
    }
}






