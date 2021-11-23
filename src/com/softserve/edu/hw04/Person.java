package com.software.edu.hw04;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    public int birthYear;

    public Person(){
        this.firstName = "Vlad";
        this.lastName = "Hryshko";
        this.birthYear = 2003;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getBirthDay() {
        return birthYear;
    }

    public void setBirthDay(int birthDay) {
        this.birthYear = birthDay;
    }

    public void getAge() {
        int year = 2021;
        System.out.println("Age of Person = "+ (year - birthYear));
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter your birthday year: ");
        birthYear = sc.nextInt();
    }

    public void output(){
        System.out.println("\nName of Person:  "+firstName);
        System.out.println("Last Name of Person:  "+lastName);
        System.out.println("Birthday year of Person:  "+ birthYear);
    }

    public void changeName(String firstName,String lastName){
        System.out.print("\nTo change only First name '1'\nTo change only Last name '2'\nTo change First name and Last name '3'\nIf don't want to change,press '0': ");
        boolean  isTrue = true;
        while (isTrue){
            int x;
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x){
                case  1:
                    System.out.print("Type new First name :");
                    firstName = sc.next();
                    this.firstName = firstName;
                    System.out.print("\nIf don't want to change,press '0': ");
                    break;
                case  2:
                    System.out.print("Type new Last name :");
                    lastName = sc.next();
                    this.lastName=lastName;
                    System.out.print("\nIf don't want to change,press '0': ");
                    break;
                case 3:
                    System.out.print("Type new First name :");
                    firstName = sc.next();
                    this.firstName = firstName;

                    System.out.print("Type new Last name :");
                    lastName = sc.next();
                    this.lastName=lastName;
                    System.out.print("\nIf don't want to change,press '0': ");
                    break;
                default:
                    isTrue = false;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return "Person[" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", birthDay =" + birthYear +
                ']';
    }

    public static void main(String[] args) {
        System.out.println("Homework 04");
        System.out.println("\nEnter info about Person 1: ");
        Person person1 = new Person();
        person1.input();
        person1.changeName(person1.firstName, person1.lastName);
        person1.output();
        person1.getAge();

        System.out.println("\nEnter info about Person 2: ");
        Person person2 = new Person();
        person1.input();
        person1.changeName(person2.firstName, person2.lastName);
        person1.output();
        person1.getAge();

        System.out.println("\nEnter info about Person 3: ");
        Person person3 = new Person();
        person1.input();
        person1.changeName(person3.firstName, person3.lastName);
        person1.output();
        person1.getAge();

        System.out.println("\nEnter info about Person 4: ");
        Person person4 = new Person();
        person1.input();
        person1.changeName(person4.firstName, person4.lastName);
        person1.output();
        person1.getAge();

        System.out.println("\nEnter info about Person 5: ");
        Person person5 = new Person();
        person1.input();
        person1.changeName(person5.firstName, person5.lastName);
        person1.output();
        person1.getAge();
    }
}
