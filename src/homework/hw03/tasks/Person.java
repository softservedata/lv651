package homework.hw03.tasks;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 2021;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 2021;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return 2021-this.birthYear;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear=birthYear;
    }

    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Firts name: ");
        this.firstName = sc.nextLine();
        System.out.println("Last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Birth year: ");
        this.birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + (2021-birthYear));
    }
}
