package com.softserve.nested_innerclasses.homework1;

public class Fullname {
 protected String firstName;
 protected String lastName;


    public Fullname(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Fullname() {
        firstName = "";
        lastName = "";
    }
}
