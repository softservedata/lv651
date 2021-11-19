package com.OOP.ClassObject;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String FirstName;
    private String LastName;
    private int BirthYear;
    public int year = Year.now().getValue();

    public Person() {

    }

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("What is ur first name? ");
        this.FirstName = s.nextLine();
        System.out.print("What is ur last name? ");
        this.LastName = s.nextLine();
        System.out.print("What is ur date of birth? ");
        this.BirthYear = s.nextInt();
    }

    public int getAge() {
        year = year - this.BirthYear;
        return year;
    }

    public void output() {
        if (year>0) {
            System.out.println("First name: " + FirstName + " || " + "Last name: " + LastName + " || Ages now: " + year);
        } else {
            System.out.println("First name: " + FirstName + " || " + "Last name: " + LastName + " || You can`t be in this ages: " + year);
        }
    }

    public void changeName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is ur first name? ");
        FirstName = sc.nextLine();
        System.out.print("What is ur last name? ");
        LastName = sc.nextLine();
        sc.close();
    }
}
