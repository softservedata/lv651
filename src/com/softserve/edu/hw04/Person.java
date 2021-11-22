package com.softserve.edu.hw04;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    // Default constructor
    public Person() {
        this.firstName = "Vova";
        this.lastName = "Hordeichuk";
        this.birthYear = 2002;
    }

    // Constructor with 2 parameters
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Getters and setters
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


    //methods
    public void getAge()
    {
        int year = 2021;
        System.out.println("Age of Person: " +  (year - birthYear) );

    }
    public  void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = sc.nextInt();
    }
    public void output()
    {
        System.out.println("Person data : \n"+"Name - " + firstName+ "\n" +"Lastname - " + lastName + "\n" +"Birth year - " + birthYear + "\n");
    }

    public void changeName(String firstName, String lastName) {
        System.out.println("To change name press '1'\n"+ "To change lastname press '2'\n" + "To change birth year press '3'\n" + "If don't want to change data press '4'\n");
        boolean n = true;
        while (n) {
            int m;
            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Name of person - " + getFirstName());
                    System.out.print("Type new name - ");
                    firstName = sc.next();
                    this.firstName= firstName;
                    System.out.println("New name - " + firstName);
                    System.out.println("To change name press '1'\n"+ "To change lastname press '2'\n" + "To change birth year press '3'\n" + "If don't want to change data press '4'\n");
                    break;
                case 2:
                    System.out.println("Lastname of person - " + getLastName() );
                    System.out.print("Type new lastname - ");
                    lastName = sc.next();
                    this.lastName= lastName;
                    System.out.println("New lastname - " + lastName);
                    System.out.println("To change name press '1'\n"+ "To change lastname press '2'\n" + "To change birth year press '3'\n" + "If don't want to change data press '4'\n");
                    break;
                case 3:
                    System.out.println("Birth year of person - " + getBirthYear() );
                    System.out.print("Type new Birth year - ");
                    birthYear = sc.nextInt();
                    this.birthYear= birthYear;
                    System.out.println("New Birth year - " + birthYear);
                    int year = 2021;
                    System.out.println("New age of Person: " +  (year - birthYear) );
                    System.out.println("To change name press '1'\n"+ "To change lastname press '2'\n" + "To change birth year press '3'\n" + "If don't want to change data press '4'\n");
                    break;
                case 4:
                    n=false;
                    break;
            }

        }
    }


}


// method Main (5 objects of Person type)
class Main {

    public static void main(String[] args) {
        System.out.println("Enter info about Person 1: ");
        Person person = new Person();
        person.input();
        person.getAge();
        person.changeName(person.getFirstName(), person.getLastName());
        person.output();

        System.out.println("Enter info about Person 2: ");
        Person person2 = new Person();
        person2.input();
        person2.getAge();
        person2.changeName(person2.getFirstName(), person2.getLastName());
        person2.output();

        System.out.println("Enter info about Person 3: ");
        Person person3 = new Person();
        person3.input();
        person3.getAge();
        person3.changeName(person3.getFirstName(), person3.getLastName());
        person3.output();

        System.out.println("Enter info about Person 4: ");
        Person person4 = new Person();
        person4.input();
        person4.getAge();
        person4.changeName(person4.getFirstName(), person4.getLastName());
        person4.output();

        System.out.println("Enter info about Person 5: ");
        Person person5 = new Person();
        person5.input();
        person5.getAge();
        person5.changeName(person5.getFirstName(), person5.getLastName());
        person5.output();
    }

}