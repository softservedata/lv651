package com.softserve.edu.homework7;

public abstract class Person extends FullName {
    FullName fullName = new FullName();
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.age = age;
    }
    public Person() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        System.out.println("info() ");
        return " First name: " + firstName + " Last name: " + lastName + " Age: " + age;
    }
    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", FullName=" + fullName +
                ", age=" + age +
                '}';
    }
}
