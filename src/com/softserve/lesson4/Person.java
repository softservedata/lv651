package com.softserve.lesson4;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public int year = Year.now().getValue();

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter your birth year, please: ");
        birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nBirth year: " + birthYear);
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return year - birthYear;
    }

    public void changeName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new first name: ");
        this.firstName = sc.nextLine();

    }

    public void changeLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new last name: ");
        this.lastName = sc.nextLine();
    }

}
